class Pila 
{
    int top;
    int max=50;
    nodoF v[]=new nodoF();
    
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


    void adicion (nodoF elem)
    {
	if (!esllena ())
	{
	    top++;
	    v [top] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }


    nodoF eliminacion ()
    {
	nodoF elem = null;
	if (!esvacia ())
	{
	    elem = v [top];
	    top--;

	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }


}
