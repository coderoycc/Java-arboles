
public class Nodo {
	private String palabra;
	private Nodo izq,der;
	
	Nodo()
	{
		izq=der=null;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String dato) {
		this.palabra = dato;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}
	

}
