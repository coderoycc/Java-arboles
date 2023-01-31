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
	System.out.print("Dato Raiz-->");
	x.dato = Leer.datoInt ();
	raiz = x;
	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		System.out.print (x.dato + "Tendra Izquierda ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    nodo y = new nodo ();
		    System.out.print("Dato-->");
		    y.dato = Leer.datoInt ();
		    x.izq = y;
		    desc.adicion (y);
		}
		else
		    x.izq = null;
		System.out.print (x.dato + "Tendra Derecha ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    nodo y = new nodo ();
		    System.out.print("Dato-->");
		    y.dato = Leer.datoInt ();
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
		System.out.print (x.dato + " ");

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
	    System.out.print (x.dato + " ");
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
		    System.out.print (x.dato + " ");

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
    
//PROCESOS RECURSIVOS
    
    void crear(nodo r)
    {
	if(r!=null)
	{
		System.out.print("Introducir Dato-->");
		r.dato=Leer.datoInt();
		System.out.print(r.dato+" Tendra Izq ? S/N");
		String resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			nodo nue=new nodo();
			r.izq=nue;
			crear(r.izq);
		}
		System.out.print(r.dato+" Tendra Der ? S/N");
		resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			nodo nue=new nodo();
			r.der=nue;
			crear(r.der);
		}
	}
	
    }
    void preorden (nodo r)
    {
      if(r!=null)
      {
	  System.out.println(r.dato+"");
	  preorden(r.izq);
	  preorden(r.der);
      }
    }

    void inorden (nodo r)
    {
	if (r != null)
	{
	    inorden (r.izq);
	    System.out.print (r.dato+"  ");
	    inorden (r.der);
	}
    }

}
