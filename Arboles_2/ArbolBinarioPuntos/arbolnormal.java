class arbolnormal extends arbol
{
    arbolnormal ()
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

	nodo x = new nodo ();
	System.out.print("Punto Raiz-->");
	x.dato.leer();
	raiz = x;
	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		x.dato.mostrar();
		System.out.print ( " Tendra Izquierda ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    nodo y = new nodo ();
		    System.out.print("Punto-->");
		    y.dato.leer ();
		    x.izq = y;
		    desc.adicion (y);
		}
		else
		    x.izq = null;
		x.dato.mostrar();
		System.out.print (" Tendra Derecha ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    nodo y = new nodo ();
		    System.out.print("Punto-->");
		    y.dato.leer();
		    x.der = y;
		    desc.adicion (y);
		}
		else
		    x.der = null;
	    }
	    while (!desc.esvacia ())

		nivel.adicion (desc.eliminacion ());
	}
    }


    void mostrar ()
    {

	nodo x;
	Pila nivel = new Pila ();
	Pila desc = new Pila ();

	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		x.dato.mostrar();

		if (x.izq != null)
		    desc.adicion (x.izq);
		if (x.der != null)
		    desc.adicion (x.der);
	    }
	    System.out.println ();
	    while (!desc.esvacia ())

		nivel.adicion (desc.eliminacion ());
	}
    }


    void preorden ()
    {
	Pila aux = new Pila ();
	nodo x;
	aux.adicion (null);
	x = raiz;
	while (x != null)
	{
	    if (x.der != null)
		aux.adicion (x.der);
	    x.dato.mostrar();
	    if (x.izq != null)
		x = x.izq;
	    else
		x = aux.eliminacion ();
	}
    }


    int nroelem ()
    {
	nodo x;
	Pila nivel = new Pila ();
	Pila desc = new Pila ();
	int ne = 0;
	if (esvacia ())
	    return ne;
	else
	{
	    nivel.adicion (raiz);
	    while (!nivel.esvacia ())
	    {
		while (!nivel.esvacia ())
		{
		    x = nivel.eliminacion ();
		    ne++;
		    if (x.izq != null)
			desc.adicion (x.izq);
		    if (x.der != null)
			desc.adicion (x.der);
		}
		System.out.println ();
		while (!desc.esvacia ())

		    nivel.adicion (desc.eliminacion ());
	    }
	    return (ne);
	}
    }

//proceso recursivo
    void inorden (nodo r)
    {
	if (r != null)
	{
	    
	    inorden (r.izq);
	    
	    inorden (r.der);
	    r.dato.mostrar();
	}
    }


    void hojas ()
    {

	nodo x;
	int niv = 0;
	Pila nivel = new Pila ();
	Pila desc = new Pila ();

	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    System.out.println ("\n Nivel :" + niv);
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		if (x.izq == null && x.der == null)
		    x.dato.mostrar();

		if (x.izq != null)
		    desc.adicion (x.izq);
		if (x.der != null)
		    desc.adicion (x.der);
	    }
	    System.out.println ();
	    while (!desc.esvacia ())
		nivel.adicion (desc.eliminacion ());
	    niv++;
	}
    }
}


