
public class mat2x2 {
	private int a[][]=new int[3][3];
	
	public void llenar()
	{
		a[1][1]=(int)(Math.random()*10);
		a[1][2]=(int)(Math.random()*10);
		a[2][1]=(int)(Math.random()*10);
		a[2][2]=(int)(Math.random()*10);
	}
	public void mostrar()
	{
		System.out.println(a[1][1]+"  "+a[1][2]);
		System.out.println(a[2][1]+"  "+a[2][2]);
	}
	public int suma()
	{
		return a[1][1]+a[1][2]+a[2][1]+a[2][2];
	}
	public int menor()
	{
		int men=a[1][1];
		if(a[1][2]<men)
			men=a[1][2];
		if(a[2][1]<men)
			men=a[2][1];
		if(a[2][2]<men)
			men=a[2][2];
		return men;
	}
	public boolean verifica(int x)
	{
		if(a[1][1]==x || a[1][2]==x || a[2][1]==x ||a[2][2]==x)
			return true;
		return false;
	}

}
