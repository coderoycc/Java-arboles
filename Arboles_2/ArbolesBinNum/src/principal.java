
public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABinario A=new ABinario();
		
		//Nodo x=new Nodo();
		//A.setRaiz(x);
		
		//A.crear(A.getRaiz());
		//A.preorden(A.getRaiz());
		A.crear();
		A.mostrar();
		
		//3. cuantos nodos tienen un solo descenciente
		
		//System.out.println("Resultado : "+A.contar(A.getRaiz()));
		//A.contar();
		//4. Completar el arbol 
		System.out.println("Dato a completar : ");
		//A.completar(A.getRaiz(), Leer.dato());
		A.completar(Leer.dato());
		A.mostrar();
		
	}

}
