import java.util.Scanner;

class Rectangle
{
	private int length,breath;
	Rectangle(int x,int y)
	{
		this.length=x;
		this.breath=y;
	}
	public void  area()
	{
		System.out.println("Area of rectangle :"+(this.length*this.breath));
		
		System.out.println("Area of triangle :"+(this.length*this.breath)/2);
	}
}

class Triangle extends Rectangle
{
	Triangle(int x,int y)
	{
		super(x,y);
	}
	public void area()
	{
		super.area();
	}
}

public class Area 
{
   public static void main(String args[])
   {
	   int l,b;
       System.out.println("Enter the length and bredth :");
       Scanner s=new Scanner(System.in);
       l=s.nextInt();
       b=s.nextInt();
       
       Triangle t=new Triangle(l,b);
       t.area();
       s.close();
   }
}
