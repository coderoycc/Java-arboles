
public class Pila {
int max=100;
int tope;
Nodo v[]=new Nodo [max];
Pila()
{
	tope=0;

	
}
boolean esvacia ()
{
    if (tope == 0)
        return (true);
    return (false);
}


boolean esllena ()
{
    if (tope == max)
        return (true);
    return (false);
}


int nroelem ()
{
    return (tope);
}


void adicionar (Nodo elem)
{
    if (!esllena ())
    {
        tope++;
        v [tope] = elem;
    }
    else
        System.out.println ("Pila llena");
}


Nodo eliminar ()
{
    Nodo elem =new Nodo();
    if (!esvacia ())
    {
        elem = v [tope];
        tope--;
    }
    else
        System.out.println ("Pila vacia");
    return (elem);
}

void vaciar (Pila a)
{
    while (!esvacia ())
       a.adicionar (eliminar ());
    
}
	

}
