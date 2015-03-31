import java.util.*;
public class Vote 
{
   public static void main(String args[])
   {
	   int age;
	   System.out.println("Enter the age of person :");
	   Scanner s=new Scanner(System.in);
	   age=s.nextInt();
	   if(age>=18)
		   System.out.println("Person is eligible for vote");
	   else
		   System.out.println("Person is not eligible for vote");
	   s.close();
   }
}
