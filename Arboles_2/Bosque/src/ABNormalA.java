class ABNormalA extends ArbolA
{
    ABNormalA ()
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
	Pila2 nivel = new Pila2 ();
	Pila2 desc = new Pila2 ();

	NodoA x = new NodoA ();
	System.out.print("Dato Raiz-->");
	x.a.crear();
	raiz = x;
	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		System.out.print ( "Tendra Izquierda ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    NodoA y = new NodoA ();
		    System.out.print("Arbol-->");
		    y.a.crear();
		    x.izq = y;
		    desc.adicion (y);
		}
		else
		    x.izq = null;
		System.out.print ( "Tendra Derecha ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    NodoA y = new NodoA ();
		    System.out.print("Arbol-->");
		    y.a.crear();
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

	NodoA x;
	Pila2 nivel = new Pila2 ();
	Pila2 desc = new Pila2 ();

	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		System.out.print (  " ");

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
	Pila2 aux = new Pila2 ();
	NodoA x;
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
	NodoA x;
	Pila2 nivel = new Pila2 ();
	Pila2 desc = new Pila2 ();
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

	NodoA x;
	int niv = 0;
	Pila2 nivel = new Pila2 ();
	Pila2 desc = new Pila2 ();

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
    
    void crear(NodoA r)
    {
	if(r!=null)
	{
		System.out.print("Introducir Dato-->");
		r.a.crear();
		System.out.print(" Tendra Izq ? S/N");
		String resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			NodoA nue=new NodoA();
			r.izq=nue;
			crear(r.izq);
		}
		System.out.print(" Tendra Der ? S/N");
		resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			NodoA nue=new NodoA();
			r.der=nue;
			crear(r.der);
		}
	}
	
    }
    void preorden (NodoA r)
    {
      if(r!=null)
      {
	  System.out.println("");
	  preorden(r.izq);
	  preorden(r.der);
      }
    }

    void inorden (NodoA r)
    {
	if (r != null)
	{
	    inorden (r.izq);
	    System.out.print ("  ");
	    inorden (r.der);
	}
    }

}
