
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
		System.out.print("Introducir palabra-->");
		r.setPalabra(Leer.dato());
		
		System.out.print(r.getPalabra()+" Tendra Izq ? S/N");
		String resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			Nodo nue=new Nodo();
			r.setIzq(nue);
			crear(r.getIzq());
		}
		
		System.out.print(r.getPalabra()+" Tendra Der ? S/N");
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
	  System.out.println(r.getPalabra()+", ");
	  preorden(r.getIzq());
	  preorden(r.getDer());
      }
    }
    
    int contar(Nodo r)
    {
    	if(r!=null)
    	{
    		int k=contar(r.getIzq())+contar(r.getDer());
    		
    		if(r.getIzq()!=null && r.getDer()==null)
    			k++;
    		if(r.getIzq()==null && r.getDer()!=null)
    			k++;
    		
    		return k;
    	}
    	else
    		return 0;
    }
    void completar (Nodo r, String x)//Rid
    {
      if(r!=null)
      {
    	  if(r.getIzq()!=null && r.getDer()==null)
    	  {
    		  Nodo nue=new Nodo();
    		  nue.setPalabra(x);
    		  r.setDer(nue);
    	  }
  		  if(r.getIzq()==null && r.getDer()!=null)
  		  {
  			Nodo nue=new Nodo();
	  		  nue.setPalabra(x);
	  		  r.setIzq(nue);
  		  }
  		
    	  
  		completar(r.getIzq(),x);
  		completar(r.getDer(),x);
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
	x.setPalabra(Leer.dato ());
	raiz = x;
	
	nivel.adicion (raiz);
	
	while (!nivel.esvacia ())
	{
	    while (!nivel.esvacia ())
	    {
			x = nivel.eliminacion ();
			System.out.print (x.getPalabra() + "Tendra Izquierda ? S/N");
			resp = Leer.dato ();
			
			if (resp.compareTo ("s") == 0)
			{
			    Nodo y = new Nodo ();
			    System.out.print("Palabra-->");
			    y.setPalabra( Leer.dato ());
			    x.setIzq(y);
			    
			    desc.adicion (y);
			}
			
			System.out.print (x.getPalabra() + "Tendra Derecha ? S/N");
			resp = Leer.dato ();
			if (resp.compareTo ("s") == 0)
			{
			    Nodo y = new Nodo ();
			    System.out.print("Dato-->");
			    y.setPalabra(Leer.dato ());
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
				System.out.print (x.getPalabra() + " ");
		
				if (x.getIzq() != null)
				    desc.adicion (x.getIzq());
				if (x.getDer() != null)
				    desc.adicion (x.getDer());
			}
			    
		    System.out.println ();
			    
			nivel.vaciar(desc);
		}
    }
    void contar ()
    {
    	int k=0;
	
		Pila nivel = new Pila ();
		Pila desc = new Pila ();
	
		nivel.adicion (raiz);
		
		while (!nivel.esvacia ())
		{
		    while (!nivel.esvacia ())
		    {
				Nodo x = nivel.eliminacion ();
				
				if(x.getIzq()!=null && x.getDer()==null)
					k++;
				if(x.getIzq()==null && x.getDer()!=null)
					k++;
		
				if (x.getIzq() != null)
				    desc.adicion (x.getIzq());
				if (x.getDer() != null)
				    desc.adicion (x.getDer());
			}
			    
		    System.out.println ();
			    
			nivel.vaciar(desc);
		}
		System.out.print("Resultado2 : "+k);
    }
    
    void completar (String w)
    {
    	
	
		Pila nivel = new Pila ();
		Pila desc = new Pila ();
	
		nivel.adicion (raiz);
		
		while (!nivel.esvacia ())
		{
		    while (!nivel.esvacia ())
		    {
				Nodo x = nivel.eliminacion ();
				
				if(x.getIzq()!=null && x.getDer()==null)
				{
					Nodo nue=new Nodo();
					nue.setPalabra(w);
					x.setDer(nue);
				}
				if(x.getIzq()==null && x.getDer()!=null)
				{
					Nodo nue=new Nodo();
					nue.setPalabra(w);
					x.setIzq(nue);
				}
		
				if (x.getIzq() != null)
				    desc.adicion (x.getIzq());
				if (x.getDer() != null)
				    desc.adicion (x.getDer());
			}
			    
		   		    
			nivel.vaciar(desc);
		}
		
    }


}
