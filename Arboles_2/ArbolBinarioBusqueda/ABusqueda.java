class ABusqueda extends Arbol
{
    ABusqueda ()
    {
	super ();
    }


    boolean esvacia ()
    {
	if (R == null)
	    return true;
	return false;
    }


    void carga (int e)
    {
	NodoA x = new NodoA ();
	NodoA y;
	x.dato = e;
	if (esvacia ())
	    R = x;
	else
	{
	    int sw = 0;
	    y = R;
	    while (sw == 0)
	    {
		if (e > y.dato)
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
		    if (y.izq != null)
			y = y.izq;
		    else
		    {
			y.izq = x;
			sw = 1;
		    }
		}
	    }

	}

    }


    public void r_Niveles ()
    {
	PilaN nivel = new PilaN ();
	PilaN desc = new PilaN ();

	NodoA x;
	nivel.adicion (R);
	int i = 0;
	while (!nivel.esVacia ())
	{
	    System.out.print ("Nivel : " + i);
	    while (!nivel.esVacia ())
	    {
		x = nivel.eliminacion ();
		System.out.print ("  " + x.dato);
		if (x.izq != null)
		    desc.adicion (x.izq);

		if (x.der != null)
		    desc.adicion (x.der);
	    }
	    nivel.vaciar (desc);
	    System.out.println (" ");
	    i = i + 1;
	}
    }


    public void busqueda (int x)
    {
	NodoA y;
	y = R;
	while (y != null)
	{
	    if (x < y.dato)
	    {
		if (y.izq == null)
		    System.out.print ("No se encuentra");

		y = y.izq;
	    }
	    else
	    {
		if (x > y.dato)
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


   
    public void inserta (int x)
    {
	NodoA y;
	y = R;
	int sw = 0;
	while (y != null && sw == 0)
	{
	    if (x < y.dato)
	    {
		if (y.izq == null)
		{
		    NodoA w = new NodoA ();
		    w.dato = x;
		    y.izq = w;
		    sw = 1;
		}
		else
		    y = y.izq;

	    }
	    else
	    {
		if (x > y.dato)
		{
		    if (y.der == null)
		    {
			NodoA w = new NodoA ();
			w.dato = x;
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


