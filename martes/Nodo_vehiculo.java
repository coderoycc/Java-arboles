package martes;

public class Nodo_vehiculo {
	private int idPuma,placa;
	private String conductor;
	private Nodo_vehiculo sig;
	public Nodo_vehiculo() {
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
	public Nodo_vehiculo getSig() {
		return sig;
	}
	public void setSig(Nodo_vehiculo sig) {
		this.sig = sig;
	}
	
}
