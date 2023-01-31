package DerfensaMartesArreglado;

public class LineaPumaK {
	private String nombreLinea;
	private ArbolBruta ida,vuelta;
	private ListaVehiculo vehiculos;
	public String getNombreLinea() {
		return nombreLinea;
	}
	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}
	public ArbolBruta getIda() {
		return ida;
	}
	public void setIda(ArbolBruta ida) {
		this.ida = ida;
	}
	public ArbolBruta getVuelta() {
		return vuelta;
	}
	public void setVuelta(ArbolBruta vuelta) {
		this.vuelta = vuelta;
	}
	public ListaVehiculo getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(ListaVehiculo vehiculos) {
		this.vehiculos = vehiculos;
	}
	public void Leer() {
		System.out.print("Ingrese nombre Linea: ");
		nombreLinea=Leer.dato();
		System.out.println();
		ida= new ArbolBruta();
		System.out.println("Arbol de Ruta<------->IDA");
		System.out.println();
		ida.crear();
		vuelta = new ArbolBruta();
		System.out.println("Arbol de Ruta<------->VUELTA");
		System.out.println();
		vuelta.crear();
		System.out.println();
		System.out.println("<-----Lista de Vehiculos----->");
		vehiculos = new ListaVehiculo();
		System.out.print("Ingrese el numero de vehiculos: ");
		vehiculos.leer(Leer.datoInt());

	}
	public void mostrar() {
		System.out.println("----------------------------------------------------------->>>>>");
		System.out.println();
        System.out.println();
		System.out.println("Linea Puma Katari");
		System.out.println();
		System.out.println("Nombre de la Linea: "+nombreLinea);
		System.out.println();
		System.out.println("Arbol de Ruta<------->IDA");
		System.out.println();
		ida.mostrar();
		System.out.println("Arbol de Ruta<------->VUELTA");
		System.out.println();
		vuelta.mostrar();
		System.out.println();
		System.out.println("<-----Lista de Vehiculos----->");
		vehiculos.mostrar();
		System.out.println();
        System.out.println();
		System.out.println("----------------------------------------------------------->>>>>");
		
	}


}
