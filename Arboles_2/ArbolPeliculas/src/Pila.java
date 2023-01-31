class Pila 
{
	int max=50;
    int top;
    NodoP v[]=new NodoP[max];
    Pila ()
    {
	top = 0;
    }


    boolean esvacia ()
    {
	if (top == 0)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (top == max)
	    return (true);
	return (false);
    }


    void adicion (NodoP elem)
    {
	if (!esllena ())
	{
	    top++;
	    v [top] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }


    NodoP eliminacion ()
    {
	NodoP elem = null;
	if (!esvacia ())
	{
	    elem = v [top];
	    top--;

	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }

    void vaciar(Pila z)
    {
    	while (!z.esvacia ())

            adicion (z.eliminacion ());
    }

}
