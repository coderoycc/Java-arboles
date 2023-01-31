package arbolesMartes;

public class ABinarioE {
	private NodoE raiz;
	public ABinarioE() {
		raiz=null;
	}
	public NodoE getRaiz() {
		return raiz;
	}
	public void setRaiz(NodoE raiz) {
		this.raiz = raiz;
	}
	public void crear(NodoE r) {
		if(r!=null) {
			System.out.print("ingrese el nombre del estudiante: ");
			r.setNom(Leer.dato());
			System.out.print("ingrese el nota del estudiante: ");
			r.setNota(Leer.datoInt());
			System.out.println(r.getNom()+"  Tendra Izq? s/n");
			String resp =Leer.dato();
			if(resp.equals("s")) {
				NodoE nue = new NodoE();
				r.setIzq(nue);
				crear(r.getIzq());

			}
			System.out.println(r.getNom()+"  Tendra Der? s/n");
			resp =Leer.dato();
			if(resp.equals("s")) {
				NodoE nue = new NodoE();
				r.setDer(nue);
				crear(r.getDer());

			}

		}

	}
	public void preorden(NodoE r ) {
		if(r!=null) {
			System.out.print("["+r.getNom()+" , "+r.getNota()+"]~");
			preorden(r.getIzq());
			preorden(r.getDer());
		}

	}
	public void inorden(NodoE r) {
		if(r!=null) {
			preorden(r.getIzq());
			System.out.print("["+r.getNom()+" , "+r.getNota()+"]~");
			preorden(r.getDer());
		}

	}
	public void posorden(NodoE r) {
		if(r!=null) {
			preorden(r.getIzq());
			preorden(r.getDer());
			System.out.print("["+r.getNom()+" , "+r.getNota()+"]~");
		}

	}
	public int contar(NodoE r) {
		if(r!=null) {
			return  contar(r.getIzq())+contar(r.getDer())+1;

		}
		else return 0;
	}
	public void mostrarHojas(NodoE r) {

		if(r!=null) {
			if(r.getIzq()==null && r.getDer()==null) 
				System.out.print("["+r.getNom()+" , "+r.getNota()+"]~");

			mostrarHojas(r.getIzq());
			mostrarHojas(r.getDer());

		}
	}
	void crear ()
	{
		String resp;
		Pila nivel = new Pila ();
		Pila desc = new Pila ();

		//
		NodoE x = new NodoE();
		System.out.print("Datos Raiz-->");
		System.out.print("ingrese nombre: ");
		x.setNom(Leer.dato());
		System.out.print("ingrese nota: ");
		x.setNota(Leer.datoInt());
		setRaiz(x);
		//

		nivel.adicionar(getRaiz());
		System.out.println("***");
		while (!nivel.esvacia ())
		{
			while (!nivel.esvacia ())
			{
				x = nivel.eliminar();
				System.out.print (x.getNom() + "Tendra Izquierda ? S/N");
				resp = Leer.dato();
				if (resp.compareTo ("s") == 0)
				{
					NodoE y = new NodoE();
					System.out.print("Datos-->");
					System.out.print("ingrese nombre: ");
					y.setNom(Leer.dato());
					System.out.print("ingrese nota: ");
					y.setNota(Leer.datoInt());
					x.setIzq(y);
					desc.adicion (y);
				}
				else
					System.out.print (x.getNom() + "Tendra Derecha ? S/N");
				resp = Leer.dato ();
				if (resp.compareTo ("s") == 0)
				{
					NodoE y = new NodoE ();
					System.out.print("Dato-->");
					System.out.print("ingrese nombre: ");
					y.setNom(Leer.dato());
					System.out.print("ingrese nota: ");
					y.setNota(Leer.datoInt());
					x.setDer(y);
					desc.adicion (y);
				}
				
			}
			nivel.vaciar(desc);
		}
	}


	void mostrar ()
	{

		NodoE x;
		Pila nivel = new Pila ();
		Pila desc = new Pila ();

		nivel.adicion (raiz);
		while (!nivel.esvacia ())
		{
			while (!nivel.esvacia ())
			{
				x = nivel.eliminacion ();
				System.out.print ("["+x.getNom()+" , "+ x.getNom()+"]");

				if (x.getIzq() != null)
					desc.adicion (x.getIzq());
				if (x.getDer() != null)
					desc.adicion (x.getDer());
			}
			System.out.println ();
			nivel.vaciar(desc);
		}
	}
	public static void main(String[] args) {
		System.out.print("ingrese nota: ");
	}

}
