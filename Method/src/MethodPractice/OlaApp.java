package MethodPractice;

public class OlaApp {
   public static void book(Ola ob)
   {
	   ob.ride();
	   if(ob instanceof Auto)
	   {
		   Auto b=(Auto)ob;
		   b.rateA();
	   }
	   else
	   {
		   Mini n=(Mini)ob;
		   n.rateM();
	   }
   }
   public static void main(String[]args)
   {
	   Auto a=new Auto();
	   book(a);
	   Mini m=new Mini();
	   book(m);
	   
   }
   
}
