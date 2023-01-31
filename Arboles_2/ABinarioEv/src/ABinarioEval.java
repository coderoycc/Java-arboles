
public class ABinarioEval {
	private NodoEv raiz;
	
	ABinarioEval()
	{
		raiz=null;
	}

	public NodoEv getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoEv raiz) {
		this.raiz = raiz;
	}
	//recursivos
	void crear(NodoEv r)
    {
	if(r!=null)
	{
		System.out.print("Introducir Datos-->");
		Evaluacion x=new Evaluacion();
		x.leer();
		r.setE(x);
		
		System.out.print(r.getE().getNom()+" Tendra Izq ? S/N");
		String resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			NodoEv nue=new NodoEv();
			r.setIzq(nue);
			crear(r.getIzq());
		}
		
		System.out.print(r.getE().getNom()+" Tendra Der ? S/N");
		resp=Leer.dato();
		if(resp.equals("s"))
		{ 
			NodoEv nue=new NodoEv();
			r.setDer(nue);
			crear(r.getDer());
		}
	}
	
    }
    void preorden (NodoEv r)//Rid
    {
      if(r!=null)
      {
	    r.getE().mostrar();
		  preorden(r.getIzq());
		  preorden(r.getDer());
      }
    }
    void aprobados (NodoEv r)//Rid
    {
      if(r!=null)
      {
	      if(r.getE().getNota()>=51)
	    	  r.getE().mostrar();
	      aprobados(r.getIzq());
	      aprobados(r.getDer());
      }
    }
    int contar (NodoEv r)//Rid
    {
      if(r!=null)
      {
	      int c=contar(r.getIzq())+contar(r.getDer());
	      if(r.getE().getNota()>=51)
	    	  c++;
	      return c;
	    	  
      }
      else
    	  return 0;
    }
    boolean verifica (NodoEv r)//Rid
    {
      if(r!=null)
      {
	      if(r.getE().getNota()>=51)
	    	  return true;
	      
	      return verifica(r.getIzq())||verifica(r.getDer());
      }
      else
    	  return false;
    }
    void completar (NodoEv r)//Rid
    {
      if(r!=null)
      {
	      if(r.getIzq()!=null && r.getDer()==null)
	      {
	    	  NodoEv nue=new NodoEv();
	    	  nue.setE(new Evaluacion());
	    	  r.setDer(nue);
	    	  
	      }
	      if(r.getIzq()==null && r.getDer()!=null)
	      {
	    	  NodoEv nue=new NodoEv();
	    	  nue.setE(new Evaluacion());
	    	  r.setIzq(nue);
	      }
	    	  
    	  completar(r.getIzq());
    	  completar(r.getDer());
      }
    }
}
