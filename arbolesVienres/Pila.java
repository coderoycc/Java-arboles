package arbolesVienres;

public class Pila {
	private int max = 50;
	private NodoT v[] = new NodoT[max + 1];
	int top;

	Pila() {
		top = 0;
	}

	boolean esvacia() {
		if (top == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (top == max)
			return (true);
		return (false);
	}

	int nroelem() {
		return (top);
	}

	void adicionar(NodoT elem) {
		if (!esllena()) {
			top++;
			v[top] = elem;
		} else
			System.out.println("Pila llena");
	}

	NodoT eliminar() {
		NodoT elem = new NodoT();
		if (!esvacia()) {
			elem = v[top];
			top--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void vaciar(Pila a) {
		while (!a.esvacia())
			adicionar(a.eliminar());
	}
}
