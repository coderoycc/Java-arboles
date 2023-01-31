
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbinarioC A=new AbinarioC();
		//1
		/*NodoC w=new NodoC();
		A.setRaiz(w);
		A.crear(A.getRaiz());
		A.preorden(A.getRaiz());
		//2 existe la cadena X?
		if(A.verifica(A.getRaiz(), Leer.dato()))
			System.out.print("existe");
		else
			System.out.print("NOOOO existe");
		//3 Completar el arbol a los nodos que tienen un solo desc
		A.completar(A.getRaiz());
		A.preorden(A.getRaiz());*/
		//4
		A.crear();
		A.mostrar();
		//5 existe la cadena X?
		if(A.verifica(Leer.dato()))
			System.out.print("existe");
		else
			System.out.print("NOOOO existe");
		//6 Completar el arbol a los nodos que tienen un solo desc
		A.completar();
		A.mostrar();
		//7 Sea el arbol A mostrar el subarbol izquierdo
		//8 Sea el arbol A mostrar el i-esimo nivel
	}

}
