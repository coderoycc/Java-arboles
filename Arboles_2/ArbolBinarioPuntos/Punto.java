class Punto
{
    private int x;
    private int y;
    Punto ()
    {
	x = y = 0;
    }


    Punto (int a, int b)
    {
	x = a;
	y = b;
    }


    public void mostrar ()
    {
	System.out.print ("(" + x + "," + y + ")");
    }


    public void leer ()
    {
	x = Leer.datoInt ();
	y = Leer.datoInt ();
    }


    public int obx ()
    {
	return x;
    }


    public int oby ()
    {
	return y;
    }
    public boolean verif()
    {
    	if(x==0 && y==0)
    	  return true;
    	return false;  
    }
}
