package DerfensaMartesArreglado;

public class Pila {
	private int max = 30;
	private NodoABruta v[] = new NodoABruta[max + 1];
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

	void adicionar(NodoABruta elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	NodoABruta eliminar() {
		NodoABruta elem = new NodoABruta();
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
}
