package martes;

public class LineaPumaK {
	private String nombreLinea;
	private Arbol_ida a = new Arbol_ida();
	private Arbol_ida b = new Arbol_ida();;
	private LSimple_Vehiculo c = new LSimple_Vehiculo();;
	public LineaPumaK() {
		Arbol_ida a = new Arbol_ida();
		Arbol_ida b = new Arbol_ida();
		LSimple_Vehiculo c = new LSimple_Vehiculo();
	}
	public String getNombreLinea() {
		return nombreLinea;
	}
	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}
	public Arbol_ida getA() {
		return a;
	}
	public void setA(Arbol_ida a) {
		this.a = a;
	}
	
	public Arbol_ida getB() {
		return b;
	}
	public void setB(Arbol_ida b) {
		this.b = b;
	}
	public LSimple_Vehiculo getC() {
		return c;
	}
	public void setC(LSimple_Vehiculo c) {
		this.c = c;
	}
    public void leer() {
    	System.out.println();
		System.out.print("ingrese nombreLinea: ");
		nombreLinea = Leer.dato();
		System.out.println();
		Arbol_ida a = new Arbol_ida();
		a.setRaiz(new NodoR());
		a.crear(a.getRaiz());
		System.out.println();
		Arbol_ida b = new Arbol_ida();
		b.setRaiz(b.getRaiz());
		b.crear(b.getRaiz());
		System.out.println();
		LSimple_Vehiculo c = new LSimple_Vehiculo();
		System.out.println("ingrese n elemtos a lista: ");
		c.leer(Leer.datoInt());
	}
    public void mostrar() {
		System.out.println(nombreLinea);
		System.out.println();
		//a.mostrar();
		System.out.println();
		//b.mostrar();
		System.out.println();
		c.mostrar();

	}
}
