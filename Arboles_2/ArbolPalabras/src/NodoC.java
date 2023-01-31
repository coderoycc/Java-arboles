
public class NodoC {
	private String palabra;
	NodoC izq,der;
	NodoC()
	{
		izq=der=null;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public NodoC getIzq() {
		return izq;
	}
	public void setIzq(NodoC izq) {
		this.izq = izq;
	}
	public NodoC getDer() {
		return der;
	}
	public void setDer(NodoC der) {
		this.der = der;
	}
	

}
