class ABNormalF extends ArbolF
{
    ABNormalF ()
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

	nodoF x = new nodoF ();
	System.out.print("Nodo Raiz-->");
	x.f.leer();
	raiz = x;
	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		System.out.print (x.f.getNom() + "Tendra Izquierda ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    nodoF y = new nodoF ();
		    System.out.print("Dato-->");
		    y.f.leer();
		    x.izq = y;
		    desc.adicion (y);
		}
		else
		    x.izq = null;
		System.out.print (x.f.getNom() + "Tendra Derecha ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    nodoF y = new nodoF ();
		    System.out.print("Dato-->");
		    y.f.leer();
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

	nodoF x;
	Pila nivel = new Pila ();
	Pila desc = new Pila ();

	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		System.out.print ( " ");

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
	nodoF x;
	aux.adicion (null);
	x = raiz;
	while (x != null)
	{
	    if (x.der != null)
		aux.adicion (x.der);
	    System.out.print ( " ");
	    if (x.izq != null)
		x = x.izq;
	    else
		x = aux.eliminacion ();
	}
    }


    int nroelem ()
    {
	nodoF x;
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

	nodoF x;
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
		    System.out.print ( " ");

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
    
    void crear(nodoF r)
    {
	if(r!=null)
	{
		System.out.print("Introducir Dato-->");
		r.f.leer();
		System.out.print(" Tendra Izq ? S/N");
		String resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			nodoF nue=new nodoF();
			r.izq=nue;
			crear(r.izq);
		}
		System.out.print(" Tendra Der ? S/N");
		resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			nodoF nue=new nodoF();
			r.der=nue;
			crear(r.der);
		}
	}
	
    }
    void preorden (nodoF r)
    {
      if(r!=null)
      {
	  System.out.println("");
	  preorden(r.izq);
	  preorden(r.der);
      }
    }

    void inorden (nodoF r)
    {
	if (r != null)
	{
	    inorden (r.izq);
	    System.out.print ("  ");
	    inorden (r.der);
	}
    }

}
