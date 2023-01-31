
public class ABNormal extends ArbolBinario{
	
	boolean esvacia()
	{
	 if(raiz==null)
	 {return true;}
	 else{return false;}
	}


	void crear ()
	{
	    String resp;
	    Pila nivel = new Pila ();
	    Pila desc = new Pila ();

	    Nodo raiz = new Nodo ();
	    System.out.print("Fraccion Raiz--> ");
	    Fraccion a=new Fraccion();
	    a.leer();
	    raiz.F=a;
	    
	    nivel.adicionar (raiz);
	    while (!nivel.esvacia ())
	    {
	        while (!nivel.esvacia ())
	        {
	            Nodo x = nivel.eliminar ();
	            x.F.mostrar();
	            System.out.print (" Tendra Izquierda ? S/N");
	            resp = Leer.dato ();
	            if (resp.equals("s"))
	            {
	                Nodo y = new Nodo ();
	                System.out.print("Fraccion-->");
	                Fraccion z=new Fraccion();
	                z.leer();
	                x.F=z;
	                x.izq = y;
	                desc.adicionar (y);
	            }
	                        
	            x.F.mostrar();
	            System.out.print (" Tendra Derecha ? S/N");
	            resp = Leer.dato ();
	            if (resp.equals("s"))
	            {
	                Nodo y = new Nodo ();
	                System.out.print("Fraccion-->");
	                Fraccion z=new Fraccion();
	                z.leer();
	                x.F=z;
	                x.der = y;
	                desc.adicionar (y);
	            }
	            
	        }
	       nivel.vaciar(desc);    
	    }
	}
	
	void crear(Nodo r)
	{
		String resp;
		if(r!=null)
		{
			System.out.print("Fraccion-->");
			Fraccion z=new Fraccion();
            z.leer();
            r.F=z;
            System.out.print (" Tendra Izquierda ? S/N");
			resp = Leer.dato ();
			if (resp.equals("s"))
            {
                Nodo y = new Nodo ();
                r.izq = y;
                crear (r.izq);
            }
			System.out.print (" Tendra Derecha ? S/N");
			resp = Leer.dato ();
			if (resp.equals("s"))
            {
                Nodo y = new Nodo ();
                r.der = y;
                crear (r.der);
            }
			
		}
	}

}

