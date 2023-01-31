package arbolesMartesArreglado;

import arbolesMartes.Leer;

public class Principal {

	public static void main(String[] args) {
		// 1. 
		ArbolBinarioE A = new ArbolBinarioE();
		A.setRaiz(new NodoE());
		/*A.crear(A.getRaiz());
		System.out.println("Pre Orden--->");
		A.preOrden(A.getRaiz());
		// 2. 
		System.out.println("In Orden--->");
		A.inOrden(A.getRaiz());
		System.out.println("Pos Orden--->");
		A.posOrden(A.getRaiz());
		System.out.println();
		// 3. Contar
		System.out.println("Contar todos las Hojas-->");
		System.out.println(A.contar(A.getRaiz()));
		// 4. msotrar las hojas 
		System.out.println();
		System.out.println("Numero de Hojas--->");
		A.mostraHojas(A.getRaiz());*/

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>>>>>>
		// 5.
		A.crear();
		A.mostrar();
        System.out.println();
		// 6 mostrar a todos los descendientes izquierdos
		//A.DescendietesIzq();
        //A.mostrarIz(A.getRaiz());
		// 7 contar las hojas
        System.out.println();
        //System.out.println("Numero de Hojas---> "+A.nroHojas());
        //System.out.println("Nro de Hojas-->"+A.hojas(A.getRaiz()));
		// 8 mostrar la mayor nota
        System.out.println();
        //System.out.println("Mayor Nota--->"+A.Mayor());
		// 9 mostrar la nota del nombre x
        //System.out.print("Ingrese nombre X: ");
        //A.nombreX(Leer.dato());
		// 10 mostrar el subarbol apartir del nombre x
        //A.mostrarSubArbol(Leer.dato());



	}

}
