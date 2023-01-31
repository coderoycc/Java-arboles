package arbolesMartesArreglado;

public class Pila {
	private int max = 30;
	private NodoE v[] = new NodoE[max + 1];
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

	void adicionar(NodoE elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
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

	void vaciar(Pila a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
