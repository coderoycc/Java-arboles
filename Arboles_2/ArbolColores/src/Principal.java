
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arbolnormal A=new arbolnormal();
		//A.crear();
		//A.mostrar();
		A.raiz=new nodo();
		A.crear(A.raiz);
		A.preorden(A.raiz);

	}

}
