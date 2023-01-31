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
	x.color = Leer.dato ();
	raiz = x;
	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		System.out.print (x.color + "Tendra Izquierda ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    nodo y = new nodo ();
		    System.out.print("Dato-->");
		    y.color = Leer.dato ();
		    x.izq = y;
		    desc.adicion (y);
		}
		else
		    x.izq = null;
		System.out.print (x.color + "Tendra Derecha ? S/N");
		resp = Leer.dato ();
		if (resp.compareTo ("s") == 0)
		{
		    nodo y = new nodo ();
		    System.out.print("Dato-->");
		    y.color = Leer.dato ();
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

	nodo x;
	Pila nivel = new Pila ();
	Pila desc = new Pila ();

	nivel.adicion (raiz);
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
		x = nivel.eliminacion ();
		System.out.print (x.color + " ");

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


    
//PROCESOS RECURSIVOS
    
    void crear(nodo r)
    {
	if(r!=null)
	{
		System.out.print("Introducir Dato-->");
		r.color=Leer.dato();
		System.out.print(r.color+" Tendra Izq ? S/N");
		String resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			nodo nue=new nodo();
			r.izq=nue;
			crear(r.izq);
		}
		System.out.print(r.color+" Tendra Der ? S/N");
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
	  System.out.println(r.color+" ");
	  preorden(r.izq);
	  preorden(r.der);
      }
    }

    void inorden (nodo r)
    {
	if (r != null)
	{
	    inorden (r.izq);
	    System.out.print (r.color+"  ");
	    inorden (r.der);
	}
    }

}
