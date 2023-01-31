package DerfensaMartesArreglado;


public class Principal {

	public static void main(String[] args) {
		ColaLineas A = new ColaLineas();
		System.out.print("Ingrese numero de colas de lineas: ");
		A.llenar(Leer.datoInt());
		A.mostrar();
		// Mostrar la ruta de ida y la ruta de vuelta de la linea  con nombre x
		System.out.println();
		//System.out.print("Ingresar nombre Linea X: ");		
		//mostrarX(A,Leer.dato());
		// Mostrar Las lineas y sus Vehiculos con el menor numero de paradas
		//MostrarLineasyVehiculos(A);


	}

	public static void MostrarLineasyVehiculos(ColaLineas A) {
		ColaLineas aux = new ColaLineas();
		int men=10000;
		while(!A.esvacia()) 
		{
            LineaPumaK l = A.eliminar();
            int paradas = l.getIda().nro() + l.getVuelta().nro();
            if(paradas<men) {
            	men=paradas;
            }
            aux.adicionar(l);
		}
		A.vaciar(aux);
		while(!A.esvacia()) 
		{
            LineaPumaK w = A.eliminar();
            int paradas = w.getIda().nro() + w.getVuelta().nro();
            if(paradas==men) {
            	System.out.println("Nombre de Linea: "+w.getNombreLinea());
            	System.out.println();
            	System.out.println("Vehiculos: -->");
            	System.out.println();
            	w.getVehiculos().mostrar();
            }
            aux.adicionar(w);
		}
		A.vaciar(aux);
		

	}

	public static void mostrarX(ColaLineas A, String x) {
		ColaLineas aux = new ColaLineas();
		while(!A.esvacia()) {
			LineaPumaK k = A.eliminar();
			if(k.getNombreLinea().equals(x)) {
				System.out.println();
				System.out.println("IDA: ");
				k.getIda().mostrar();
				System.out.println();
				System.out.println("VUELTA: ");
				k.getVuelta().mostrar();
			}
			aux.adicionar(k);
		}
		A.vaciar(aux);
	}

}
