class manejo
{
    public static void main (String args [])
    {
	arbolnormal a=new arbolnormal();
	a.crear();
	a.mostrar();
	System.out.println("Recorrido preorden :");
	a.preorden();
	System.out.println("Nro de nodos : "+ a.nroelem());
	System.out.println("recorrido Inorden");
	a.inorden(a.raiz);
	System.out.println("\nHojas del arbol por niveles");
	a.hojas();
	
	/*arbolnormal a=new arbolnormal();
	
	a.raiz=new nodo();
	a.crear(a.raiz);
	a.mostrar();
	a.preorden();*/
    }
}
