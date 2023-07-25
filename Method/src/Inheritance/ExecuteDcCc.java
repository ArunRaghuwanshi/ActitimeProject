package Inheritance;

public class ExecuteDcCc {
  public static void main(String[]args)
  {
	  
	  DebitCard d=new DebitCard(1233456789l,"Rohan","1-12-2024",7531,658794d);
	  CreditCard c=new CreditCard(789456123l,"Daharmendra","12-dec-2025",8947,455002l);
	  
	  d.printDC();
	  c.printCC();
	  c.printCard();
			  
  }
}
