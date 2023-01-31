package arbolesMartesArreglado;

public class NodoE {
	// Atributos del Nodo Estudiante
	private String nom;
	private int nota;
	private NodoE izq,der;
	// Constructor
	public NodoE() {
		izq=der=null;
	}
	// getter's y setter's
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public NodoE getIzq() {
		return izq;
	}
	public void setIzq(NodoE izq) {
		this.izq = izq;
	}
	public NodoE getDer() {
		return der;
	}
	public void setDer(NodoE der) {
		this.der = der;
	}
	
	

}
