class manejo
{
    public static void contar(arbolnormal a)
    {
    	int c=0;
    	nodo x;
    	Pila nivel= new Pila();
    	Pila desc=new Pila();
    	nivel.adicion(a.raiz);
    	while(!nivel.esvacia())
    	{
    		while(!nivel.esvacia())
    		{
    			x=nivel.eliminacion();
    			if(x.dato.verif())
    			   c=c+1;
    			if(x.izq!=null)
    			  desc.adicion(x.izq);
    			if(x.der!=null)
    			  desc.adicion(x.der);  
    		}
    		nivel.vaciar(desc);
    	}
    	System.out.print(c);
    	
    }
    public static void main (String args [])
    {
	arbolnormal a=new arbolnormal();
	a.crear();
	a.mostrar();
	contar(a);
	
    }
}
