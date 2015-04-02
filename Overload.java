import java.util.*;

class AreaFig
{
	private int x,y;
	AreaFig()
	{
		x=0;
		y=0;
	}
	AreaFig(int a)
	{
		x=a;
		y=a;
	}
	AreaFig(int a,int b)
	{
		x=a;
		y=b;
	}
	void getArea()
	{
		System.out.println("Area of fig is :"+x*y);
	}
}
public class Overload 
{
  public static void main(String args[])
  {
	  int a,b;
	  Scanner s=new Scanner(System.in);
	  
	  AreaFig f1=new AreaFig();
	  f1.getArea();
	  System.out.println("Enter the edge of square :");
	  a=s.nextInt();
	  AreaFig f2=new AreaFig(a);
	  f2.getArea();
	  System.out.println("Enter the edge of Rectangle :");
	  a=s.nextInt();
	  b=s.nextInt();
	  AreaFig f3=new AreaFig(a,b);
	  f3.getArea();
	  
	  s.close();
  }
}
