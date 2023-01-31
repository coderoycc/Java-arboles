package martes;

public class NodoR {
	private int nro;
	private String lugar,zona;
	private NodoR izq,der;
	public NodoR() {
		izq = der = null;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public NodoR getIzq() {
		return izq;
	}
	public void setIzq(NodoR izq) {
		this.izq = izq;
	}
	public NodoR getDer() {
		return der;
	}
	public void setDer(NodoR der) {
		this.der = der;
	}

}
