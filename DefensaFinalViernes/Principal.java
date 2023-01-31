package DefensaFinalViernes;

public class Principal {

	public static void main(String[] args) {
		ListaMarco A = new ListaMarco();
		System.out.println("Ingrese numero de macrodistritos ");
		A.leer(Leer.datoInt());
		A.mostrar();
	    // mostrar la (s) zoas que tienen la calle/callejon  o avenidas x
		//System.out.print("Ingrese calle o avenida X: ");
		System.out.println();
		//mostraZonasCalleX(A,Leer.dato());
		
		// de cada macrodistrito mostrar las zonas con el mayor numero de calles y avenidas
		mostrarZonasMayorNumeroDeCalles(A);
		

	}
    public static void mostrarZonasMayorNumeroDeCalles(ListaMarco A) {
    	NodaMacro q = A.getP();
		while(q!=null) 
		{
			q.getA().mostrarMayor(q.getA().Mayor());
			q=q.getSig();
		}
		
	}
	/*public static void solucion6(LSimpleE a, LSimpleEv b) {
     * NodoE q=a.getP();
		while(q!=null)
		{    
			boolean sw=true;
		   NodoEv w =b.getP();
		while(w!=null)
		{  
			if(q.getCi()==w.getA().getCi())
			{	 
				sw = false;
			}
			w=w.getSig();
		}
		if(sw) {
			System.out.println(q.getNom()+" "+q.getPat()+" "+q.getMat());
		}
		q=q.getSig();
		}*/
	public static void mostraZonasCalleX(ListaMarco A, String X) {
			NodaMacro q = A.getP();
			while(q!=null) 
			{
				q.getA().mostrarZ(X);
				q=q.getSig();
			}
		
	}

}
