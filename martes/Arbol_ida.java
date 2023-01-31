package martes;

public class Arbol_ida {
	private NodoR raiz;
	public Arbol_ida() {
		raiz=null;
	}
	public NodoR getRaiz() {
		return raiz;
	}
	public void setRaiz(NodoR raiz) {
		this.raiz = raiz;
	}
	public void crear(NodoR r) {
		if(r!=null) {
			System.out.print("ingrese nro: ");
			r.setNro(Leer.datoInt());
			System.out.print("ingrese LUGAR: ");
			r.setLugar(Leer.dato());
			System.out.print("ingrese ZONA: ");
			r.setZona(Leer.dato());
			System.out.println(r.getNro()+"  Tendra Izq? s/n");
			String resp =Leer.dato();
			if(resp.equals("s")) {
				NodoR nue = new NodoR();
				r.setIzq(nue);
				crear(r.getIzq());

			}
			System.out.println(r.getNro()+"  Tendra Der? s/n");
			resp =Leer.dato();
			if(resp.equals("s")) {
				NodoR nue = new NodoR();
				r.setDer(nue);
				crear(r.getDer());

			}

		}

	}
	public void preorden(NodoR r ) {
		if(r!=null) {
			System.out.print ("[ "+r.getNro()+" ~ "+ r.getLugar()+" ~ "+r.getZona()+" ]");
			preorden(r.getIzq());
			preorden(r.getDer());
		}

	}
	/*void crear ()
	{
		String resp;
		Pila nivel = new Pila ();
		Pila desc = new Pila ();

		//
		NodoR x = new NodoR();
		System.out.print("Datos Raiz-->");
		System.out.print("ingrese nro: ");
		x.setNro(Leer.datoInt());
		System.out.print("ingrese LUGAR: ");
		x.setLugar(Leer.dato());
		System.out.print("ingrese ZONA: ");
		x.setZona(Leer.dato());
		setRaiz(x);
		//

		nivel.adicionar(getRaiz());
		System.out.println("***");
		while (!nivel.esvacia ())
		{
			while (!nivel.esvacia ())
			{
				x = nivel.eliminar();
				System.out.print (x.getNro() + "Tendra Izquierda ? S/N");
				resp = Leer.dato();
				if (resp.compareTo ("s") == 0)
				{
					NodoR y = new NodoR();
					System.out.print("Datos-->");
					System.out.print("ingrese nro: ");
					y.setNro(Leer.datoInt());
					System.out.print("ingrese LUGAR: ");
					y.setLugar(Leer.dato());
					System.out.print("ingrese ZONA: ");
					y.setZona(Leer.dato());
					x.setIzq(y);
					desc.adicionar (y);
				}
				else
					System.out.print (x.getNro() + "Tendra Derecha ? S/N");
				resp = Leer.dato ();
				if (resp.compareTo ("s") == 0)
				{
					NodoR y = new NodoR ();
					System.out.print("Dato-->");
					System.out.print("ingrese nro: ");
					y.setNro(Leer.datoInt());
					System.out.print("ingrese LUGAR: ");
					y.setLugar(Leer.dato());
					System.out.print("ingrese ZONA: ");
					y.setZona(Leer.dato());
					x.setDer(y);
					desc.adicionar (y);
				}

			}
			nivel.vaciar(desc);
		}
	}


	void mostrar ()
	{

		NodoR x;
		Pila nivel = new Pila ();
		Pila desc = new Pila ();

		nivel.adicionar (raiz);
		while (!nivel.esvacia ())
		{
			while (!nivel.esvacia ())
			{
				x = nivel.eliminar();
				System.out.print ("[ "+x.getNro()+" ~ "+ x.getLugar()+" ~ "+x.getZona()+" ]");

				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println ();
			nivel.vaciar(desc);
		}
	}*/
}
