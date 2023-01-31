class PilaN extends Pila_Cola
{
    int top;
    int max=100;
    NodoA [] p=new NodoA[max];
    
    PilaN ()
    {
	top = 0;
    }


    boolean esVacia ()
    {
	if (top == 0)
	    return true;
	else
	    return false;
    }


    void adicion (NodoA e)
    {
	if (top == max)
	    System.out.println ("Pila Llena");
	else
	{
	    top++;
	    p [top] = e;
	}
    }


    NodoA eliminacion ()
    {
	NodoA e = null;
	if (top == 0)
	    System.out.println ("Pila Vacia");
	else
	{
	    e = p [top];
	    top--;
	}
	return (e);
    }


    int nroElementos ()
    {
	int c = 0;
	PilaN aux = new PilaN ();
	NodoA e;
	while (top != 0)
	{
	    aux.adicion (eliminacion ());
	    c = c + 1;
	}

	while (aux.top != 0)
	{
	    adicion (aux.eliminacion ());
	}
	return (c);
    }


    void vaciar (PilaN A)
    {
	while (!A.esVacia ())
	{
	    adicion (A.eliminacion ());
	}
    }
}
