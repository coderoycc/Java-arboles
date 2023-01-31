class Pila2 
{
    int top;
    int max=50;
    NodoA v[]=new NodoA();
    
    Pila2 ()
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


    void adicion (NodoA elem)
    {
	if (!esllena ())
	{
	    top++;
	    v [top] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }


    NodoA eliminacion ()
    {
	NodoA elem = null;
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
