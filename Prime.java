public class Prime 
{
   public static void main(String args[])
   {
	   int i,j,cnt=0;
	   System.out.print("2 ");
	   for(i=3;i<=100;i+=2)
	   {
		   int p=(int)Math.sqrt(i);
		   cnt=0;
		   for(j=3;j<=p;j+=2)
			   if(i%j==0)
			   {
				   cnt=1;
				   break;
			   }
		   if(cnt==0)
			   System.out.print(i+" ");
		   
	   }
   }
}
