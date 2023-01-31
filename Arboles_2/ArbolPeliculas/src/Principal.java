
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//RECURSIVOS
		ABNormalP z=new ABNormalP();
		z.raiz=new NodoP();
		z.crear(z.raiz);
		z.preorden(z.raiz);
		//NroNodos
		System.out.print(z.nronodos(z.raiz));
		
		//ITERATIVOS POR NIVELES
		ABNormalP zz=new ABNormalP();
		zz.crear();
		zz.mostrar();
		//1. NroNodos
		System.out.print(zz.nronodos());
		//2. Completar
		//3. Mostrar el ultimo nivel de un arbol
		//4. mostrar las peliculas de z que existen en zz
		//5. mostrar los descendientes derechos del subarbol izquierdo
		
	}

}
