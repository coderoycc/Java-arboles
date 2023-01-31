package DerfensaMartesArreglado;

public class NodoVehiculo {
	private int idPuma,placa;
	private String conductor;
	private NodoVehiculo sig;
	public NodoVehiculo() {
		sig=null;
	}
	public int getIdPuma() {
		return idPuma;
	}
	public void setIdPuma(int idPuma) {
		this.idPuma = idPuma;
	}
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(int placa) {
		this.placa = placa;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	public NodoVehiculo getSig() {
		return sig;
	}
	public void setSig(NodoVehiculo sig) {
		this.sig = sig;
	}

}
