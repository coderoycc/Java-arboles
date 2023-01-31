class ABinario extends Arbol
{
    ABinario ()
    {
	super ();
    }


    public boolean esVacia ()
    {
	if (R == null)
	    return (true);
	else
	    return (false);
    }




    public NodoA raiz ()
    {
	return (R);
    }


    public void cargar ()
    {
	PilaN nivel = new PilaN ();
	PilaN desc = new PilaN ();
	String resp;
	NodoA y;
	NodoA x = new NodoA ();
	System.out.print ("Nodo Raiz : ");
	x.dato = Leer.datoInt ();
	R = x;
	nivel.adicion (R);

	while (!nivel.esVacia ())
	{
	    while (!nivel.esVacia ())
	    {
		y = nivel.eliminacion ();
		System.out.print ("Nodo : " + y.dato + "  Tendra Izq S/N?");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    NodoA w = new NodoA ();
		    System.out.print("Dato Izq :");
		    w.dato = Leer.datoInt ();
		    y.izq = w;
		    desc.adicion (w);
		}
		System.out.print (" Nodo : " + y.dato + "Tendra Der S/N?");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    NodoA z = new NodoA ();
		    System.out.print("Dato Der :");
		    z.dato = Leer.datoInt ();
		    y.der = z;
		    desc.adicion (z);
		}
	    }
	    nivel.vaciar (desc);
	}
    }


    //Recorridos por niveles desde la raiz

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


    //Recorrido por niveles a partir del nodo X
    public void r_Niveles (NodoA x)
    {
	PilaN aux = new PilaN ();
	PilaN p = new PilaN ();

	p.adicion (x);

	while (p.nroElementos () != 0)
	{
	    while (p.nroElementos () != 0)
	    {
		x = p.eliminacion ();
		System.out.print ("  " + x.dato);
		if (x.izq != null)
		    aux.adicion (x.izq);

		if (x.der != null)
		    aux.adicion (x.der);
	    }
	    p.vaciar (aux);
	    System.out.println (" ");

	}
    }


    public void r_preOrden1 ()
    {
	System.out.println ("\nRecorrido preorden ");
	PilaN p = new PilaN ();
	p.adicion (null);
	NodoA x = R;
	while (x != null)
	{
	    System.out.print (x.dato + "  ");
	    if (x.der != null)
		p.adicion (x.der);
	    if (x.izq != null)
		x = x.izq;
	    else
		x = p.eliminacion ();
	}
    }


    void r_preOrden2 ()
    {
	System.out.println ("\nRecorrido preorden ");
	PilaN p = new PilaN ();
	NodoA x;
	p.adicion (R);
	while (!p.esVacia ())
	{
	    x = p.eliminacion ();
	    System.out.print (x.dato + "  ");
	    if (x.der != null)
		p.adicion (x.der);
	    if (x.izq != null)
		p.adicion (x.izq);
	}
    }


    public void r_inOrden ()
    {
	System.out.println ("\nRecorrido inorden ");
	PilaN p = new PilaN ();
	p.adicion (null);
	NodoA x = R;
	while (p.nroElementos () != 0)
	{
	    while (x != null)
	    {
		p.adicion (x);
		x = x.izq;
	    }
	    x = p.eliminacion ();
	    if (x != null)
	    {
		System.out.print (x.dato + "  ");
		x = x.der;
	    }
	}
    }


    public void r_postOrden ()
    {
	System.out.println ("\nRecorrido postorden ");
	PilaN p = new PilaN ();

	NodoA x = R;
	p.adicion (null);
	while (p.nroElementos () != 0)
	{
	    while (x != null)
	    {
		p.adicion (x);
		if (x.der != null)
		{
		    p.adicion (x.der);
		    p.adicion (null);
		}
		x = x.izq;
	    }
	    x = p.eliminacion ();
	    while (x != null)
	    {
		System.out.print (x.dato + "  ");
		x = p.eliminacion ();
	    }
	    if (p.nroElementos () != 0)
	    {
		x = p.eliminacion ();
	    }
	}
    }



    public int nodosNivel (int k)
    {
	PilaN aux = new PilaN ();
	PilaN p = new PilaN ();
	int c = 0;
	int y = 0;
	NodoA x;
	p.adicion (R);
	while (p.nroElementos () != 0)
	{

	    while (p.nroElementos () != 0)
	    {
		x = p.eliminacion ();
		if (c == k)
		    y++;
		if (x.izq != null)
		    aux.adicion (x.izq);

		if (x.der != null)
		    aux.adicion (x.der);
	    }
	    p.vaciar (aux);
	    c++;
	}
	return (y);
    }


    public int nroNodosHoja ()
    {
	PilaN p = new PilaN ();
	p.adicion (null);
	int c = 0;
	NodoA x = R;
	while (x != null)
	{
	    if (x.izq == null && x.der == null)
		c = c + 1;
	    if (x.der != null)
		p.adicion (x.der);
	    if (x.izq != null)
		x = x.izq;
	    else
		x = p.eliminacion ();
	}
	return (c);
    }
}
