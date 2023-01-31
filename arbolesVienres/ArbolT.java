package arbolesVienres;

public class ArbolT {
	private NodoT raiz;
	public ArbolT() {
		raiz=null;
	}
	public NodoT getRaiz() {
		return raiz;
	}
	public void setRaiz(NodoT raiz) {
		this.raiz = raiz;
	}
	// METODOS RECURSIVOS -----> RECORRIDOS EN PROFUNDIDAD
	// crear recursivo
	public void crear(NodoT r) {
		if(r!=null) 
		{   System.out.print("Ingrese coeficiente: "); 
		r.setCoef(Leer.datoInt());
		System.out.print("Ingrese exponente: ");
		r.setExp(Leer.datoInt());
		System.out.println(r.getCoef()+"x^"+r.getExp()+" -->Tendra Izquierdo? s/n");
		String resp = Leer.dato();
		if(resp.equals("s") || resp.equals("S")) 
		{
			NodoT nue = new NodoT();
			r.setIzq(nue);
			crear(r.getIzq());
		}
		System.out.println(r.getCoef()+"x^"+r.getExp()+" -->Tendra Derecho? s/n");
		resp = Leer.dato();
		if(resp.equals("s") || resp.equals("S")) 
		{
			NodoT nue = new NodoT();
			r.setDer(nue);
			crear(nue);
		}


		}

	}
	// mostrar recursivo
	// mostrar pre Orden
	public void preOrden(NodoT r) {
		if(r!=null) {
			System.out.print("[ "+r.getCoef()+"X^"+r.getExp()+" ]" );
			preOrden(r.getIzq());
			preOrden(r.getDer());
		}		
	}
	// mostrar in Orden 
	public void inOrden(NodoT r) {
		if (r != null) {
			inOrden(r.getIzq());
			System.out.print("[ "+r.getCoef()+"X^"+r.getExp()+" ]" );
			inOrden(r.getDer());
		}
	}
	// mostrar pos Orden
	public void posOrden(NodoT r) {
		if (r != null) {
			posOrden(r.getIzq());
			posOrden(r.getDer());
			System.out.print("( "+r.getCoef()+"X^"+r.getExp()+" )" );
		}
	}
	public void expZ(NodoT r,int Z) {
		if(r!=null) {
			if(r.getExp()==Z)
				System.out.print("[ "+r.getCoef()+"X^"+r.getExp()+" ]" );
			expZ(r.getIzq(),Z);
			expZ(r.getDer(),Z);
		}

	}
	public boolean veriT(NodoT r, int a, int b) {

		if(r!=null) {
			if(r.getExp()==b && r.getCoef()==a)
				return true;
			return (veriT(r.getIzq(),a,b) || veriT(r.getDer(),a,b));
		}else
			return false;
	}
	// METODOS ITERATIVOS -----> RECORRIDOS EN AMPLITUD

	// crear iterativo
	public void crear() {
		String resp;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		NodoT x = new NodoT();
		System.out.println("Dato Raiz-->");
		System.out.print("Ingrese coeficiente: ");
		x.setCoef(Leer.datoInt());
		System.out.print("Ingrese exponente: ");
		x.setExp(Leer.datoInt());
		setRaiz(x);
		nivel.adicionar(getRaiz());
		while(!nivel.esvacia()) 
		{
			while(!nivel.esvacia()) 
			{
				x = nivel.eliminar();
				System.out.print(x.getCoef()+"X^"+x.getExp()+" ---> Tendra Izquierda ? s/n -->");
				resp =Leer.dato();
				if (resp.compareTo("s") == 0 || resp.equals("S")) 
				{
					NodoT y = new NodoT();
					System.out.println("Dato--->");
					System.out.print("Ingrese coeficiente: ");
					y.setCoef(Leer.datoInt());
					System.out.print("Ingrese exponente: ");
					y.setExp(Leer.datoInt());
					x.setIzq(y);
					desc.adicionar(y);
				}
				/*else
					x.setIzq(null);*/
				System.out.print(x.getCoef()+"X^"+x.getExp()+" ---> Tendra Derecha ? s/n -->");
				resp = Leer.dato();
				if (resp.compareTo("s") == 0 || resp.equals("S"))
				{
					NodoT y = new NodoT();
					System.out.println("Dato-->");
					System.out.print("Ingrese coeficiente: ");
					y.setCoef(Leer.datoInt());
					System.out.print("Ingrese exponente: ");
					y.setExp(Leer.datoInt());
					x.setDer(y);
					desc.adicionar(y);
				}/* else
					x.setDer(null);*/
			}
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());

		}

	}
	void mostrar() {
		NodoT x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				System.out.print("[ "+x.getCoef()+"X^"+x.getExp()+" ]" );
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}
	}
	public void expZ(int Z) {
		NodoT x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				if(x.getExp()==Z)
					System.out.print("[ "+x.getCoef()+"X^"+x.getExp()+" ]" );
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}

	}
	public void veriT(int a, int b) {
		NodoT x;
		Pila nivel = new Pila();
		Pila desc = new Pila();
        boolean sw=false;
		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				if(x.getExp()==b && x.getCoef()==a)
					sw=true;
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}
		if(sw)
			System.out.println("Exite el termino!");
		
	}


}
