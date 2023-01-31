
public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABinarioEval A=new ABinarioEval();
		A.setRaiz(new NodoEv());
		
		A.crear(A.getRaiz());
		A.preorden(A.getRaiz());
		//4. mostrar aprobados
		A.aprobados(A.getRaiz());
		
		
	}

}
