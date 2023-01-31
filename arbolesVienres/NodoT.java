package arbolesVienres;

public class NodoT {
	private int coef,exp;
	private NodoT izq,der;
	public NodoT() {
		izq=der=null;
	}
	public int getCoef() {
		return coef;
	}
	public void setCoef(int coef) {
		this.coef = coef;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public NodoT getIzq() {
		return izq;
	}
	public void setIzq(NodoT izq) {
		this.izq = izq;
	}
	public NodoT getDer() {
		return der;
	}
	public void setDer(NodoT der) {
		this.der = der;
	}

}
