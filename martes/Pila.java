package martes;

import DefensaFinalViernes.AvenidaCalle;

public class Pila {
	private int max = 30;
	private NodoR v[] = new NodoR[max + 1];
	int tope;

	Pila() {
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

	/*void adicionar(AvenidaCalle elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	NodoR eliminar() {
		NodoR elem = new NodoR();
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void vaciar(Pila a) {
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
			//vaciar(aux);
			/*while (!aux.esvacia ())
			{
				 String elem = aux.eliminar ();

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
	}*/
}
