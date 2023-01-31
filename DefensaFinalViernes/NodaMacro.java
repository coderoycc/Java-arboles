package DefensaFinalViernes;

public class NodaMacro {
	private String nom;
	private ABinarioZona A;
	private NodaMacro sig;
	public NodaMacro() {
		sig=null;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ABinarioZona getA() {
		return A;
	}
	public void setA(ABinarioZona a) {
		A = a;
	}
	public NodaMacro getSig() {
		return sig;
	}
	public void setSig(NodaMacro sig) {
		this.sig = sig;
	}


}
