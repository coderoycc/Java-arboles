package DefensaFinalViernes;

public class NodoZona {
	private String nombre;
	private PilaAC avenidas;
	private PilaAC calles;
	private NodoZona izq,der;
	public NodoZona() {
		izq=der=null;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public PilaAC getAvenidas() {
		return avenidas;
	}
	public void setAvenidas(PilaAC avenidas) {
		this.avenidas = avenidas;
	}
	public PilaAC getCalles() {
		return calles;
	}
	public void setCalles(PilaAC calles) {
		this.calles = calles;
	}
	public NodoZona getIzq() {
		return izq;
	}
	public void setIzq(NodoZona izq) {
		this.izq = izq;
	}
	public NodoZona getDer() {
		return der;
	}
	public void setDer(NodoZona der) {
		this.der = der;
	}
	

}
