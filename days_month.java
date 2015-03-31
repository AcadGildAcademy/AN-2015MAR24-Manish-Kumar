import java.util.*;
public class days_month 
{
   public static void main(String args[])
   {
	   System.out.println("Enter the month (lower case):");
	   Scanner s=new Scanner(System.in);
	   String ch=s.nextLine();
	  // System.out.println(ch);
	   if(ch.equals("february"))
		   System.out.println("Number of days : 28");
	   else if(ch.equals("april")||ch.equals("june")||ch.equals("september")||ch.equals("november"))
		   System.out.println("Number of days : 30");
	   else
		   System.out.println("Number of days : 31");
	   s.close();
   }
}
