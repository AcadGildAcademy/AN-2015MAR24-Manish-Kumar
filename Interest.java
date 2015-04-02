
class Bank
{
	void getRateOfInterest()
	{
		System.out.print("Interest of the bank ");
	}
}
class Icici extends Bank
{
	void getRateOfInterest()
	{
		super.getRateOfInterest();
		System.out.println("icici :7%");
	}
}

class Sbi extends Bank
{
	void getRateOfInterest()
	{
		super.getRateOfInterest();
		System.out.println("sbi :8%");
	}
}
class Axis extends Bank
{
	void getRateOfInterest()
	{
		super.getRateOfInterest();
		System.out.println("axis :9%");
	}
}
public class Interest 
{
   public static void main(String args[])
   {
	  Sbi s=new Sbi();
	  Axis a=new Axis();
	  Icici i=new Icici();
	  s.getRateOfInterest();
	  a.getRateOfInterest();
	  i.getRateOfInterest();
   }
}
