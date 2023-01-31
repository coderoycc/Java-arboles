package arbolesVienres;

public class Principal {

	public static void main(String[] args) {
		// 1.
		ArbolT Q = new ArbolT();
		// Primero mandar raiz
		//Q.setRaiz(new NodoT());
		//Q.crear(Q.getRaiz());
		System.out.println();
		//Q.preOrden(Q.getRaiz());
		System.out.println(); 
		// 2. inOrden, posOrden
		//Q.inOrden(Q.getRaiz());
		System.out.println();
		//Q.posOrden(Q.getRaiz());
		// 3. mostrar a los terminos con exponente Z
		//System.out.println("Ingrese exponente Z");
		//Q.expZ(Q.getRaiz(),Leer.datoInt());
		// 4. verificar si existe el termino  aX^b
		//System.out.println("Ingrese a,b");
		/*if(Q.veriT(Q.getRaiz(),Leer.datoInt(),Leer.datoInt()))
			System.out.println("Si existe el termino!");*/
		// interativo
		// 5.
		Q.crear();
		Q.mostrar();
		System.out.println();
		// 6. mostrar a los terminos con exponente Z
		System.out.println("Ingrese Z: ");
		Q.expZ(Leer.datoInt());
		// 7. verificar si existe el termino  aX^b
		System.out.println();
		System.out.println("Ingrese a,b: ");
		Q.veriT(Leer.datoInt(),Leer.datoInt());
		
		

	}

	

}
