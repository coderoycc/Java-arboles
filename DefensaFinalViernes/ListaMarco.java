package DefensaFinalViernes;

public class ListaMarco {
	private NodaMacro p;

	public NodaMacro getP() {
		return p;
	}

	public void setP(NodaMacro p) {
		this.p = p;
	}
	ListaMarco(){
		p=null;
	}
	public void adifinal(String nombreM,ABinarioZona A ) {

		NodaMacro nuevo = new NodaMacro();
		nuevo.setNom(nombreM);
		nuevo.setA(A);
		if (getP()==null) {
			setP(nuevo);
		}
		else {
			NodaMacro r =getP();
			while(r.getSig()!=null)    // solo tiene una sentencia por eso no tiene llaves
				r=r.getSig();
			r.setSig(nuevo);

		}
	}
	public void leer(int n) {
		String  nombreM;
		for (int i = 1; i <=n; i++) 
		{   System.out.print("Ingrese nombre del macro distrito: "); 
		    nombreM=Leer.dato();
		    ABinarioZona A = new ABinarioZona();
		    A.crear();
		    adifinal(nombreM,A);
		}
	}
	public void mostrar() {
		NodaMacro r = getP();
		while(r!=null) {
			System.out.println();
			System.out.println("nombre del macrodistrito de la paz: "+r.getNom());
			r.getA().mostrar();
			r=r.getSig();
		}

	}
}
