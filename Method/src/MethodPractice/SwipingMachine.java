package MethodPractice;

public class SwipingMachine {
	
  public static void Swipe(Card ob)
  {
	  ob.payment();
	  
	  if(ob instanceof DebitCard)
	  {
		DebitCard d=(DebitCard)ob;
		d.displayDebit();
	  }
	  else
	  {
		  CreditCard c=(CreditCard)ob;
		  c.displayCredit();
	  }  
  }
  public static void main(String[] args) {
	CreditCard x=new CreditCard();
	Swipe(x);
	DebitCard y=new DebitCard();
	Swipe(y);
}
}
