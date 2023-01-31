
public class Persona {
	private String nom;
	private int edad;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void leer()
	{
		nom=Leer.dato();
		edad=Leer.datoInt();
	}
	public void mostrar()
	{
		System.out.print(nom+" "+edad);
	}
	

}
