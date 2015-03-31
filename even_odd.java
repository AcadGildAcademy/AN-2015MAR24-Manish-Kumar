import java.util.*;
public class even_odd 
{
   public static void main(String args[])
   {
	   int a;
	   System.out.println("Enter a number :");
	   Scanner s=new Scanner(System.in);
	   a=s.nextInt();
	   if(a%2==0)
		   System.out.println("Number is even");
	   else
		   System.out.println("Number is odd");
	   s.close();
   }
}
