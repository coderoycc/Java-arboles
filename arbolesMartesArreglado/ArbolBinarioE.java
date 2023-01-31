package arbolesMartesArreglado;

import arbolesMartes.Leer;

public class ArbolBinarioE {
	private NodoE raiz;
	public ArbolBinarioE() {
		raiz=null; 
	}
	public NodoE getRaiz() {
		return raiz;
	}
	public void setRaiz(NodoE raiz) {
		this.raiz = raiz;
	}
	public void crear(NodoE r) {
		if(r !=null) {
			System.out.print("Ingrese nombre: ");
			r.setNom(Leer.dato());
			System.out.print("Ingrese nota: ");
			r.setNota(Leer.datoInt());
			System.out.print(r.getNom()+" Tendra izquierda? s/n -->");
			String resp = Leer.dato();
			if(resp.equals("s")) {
				NodoE nue = new NodoE();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			System.out.print(r.getNom()+" Tendra derecha? s/n -->");
			resp = Leer.dato();
			if(resp.equals("s")) {
				NodoE nue = new NodoE();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
	}
	public void preOrden(NodoE r) {
		if(r!=null) {
			System.out.print("[ "+r.getNom()+" ~ "+r.getNota()+" ]" );
			preOrden(r.getIzq());
			preOrden(r.getDer());
		}		
	}
	public void inOrden(NodoE r) {
		if (r != null) {
			inOrden(r.getIzq());
			System.out.print("[ "+r.getNom()+" ~ "+r.getNota()+" ]" );
			inOrden(r.getDer());
		}
	}

	public void posOrden(NodoE r) {
		if (r != null) {
			posOrden(r.getIzq());
			posOrden(r.getDer());
			System.out.print("[ "+r.getNom()+" ~ "+r.getNota()+" ]" );
		}
	}
	public int contar(NodoE r) {
		if(r!=null) {
			return contar(r.getIzq()) + contar(r.getDer()) + 1;
		}
		return 0;
	}
	public void mostraHojas(NodoE r) {
		if(r!=null) {
			mostraHojas(r.getIzq());
			mostraHojas(r.getDer());
			if(r.getDer() == null && r.getIzq() == null)
				System.out.println("[ "+r.getNom()+" ~ "+r.getNota()+" ]" );

		}

	}
	public void crear() {
		String resp;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		NodoE x = new NodoE();
		System.out.println("Dato Raiz-->");
		System.out.print("Ingrese nombre: ");
		x.setNom(Leer.dato());
		System.out.print("Ingrese nota: ");
		x.setNota(Leer.datoInt());
		setRaiz(x);
		nivel.adicionar(getRaiz());
		while(!nivel.esvacia()) {
			while(!nivel.esvacia()) {
				x = nivel.eliminar();
				System.out.print(x.getNom()+" Tendra Izquierda ? s/n -->");
				resp =Leer.dato();
				if (resp.compareTo("s") == 0 || resp.equals("S")) {
					NodoE y = new NodoE();
					System.out.print("Dato-->");
					System.out.print("Ingrese nombre: ");
					y.setNom(Leer.dato());
					System.out.print("Ingrese nota: ");
					y.setNota(Leer.datoInt());
					x.setIzq(y);
					desc.adicionar(y);
				}
				else
					x.setIzq(null);
				System.out.print(x.getNom() + " Tendra Derecha ? s/n ");
				resp = Leer.dato();
				if (resp.compareTo("s") == 0 || resp.equals("S")) {
					NodoE y = new NodoE();
					System.out.print("Dato-->");
					System.out.print("Ingrese nombre: ");
					y.setNom(Leer.dato());
					System.out.print("Ingrese nota: ");
					y.setNota(Leer.datoInt());
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
		NodoE x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				System.out.print("[ "+x.getNom()+" ~ "+x.getNota()+" ]   " );
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
	public void DescendietesIzq() {
		NodoE x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				if(x.getIzq()!=null) {
					System.out.print("[ "+x.getIzq().getNom()+" ~ "+x.getIzq().getNota()+" ]   " );
				}
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
	public int nroHojas() {
		int c=0;
		NodoE x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				if(x.getIzq()==null && x.getDer()==null) 
					c=c+1;

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
	public int Mayor() {
		int may=0;
		NodoE x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				if(x.getNota()>may) 
					may=x.getNota();
				if (x.getIzq() != null) 
					desc.adicionar(x.getIzq());

				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}
		return may;
	}
	public void nombreX(String nombreX) {
		NodoE x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				if(x.getNom().equals(nombreX))
					System.out.print("[ "+x.getNota()+" ]   " );
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
	public void mostrarSubArbol(String nombreX) {
		NodoE x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				if(x.getNom().equals(nombreX))
					preOrden(x);
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
	public void mostrarIz(NodoE r) {
		if(r!=null) {
			if( r.getIzq() != null)
				System.out.println("[ "+r.getIzq().getNom()+" ~ "+r.getIzq().getNota()+" ]" );
			mostrarIz(r.getIzq());
			mostrarIz(r.getDer());


		}

	}
	public int hojas(NodoE r) {

		if(r!=null) {
			int c = hojas(r.getIzq())+hojas(r.getDer());
			if(r.getDer() == null && r.getIzq() == null)
				c=c+1;
			return c;

		}
		else return 0;
	}


}
