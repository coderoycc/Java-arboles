class ABusqueda extends arbol
{
    ABusqueda ()
    {
	super ();
    }


    boolean esvacia ()
    {
	if (raiz == null)
	    return true;
	return false;
    }


    void agrega (mat2x2 e)
    {
    	nodo x = new nodo ();
    	nodo y;
	x.m = e;
	if (esvacia ())
	    raiz = x;
	else
	{
	    int sw = 0;
	    y = raiz;
	    while (sw == 0)
	    {
		if (e.suma() > y.m.suma())
		{
		    if (y.der != null)
			y = y.der;
		    else
		    {
			y.der = x;
			sw = 1;
		    }
		}
		else
		{
		    if(e.suma()<y.m.suma())
		    {
			    if (y.izq != null)
				   y = y.izq;
			    else
			    {
				  y.izq = x;
				  sw = 1;
			    }
		    }	 
		    else
		    {	System.out.print("ya existe...."); 
		        sw=1;
		    }
		}
	    }

	}

    }
    void cargar()
    {
    	String resp;
    	do{
    		System.out.print("matriz");
    		mat2x2 x=new mat2x2();
    		x.llenar(); x.mostrar();
    		agrega(x);
    		System.out.print("Desea continuar cargando...S/N?");
    		resp=Leer.dato();
    		
    	}while(resp.equals("s"));
    }

    public void r_Niveles ()
    {
	Pila nivel = new Pila ();
	Pila desc = new Pila ();

	nodo x;
	nivel.adicion (raiz);
	int i = 0;
	while (!nivel.esvacia ())
	{
	    System.out.println ("Nivel : " + i);
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		x.m.mostrar();
		if (x.izq != null)
		    desc.adicion (x.izq);

		if (x.der != null)
		    desc.adicion (x.der);
	    }
	    while (!desc.esvacia ())
	    	nivel.adicion (desc.eliminacion ());
	    System.out.println (" ");
	    i = i + 1;
	}
    }


    public void busqueda (mat2x2 x)
    {
    nodo y;
	y = raiz;
	
	while (y != null)
	{
	    if (x.suma() < y.m.suma())
	    {
		  if (y.izq == null)
		    System.out.print ("No se encuentra");

		  y = y.izq;
	    }
	    else
	    {
		if (x.suma() > y.m.suma())
		{
		    if (y.der == null)
			System.out.print ("No se encuentra");

		    y = y.der;

		}
		else
		{
		    System.out.print ("El dato se encuentra en el arbol");
		    y = null;
		}
	    }
	}
    }


   
    public void inserta (mat2x2 x)
    {
    	nodo y;
	y = raiz;
	int sw = 0;
	while (y != null && sw == 0)
	{
	    if (x.suma() < y.m.suma())
	    {
		if (y.izq == null)
		{
			nodo w = new nodo ();
		    w.m = x;
		    y.izq = w;
		    sw = 1;
		}
		else
		    y = y.izq;

	    }
	    else
	    {
		if (x.suma() > y.m.suma())
		{
		    if (y.der == null)
		    {
		    	nodo w = new nodo ();
				w.m = x;
				y.der = w;
				sw = 1;
			}
		    else
			y = y.der;
		}
		else
		{
		    System.out.print ("El nodo ya existe en el arbol");
		    sw = 1;
		}
	    }
	}
    }



}


