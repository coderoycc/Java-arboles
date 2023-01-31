
public class ABNormalP extends ArbolBinarioP{
	
	ABNormalP()
	{
		super();
	}
	void crear(NodoP r)
	    {
	        if(r!=null)
	        {
	                System.out.print("Titulo Pelicula-->");
	                r.titulo=Leer.dato();
	                System.out.print("Genero Pelicula-->");
	                r.genero=Leer.dato();
	                
	                System.out.print(r.titulo+" Tendra Izq ? S/N");
	                String resp=Leer.dato();
	                if(resp.equals("s"))
	                { 
	                        NodoP nue=new NodoP();
	                        r.izq=nue;
	                        crear(r.izq);
	                }
	                System.out.print(r.titulo+" Tendra Der ? S/N");
	                resp=Leer.dato();
	                if(resp.equals("s"))
	                { 
	                        NodoP nue=new NodoP();
	                        r.der=nue;
	                        crear(r.der);
	                }
	        }
	        
	    }
	    void preorden (NodoP r)
	    {
	      if(r!=null)
	      {
	          System.out.println(r.titulo+" "+r.genero);
	          preorden(r.izq);
	          preorden(r.der);
	      }
	    }
	    int nronodos(NodoP r)
	    {
	    	if(r!=null)
	    	{
	    		return nronodos(r.izq)+nronodos(r.der)+1;
	    	}
	    	else
	    		return 0;
	    	
	    }
	    void completar (NodoP r)
	    {
	      if(r!=null)
	      {
	          if(r.izq!=null && r.der==null)
	          {
	        	  NodoP nue=new NodoP();
	        	  System.out.print("Titulo Pelicula-->");
	              nue.titulo=Leer.dato();
	              System.out.print("Genero Pelicula-->");
	              nue.genero=Leer.dato();
	              
	              r.der=nue;
	        	  
	          }
	          if(r.izq==null && r.der!=null)
	          {
	        	  NodoP nue=new NodoP();
	        	  System.out.print("Titulo Pelicula-->");
	              nue.titulo=Leer.dato();
	              System.out.print("Genero Pelicula-->");
	              nue.genero=Leer.dato();
	              
	              r.izq=nue;
	        	  
	          }
	          
	          completar(r.izq);
	          completar(r.der);
	      }
	    }
	    void crear ()
	    {
	        String resp;
	        Pila nivel = new Pila ();
	        Pila desc = new Pila ();

	        NodoP x = new NodoP ();
	        
	        System.out.print("Datos Raiz-->");
	        System.out.print("Titulo Pelicula-->");
	        x.titulo = Leer.dato ();
	        System.out.print("Genero Pelicula-->");
	        x.genero = Leer.dato ();
	        
	        raiz = x;
	        nivel.adicion (raiz);
	        while (!nivel.esvacia ())
	        {
	            while (!nivel.esvacia ())
	            {
	                x = nivel.eliminacion ();
	                System.out.print (x.titulo + "Tendra Izquierda ? S/N");
	                resp = Leer.dato ();
	                if (resp.compareTo ("s") == 0)
	                {
	                    NodoP y = new NodoP ();
	                    System.out.print("Titulo Pelicula-->");
	        	        y.titulo = Leer.dato ();
	        	        System.out.print("Genero Pelicula-->");
	        	        y.genero = Leer.dato ();
	        	        
	                    x.izq = y;
	                    desc.adicion (y);
	                }
	                
	                System.out.print (x.titulo + "Tendra Derecha ? S/N");
	                resp = Leer.dato ();
	                if (resp.compareTo ("s") == 0)
	                {
	                	NodoP y = new NodoP ();
	                    System.out.print("Titulo Pelicula-->");
	        	        y.titulo = Leer.dato ();
	        	        System.out.print("Genero Pelicula-->");
	        	        y.genero = Leer.dato ();
	        	        
	                    x.der = y;
	                    desc.adicion (y);
	                }
	              }
	            nivel.vaciar(desc);
	           }
	    }


	    void mostrar ()
	    {

	        NodoP x;
	        Pila nivel = new Pila ();
	        Pila desc = new Pila ();

	        nivel.adicion (raiz);
	        while (!nivel.esvacia ())
	        {
	            while (!nivel.esvacia ())
	            {
	                x = nivel.eliminacion ();
	                System.out.print (x.titulo+" "+x.genero + "    ");

	                if (x.izq != null)
	                    desc.adicion (x.izq);
	                if (x.der != null)
	                    desc.adicion (x.der);
	            }
	            System.out.println ();
	            nivel.vaciar(desc);
	         }
	    }
	    
	    int nronodos ()
	    {
	    	int c=0;
	        NodoP x;
	        Pila nivel = new Pila ();
	        Pila desc = new Pila ();

	        nivel.adicion (raiz);
	        while (!nivel.esvacia ())
	        {
	            while (!nivel.esvacia ())
	            {
	                x = nivel.eliminacion ();
	                c=c+1;

	                if (x.izq != null)
	                    desc.adicion (x.izq);
	                if (x.der != null)
	                    desc.adicion (x.der);
	            }
	            
	            nivel.vaciar(desc);
	         }
	        return c;
	    }
	    void completar ()
	    {

	        NodoP x;
	        Pila nivel = new Pila ();
	        Pila desc = new Pila ();

	        nivel.adicion (raiz);
	        while (!nivel.esvacia ())
	        {
	            while (!nivel.esvacia ())
	            {
	                x = nivel.eliminacion ();
	                
	                if(x.izq!=null && x.der==null)
	  	          {
	  	        	  NodoP nue=new NodoP();
	  	        	  System.out.print("Titulo Pelicula-->");
	  	              nue.titulo=Leer.dato();
	  	              System.out.print("Genero Pelicula-->");
	  	              nue.genero=Leer.dato();
	  	              
	  	              x.der=nue;
	  	        	  
	  	          }
	  	          if(x.izq==null && x.der!=null)
	  	          {
	  	        	  NodoP nue=new NodoP();
	  	        	  System.out.print("Titulo Pelicula-->");
	  	              nue.titulo=Leer.dato();
	  	              System.out.print("Genero Pelicula-->");
	  	              nue.genero=Leer.dato();
	  	              
	  	              x.izq=nue;
	  	        	  
	  	          }

	                if (x.izq != null)
	                    desc.adicion (x.izq);
	                if (x.der != null)
	                    desc.adicion (x.der);
	            }
	           
	            nivel.vaciar(desc);
	         }
	    }

}
