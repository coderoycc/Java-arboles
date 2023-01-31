package martes;

public class ColaL {
//  atributos   
	private int max=50;
	private LineaPumaK v[] = new LineaPumaK[max+1];
	private int ini,fin ; 
	// metodos de la cola simple de objetos
	ColaL(){
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
			System.out.println ("\n Linea de Pumak de la Cola ");
			//System.out.println ("\n Numerador  Denominador ");
			ColaL aux = new ColaL();
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
			LineaPumaK  z = new LineaPumaK();
			z.leer ();
			adicionar (z);
		}
	}

	void vaciar (ColaL a)

	{
		while (!a.esvacia ())
			adicionar (a.eliminar ());


	}
}
