
public class Evaluacion {
	private String nom;
	private int nota;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public void leer()
	{
		nom=Leer.dato();
		nota=Leer.datoInt();
	}
	public void mostrar()
	{
		System.out.print("("+nom+", "+nota+") ");
	}

}
