
public class AbinarioC {
	private NodoC raiz;
	
	AbinarioC()
	{
		raiz=null;
	}

	public NodoC getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoC raiz) {
		this.raiz = raiz;
	}
	//METODOS RECURSIVOS
	void crear(NodoC r)
	{
		if(r!=null)
		{
			System.out.print("Introducir Dato-->");
			String x=Leer.dato();
			r.setPalabra(x);
			
			System.out.print(r.getPalabra()+" Tendra Izq ? S/N");
			String resp=Leer.dato();
			if(resp.equals("s"))
			{ 
				NodoC nue=new NodoC();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			
			System.out.print(r.getPalabra()+" Tendra Der ? S/N");
			resp=Leer.dato();
			if(resp.equals("s"))
			{ 
				NodoC nue=new NodoC();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
		
	    }
	    void preorden (NodoC r)
	    {
	      if(r!=null)
	      {
			  System.out.println(r.getPalabra()+"");
			  preorden(r.izq);
			  preorden(r.der);
	      }
	    }
	    boolean verifica(NodoC r,String x)
	    {
	    	if(r!=null)
	    	{
	    		if(r.getPalabra().equals(x))
	    			return true;
	    		return verifica(r.getIzq(),x)||verifica(r.getDer(),x);
	    	}
	    	else
	    		return false;
	    }
	    void completar(NodoC r)
	    {
	    	if(r!=null)
	    	{
	    		if(r.getIzq()!=null && r.getDer()==null)
	    		{
	    			NodoC z=new NodoC();
	    			z.setPalabra("X");
	    			r.setDer(z);
	    		}
	    		if(r.getIzq()==null && r.getDer()!=null)
	    		{
	    			NodoC z=new NodoC();
	    			z.setPalabra("X");
	    			r.setIzq(z);
	    		}
	    		completar(r.getIzq());
	    		completar(r.getDer());
	    	}
	    }
	//METODOS ITERITOS

	    void crear ()
	    {
			String resp;
			Pila nivel = new Pila ();
			Pila desc = new Pila ();
	
			NodoC x = new NodoC ();
			System.out.print("Dato Raiz-->");
			String w = Leer.dato();
			x.setPalabra(w);
			setRaiz(x);
			
			nivel.adicion (getRaiz());
			
			while (!nivel.esvacia ())
			{
			    while (!nivel.esvacia ())
			    {
					x = nivel.eliminacion ();
					System.out.print (x.getPalabra() + "Tendra Izquierda ? S/N");
					resp = Leer.dato ();
					if (resp.compareTo ("s") == 0)
					{
					    NodoC y = new NodoC ();
					    System.out.print("Dato-->");
					    String z=Leer.dato();
					    y.setPalabra(z);
					    x.setIzq(y);
					    desc.adicion (y);
					}
					
					System.out.print (x.getPalabra() + "Tendra Derecha ? S/N");
					resp = Leer.dato ();
					if (resp.compareTo ("s") == 0)
					{
					    NodoC y = new NodoC ();
					    System.out.print("Dato-->");
					    String z = Leer.dato ();
					    y.setPalabra(z);
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
	
			nivel.adicion (getRaiz());
			
			while (!nivel.esvacia ())
			{
			    while (!nivel.esvacia ())
			    {
					NodoC x = nivel.eliminacion ();
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
	    boolean verifica(String z)
	    {
	    	Pila nivel = new Pila ();
			Pila desc = new Pila ();
	
			nivel.adicion (getRaiz());
			
			while (!nivel.esvacia ())
			{
			    while (!nivel.esvacia ())
			    {
					NodoC x = nivel.eliminacion ();
					if(x.getPalabra().equals(z))
						return true;
		
					if (x.getIzq() != null)
					    desc.adicion (x.getIzq());
					if (x.getDer() != null)
					    desc.adicion (x.getDer());
			    }
			    
			    nivel.vaciar(desc);
			}
			return false;
	    }
	    void completar()
	    {
	    	Pila nivel = new Pila ();
			Pila desc = new Pila ();
	
			nivel.adicion (getRaiz());
			
			while (!nivel.esvacia ())
			{
			    while (!nivel.esvacia ())
			    {
					NodoC x = nivel.eliminacion ();
					
					if(x.getIzq()!=null && x.getDer()==null)
		    		{
		    			NodoC z=new NodoC();
		    			z.setPalabra("X");
		    			x.setDer(z);
		    		}
		    		if(x.getIzq()==null && x.getDer()!=null)
		    		{
		    			NodoC z=new NodoC();
		    			z.setPalabra("X");
		    			x.setIzq(z);
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
