package DefensaFinalViernes;

public class AvenidaCalle {
	private String nombre;
	private int nroKm;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroKm() {
		return nroKm;
	}
	public void setNroKm(int nroKm) {
		this.nroKm = nroKm;
	}
	public void Leer() {
		System.out.print("Ingrese nombre : ");
		nombre=Leer.dato();
		System.out.print("Ingrese nro km: ");
		nroKm=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println("< "+nombre+" ~ "+nroKm+" >");
	}

}
