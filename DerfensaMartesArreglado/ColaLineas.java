package DerfensaMartesArreglado;

public class ColaLineas {
	private int max=50;
	private LineaPumaK v[] = new LineaPumaK[max+1];
	private int ini,fin ; 
	// metodos de la cola simple de objetos
	ColaLineas(){
		ini=fin=0;
				
	}

	boolean esvacia ()
	{
		if (ini == 0 && fin == 0)
			return (true);
		return (false);
	}

	boolean esllena ()
	{
		if (fin == max)
			return (true);
		return (false);
	}
	int nroelem ()
	{
		return (fin - ini);
	}
	void adicionar (LineaPumaK elem)
	{
		if (!esllena ())
		{
			fin++;
			v [fin] = elem;
		}
		else
			System.out.println ("Cola Simple llena");
	}

	LineaPumaK eliminar ()
	{
		LineaPumaK elem = new LineaPumaK();
		if (!esvacia ())
		{
			ini++;
			elem = v [ini];
			if (ini == fin)
				ini = fin = 0;
		}
		else
			System.out.println ("Cola Simple vacia");
		return (elem);
	}

	void mostrar ()
	{
		LineaPumaK elem;
		if (esvacia ())
			System.out.println ("Cola vacia");
		else
		{
			System.out.println ("\n Datos de la Cola de Departamentos");
			//System.out.println ("\n Numerador  Denominador ");
			ColaLineas aux = new ColaLineas();
			while (!esvacia ())
			{
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar();
			}
			vaciar(aux);
		}
	}

	void llenar (int n)
	{
		int i;
		for (i = 1 ; i <= n ; i++)
		{
			LineaPumaK z = new LineaPumaK();
			z.Leer();
			adicionar (z);
		}
	}

	void vaciar (ColaLineas a)
	{
		while (!a.esvacia ())
			adicionar (a.eliminar ());


	}
}
