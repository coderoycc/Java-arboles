class manejo
{
	public static void mostratf(ABNormalF a,String x)
	{
		if(a!=null)
		{
			
		}
	}
    public static void main (String args [])
    {
	ABNormalA a=new ABNormalA();
	a.crear();
	a.mostrar();
	System.out.println("Recorrido preorden :");
	a.preorden();
	System.out.println("Nro de nodos : "+ a.nroelem());
	System.out.println("recorrido Inorden");
	a.inorden(a.raiz);
	System.out.println("\nHojas del arbol por niveles");
	a.hojas();
	
	
    }
}
