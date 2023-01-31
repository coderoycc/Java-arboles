
public class NodoEv {
	private Evaluacion e;
	private NodoEv izq,der;
	
	NodoEv()
	{
		izq=der=null;
	}

	public Evaluacion getE() {
		return e;
	}

	public void setE(Evaluacion e) {
		this.e = e;
	}

	public NodoEv getIzq() {
		return izq;
	}

	public void setIzq(NodoEv izq) {
		this.izq = izq;
	}

	public NodoEv getDer() {
		return der;
	}

	public void setDer(NodoEv der) {
		this.der = der;
	}
	

}
