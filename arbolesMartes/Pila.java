package arbolesMartes;

public class Pila {
	private int max;
	private NodoE v[] = new NodoE[max+1];
	private int tope;
	public Pila() {
		
	}
	boolean esvacia ()
	{
		if (tope == 0)
			return (true);
		return (false);
	}


	boolean esllena ()
	{
		if (tope == max)
			return (true);
		return (false);
	}


	void adicion (NodoE elem)
	{
		if (!esllena ())
		{
			tope++;
			v [tope] = elem;
		}
		else
			System.out.println ("Pila llena");
	}

	NodoE eliminar() {
		NodoE elem = new NodoE();
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}
	public void adicionar(NodoE elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}
	NodoE eliminacion ()
	{
		NodoE elem = null;
		if (!esvacia ())
		{
			elem = v [tope];
			tope--;

		}
		else
			System.out.println ("Pila vacia");
		return (elem);
	}
	public void vaciar(Pila Z) {
		while(!Z.esvacia()) {
			adicion(Z.eliminacion());
		}
	}


}
