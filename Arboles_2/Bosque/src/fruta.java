
public class fruta {
	private String nom;
	private String color;
	private int precio;
	public void leer()
	{
		System.out.println("Ingrese nom de fruta ");
		nom=Leer.dato();
		System.out.println("Ingrese color de fruta ");
		color=Leer.dato();
		System.out.println("Ingrese precio de fruta ");
		precio=Leer.datoInt();
	}
	public void mostrar()
	{
		System.out.println("datos de  fruta ");
		System.out.println(nom+" " +color+" "+precio);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
