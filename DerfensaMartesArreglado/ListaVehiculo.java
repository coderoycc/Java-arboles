package DerfensaMartesArreglado;

public class ListaVehiculo {
	private NodoVehiculo p;

	public NodoVehiculo getP() {
		return p;
	}

	public void setP(NodoVehiculo p) {
		this.p = p;
	}
	ListaVehiculo(){
		p=null;
	}
	public void adifinal(int idPuma, int Placa , String conductor ) {

		NodoVehiculo nuevo = new NodoVehiculo();
		nuevo.setIdPuma(idPuma);
		nuevo.setPlaca(Placa);
		nuevo.setConductor(conductor);
		if (getP()==null) {
			setP(nuevo);
		}
		else {
			NodoVehiculo r =getP();
			while(r.getSig()!=null)    // solo tiene una sentencia por eso no tiene llaves
				r=r.getSig();
			r.setSig(nuevo);

		}
	}
	public void leer(int n) {
		int idPuma,placa;
		String  conductor;
		for (int i = 1; i <=n; i++) 
		{   System.out.print("Ingrese el id del vehiculo: "); 
		    idPuma=Leer.datoInt();
		    System.out.print("Ingrese Placa del vehiculo: ");
		    placa=Leer.datoInt();
		    System.out.print("Ingrese Conductor del vehiculo: ");
		    conductor=Leer.dato();	
		    adifinal(idPuma,placa,conductor);
		}
	}
	public void mostrar() {
		NodoVehiculo r = getP();
		while(r!=null) {
			System.out.print("[ "+r.getIdPuma()+" ~ "+r.getPlaca()+" ~ "+r.getConductor()+" ]-");
			r=r.getSig();
		}

	}
}
