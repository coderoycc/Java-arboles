package martes;

public class LSimple_Vehiculo {
	private Nodo_vehiculo p;
	public LSimple_Vehiculo() {
		p=null;
	}
	public Nodo_vehiculo getP() {
		return p;
	}
	public void setP(Nodo_vehiculo p) {
		this.p = p;
	}
	public void adifinal(int a, int b , String c ) {

		Nodo_vehiculo nuevo = new Nodo_vehiculo();
		nuevo.setIdPuma(a);
		nuevo.setPlaca(b);
		nuevo.setConductor(c);

		if (getP()==null) {
			setP(nuevo);
		}
		else {
			Nodo_vehiculo r =getP();
			while(r.getSig()!=null)    // solo tiene una sentencia por eso no tiene llaves
				r=r.getSig();
			r.setSig(nuevo);

		}
	}
	public void leer(int n) {
		String c;
		int id=0,p=0;
		for (int i = 1; i <=n; i++) 
		{   System.out.print("ingrese idPuma: "); 
		    id=Leer.datoInt();
		    System.out.print("ingrese Placa: ");
		    p=Leer.datoInt();
		    System.out.print("ingrese conductor: ");
		    c=Leer.dato();
		    adifinal(id,p,c);
		}
	}
	public void mostrar() {
		Nodo_vehiculo r = getP();
		while(r!=null) {
			System.out.print("[ "+r.getIdPuma()+" ~ "+r.getPlaca()+" ~ "+r.getConductor()+" ]-");
			r=r.getSig();
		}

	}

}
