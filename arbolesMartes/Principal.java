package arbolesMartes;

public class Principal {

	public static void main(String[] args) {
		// 1.
		ABinarioE A= new ABinarioE();
		/*A.setRaiz(new NodoE());
		A.crear(A.getRaiz());
		A.preorden(A.getRaiz());
        // 2 inorden, posorden
		System.out.println();
		A.inorden(A.getRaiz());
		System.out.println();
		A.posorden(A.getRaiz());
		
		// 3 contar
		System.out.println();
		System.out.println("cantidad--> "+A.contar(A.getRaiz()));
		
		//4  mostrar las hojas
		A.mostrarHojas(A.getRaiz());*/
		//5
		A.crear();
		A.mostrar();
		
		// 6 mostrar a todos los descendientes izquierdos 
		// 7 contar las hojas
		// 8 mostrar la mayor nota
		// 9 mostrar la nota del nombre x
		// 10 mostrar el subarbol apartir del nombre x
	}

}
