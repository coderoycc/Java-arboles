
public class ABinario {
	private Nodo raiz;
	
	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	ABinario()
	{
		raiz=null;
	}
	
	//recursivos
	void crear(Nodo r)
    {
	if(r!=null)
	{
		System.out.print("Introducir Dato-->");
		r.setDato(Leer.datoInt());
		
		System.out.print(r.getDato()+" Tendra Izq ? S/N");
		String resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			Nodo nue=new Nodo();
			r.setIzq(nue);
			crear(r.getIzq());
		}
		
		System.out.print(r.getDato()+" Tendra Der ? S/N");
		resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			Nodo nue=new Nodo();
			r.setDer(nue);
			crear(r.getDer());
		}
	}
	
    }
    void preorden (Nodo r)//Rid
    {
      if(r!=null)
      {
	  System.out.println(r.getDato()+", ");
	  preorden(r.getIzq());
	  preorden(r.getDer());
      }
    }
    // iterativos
    void crear ()
    {
	String resp;
	Pila nivel = new Pila ();
	Pila desc = new Pila ();

	Nodo x = new Nodo ();
	System.out.print("Dato Raiz-->");
	x.setDato(Leer.datoInt ());
	raiz = x;
	
	nivel.adicion (raiz);
	
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
			x = nivel.eliminacion ();
			System.out.print (x.getDato() + "Tendra Izquierda ? S/N");
			resp = Leer.dato ();
			
			if (resp.compareTo ("s") == 0)
			{
			    Nodo y = new Nodo ();
			    System.out.print("Dato-->");
			    y.setDato( Leer.datoInt ());
			    x.setIzq(y);
			    
			    desc.adicion (y);
			}
			
			System.out.print (x.getDato() + "Tendra Derecha ? S/N");
			resp = Leer.dato ();
			if (resp.compareTo ("s") == 0)
			{
			    Nodo y = new Nodo ();
			    System.out.print("Dato-->");
			    y.setDato(Leer.datoInt ());
			    x.setDer(y);
			    desc.adicion (y);
			}
		
	    }
	    nivel.vaciar(desc);
	}
    }


    void mostrar ()
    {

	
		Pila nivel = new Pila ();
		Pila desc = new Pila ();
	
		nivel.adicion (raiz);
		
		while (!nivel.esvacia ())
		{
		    while (!nivel.esvacia ())
		    {
				Nodo x = nivel.eliminacion ();
				System.out.print (x.getDato() + " ");
		
				if (x.getIzq() != null)
				    desc.adicion (x.getIzq());
				if (x.getDer() != null)
				    desc.adicion (x.getDer());
			}
			    
		    System.out.println ();
			    
			nivel.vaciar(desc);
		}
    }


}
