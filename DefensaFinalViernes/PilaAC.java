package DefensaFinalViernes;

public class PilaAC {
	private int max = 30;
	private AvenidaCalle v[] = new AvenidaCalle[max + 1];
	int tope;

	PilaAC() {
		tope = 0;
	}

	boolean esvacia() {
		if (tope == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (tope == max)
			return (true);
		return (false);
	}

	int nroelem() {
		return (tope);
	}

	void adicionar(AvenidaCalle elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	AvenidaCalle eliminar() {
		AvenidaCalle elem = new AvenidaCalle();
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void vaciar(PilaAC a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
	void mostrar ()
	{
		//String elem;
		AvenidaCalle elem;
		if (esvacia ())
			System.out.println ("Pila vacia");
		else
		{
			System.out.println ("\n Datos de la Pila ");
			PilaAC aux = new PilaAC ();
			while (!esvacia ())
			{   
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar();


			}

			while (!aux.esvacia ())
			{
				elem = aux.eliminar ();

				adicionar (elem);
			}
			
		}
	}
	void llenar (int n)
	{
		int i;
		for (i = 1 ; i <= n ; i++)
		{	AvenidaCalle x=new AvenidaCalle();
		    x.Leer();
		    adicionar(x);
		}
	}
    /*
     * public static void llevarLosAprovadosAlPrincipio(PilaEx q) {
		PilaEx aux = new PilaEx();
		PilaEx R = new PilaEx();
		while(!q.esvacia()) {
			Examen x=q.eliminar();
			if(x.getNota()>=51) {
				R.adicionar(x);
			}
			else {
				aux.adicionar(x);
			}
		}
		q.vaciar(R);
		q.vaciar(aux);
		q.mostrar();
	}
     */
	
}
