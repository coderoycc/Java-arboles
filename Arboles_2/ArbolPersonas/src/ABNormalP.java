class ABNormalP extends ArbolBinarioP
{
    ABNormalP ()
    {
	super ();
    }


    boolean esvacia ()
    {
	if (raiz == null)
	    return true;
	return false;
    }


    void crear ()
    {
	String resp;
	Pila nivel = new Pila ();
	Pila desc = new Pila ();

	NodoP x = new NodoP ();
	System.out.print("Persona Raiz-->");
	x.A=new Persona();
	x.A.leer();
	raiz = x;
	
	nivel.adicion (raiz);
	
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		x.A.mostrar();
		System.out.print ("Tendra Izquierda ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    NodoP y = new NodoP ();
		    System.out.print("Persona-->");
		    y.A=new Persona();
		    y.A.leer();
		    
		    x.izq = y;
		    desc.adicion (y);
		}
		else
		    x.izq = null;
		
		x.A.mostrar();
		System.out.print ("Tendra Derecha ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    NodoP y = new NodoP ();
		    System.out.print("Persona-->");
		    y.A=new Persona();
		    y.A.leer();
		    x.der = y;
		    desc.adicion (y);
		}
		else
		    x.der = null;
	    }
	    
	    nivel.vaciar(desc);
	    
	}
    }


    void mostrar ()
    {

	NodoP x;
	Pila nivel = new Pila ();
	Pila desc = new Pila ();

	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		x.A.mostrar();

		if (x.izq != null)
		    desc.adicion (x.izq);
		if (x.der != null)
		    desc.adicion (x.der);
	    }
	    System.out.println ();
	    nivel.vaciar(desc);
	}
    }


    void preorden ()
    {
	Pila aux = new Pila ();
	NodoP x;
	aux.adicion (null);
	x = raiz;
	while (x != null)
	{
	    if (x.der != null)
		aux.adicion (x.der);
	    
	    x.A.mostrar();
	    
	    if (x.izq != null)
		x = x.izq;
	    else
		x = aux.eliminacion ();
	}
    }
    void mostrarEdad(int x)
    {
    	NodoP w;
    	Pila nivel = new Pila ();
    	Pila desc = new Pila ();

    	nivel.adicion (raiz);
    	while (!nivel.esvacia ())
    	{
    	    while (!nivel.esvacia ())
    	    {
	    		w = nivel.eliminacion ();
	    		if(w.A.getEdad()==x)
	    		    w.A.mostrar();

	    		if (w.izq != null)
	    		    desc.adicion (w.izq);
	    		if (w.der != null)
	    		    desc.adicion (w.der);
    	    }
    	    System.out.println ();
    	    nivel.vaciar(desc);
    	}
    }
    void mostraredad2(int k)
    {
    	Pila aux = new Pila ();
    	NodoP x;
    	aux.adicion (null);
    	x = raiz;
    	while (x != null)
    	{
    	    if (x.der != null)
    		aux.adicion (x.der);
    	    
    	    if(x.A.getEdad()==k)
    	    	x.A.mostrar();
    	    
    	    if (x.izq != null)
    		x = x.izq;
    	    else
    		x = aux.eliminacion ();
    	}
    }
   //1.- Mostrar todos los nodos descendientes derechos
   //2.- Mostrar las hojas del nivel k
   //3.- Mostrar el ultimo nivel
   //4.- Sea un objeto Persona W, completar el arbol con W
   //5.- Cuantos nodos tienen nietos? 
    
    
    

}
