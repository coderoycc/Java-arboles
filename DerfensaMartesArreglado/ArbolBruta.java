package DerfensaMartesArreglado;

public class ArbolBruta {
	private NodoABruta raiz;
	public ArbolBruta() {
		raiz=null;
	}
	public NodoABruta getRaiz() {
		return raiz;
	}
	public void setRaiz(NodoABruta raiz) {
		this.raiz = raiz;
	}
	public void crear(NodoABruta r) {
		if(r !=null) {
			System.out.print("Ingrese numero de rutas: ");
			r.setNro(Leer.datoInt());
			System.out.print("Ingrese lugar de la ruta: ");
			r.setLugar(Leer.dato());
			System.out.print("Ingrese zona de la ruta: ");
			r.setZona(Leer.dato());
			System.out.print("--> "+r.getNro()+" Tendra izquierda? s/n -->");
			String resp = Leer.dato();
			if(resp.equals("s")) {
				NodoABruta nue = new NodoABruta();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			System.out.print("--> "+r.getNro()+" Tendra derecha? s/n -->");
			resp = Leer.dato();
			if(resp.equals("s")) {
				NodoABruta nue = new NodoABruta();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
	}
	public void preOrden(NodoABruta r) {
		if(r!=null) {
			System.out.print("[ "+r.getNro()+" ~ "+r.getLugar()+" ~ "+r.getZona()+" ]" );
			preOrden(r.getIzq());
			preOrden(r.getDer());
		}		
	}
	public void inOrden(NodoABruta r) {
		if (r != null) {
			inOrden(r.getIzq());
			System.out.print("[ "+r.getNro()+" ~ "+r.getLugar()+" ~ "+r.getZona()+" ]" );
			inOrden(r.getDer());
		}
	}

	public void posOrden(NodoABruta r) {
		if (r != null) {
			posOrden(r.getIzq());
			posOrden(r.getDer());
			System.out.print("[ "+r.getNro()+" ~ "+r.getLugar()+" ~ "+r.getZona()+" ]" );
		}
	}
	public int contar(NodoABruta r) {
		if(r!=null) {
			return contar(r.getIzq()) + contar(r.getDer()) + 1;
		}
		return 0;
	}
	public void mostraHojas(NodoABruta r) {
		if(r!=null) {
			mostraHojas(r.getIzq());
			mostraHojas(r.getDer());
			if(r.getDer() == null && r.getIzq() == null)
				System.out.print("[ "+r.getNro()+" ~ "+r.getLugar()+" ~ "+r.getZona()+" ]" );

		}

	}
	public void crear() {
		String resp;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		NodoABruta x = new NodoABruta();
		System.out.println("Dato Raiz-->");
		System.out.print("Ingrese numero de rutas: ");
		x.setNro(Leer.datoInt());
		System.out.print("Ingrese lugar de la ruta: ");
		x.setLugar(Leer.dato());
		System.out.print("Ingrese zona de la ruta: ");
		x.setZona(Leer.dato());
		setRaiz(x);
		nivel.adicionar(getRaiz());
		while(!nivel.esvacia()) {
			while(!nivel.esvacia()) {
				x = nivel.eliminar();
				System.out.print(x.getNro()+" Tendra Izquierda ? s/n -->");
				resp =Leer.dato();
				if (resp.compareTo("s") == 0 || resp.equals("S")) {
					NodoABruta y = new NodoABruta();
					System.out.print("Dato-->");
					System.out.println();
					System.out.print("Ingrese numero de rutas: ");
					y.setNro(Leer.datoInt());
					System.out.print("Ingrese lugar de la ruta: ");
					y.setLugar(Leer.dato());
					System.out.print("Ingrese zona de la ruta: ");
					y.setZona(Leer.dato());
					x.setIzq(y);
					desc.adicionar(y);
				}
				else
					x.setIzq(null);
				System.out.print(x.getNro() + " Tendra Derecha ? s/n ");
				resp = Leer.dato();
				if (resp.compareTo("s") == 0 || resp.equals("S")) {
					NodoABruta y = new NodoABruta();
					System.out.print("Dato-->");
					System.out.println();
					System.out.print("Ingrese numero de rutas: ");
					y.setNro(Leer.datoInt());
					System.out.print("Ingrese lugar de la ruta: ");
					y.setLugar(Leer.dato());
					System.out.print("Ingrese zona de la ruta: ");
					y.setZona(Leer.dato());
					x.setDer(y);
					desc.adicionar(y);
				} else
					x.setDer(null);
			}
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());

		}

	}
	void mostrar() {
		NodoABruta x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				System.out.print("[ "+x.getNro()+" ~ "+x.getLugar()+" ~ "+x.getZona()+" ]" );
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
	public int nro() {
		int c = 0;
		NodoABruta x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				c = c + 1;
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}
		return c;
	}

}
