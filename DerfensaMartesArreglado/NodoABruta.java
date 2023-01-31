package DerfensaMartesArreglado;

public class NodoABruta {
	private int nro;
	private String lugar,zona;
	private NodoABruta izq,der;
	public NodoABruta() {
		izq=der=null;
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
	public NodoABruta getIzq() {
		return izq;
	}
	public void setIzq(NodoABruta izq) {
		this.izq = izq;
	}
	public NodoABruta getDer() {
		return der;
	}
	public void setDer(NodoABruta der) {
		this.der = der;
	}
	
}
