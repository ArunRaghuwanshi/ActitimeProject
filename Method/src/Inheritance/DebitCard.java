package Inheritance;

public class DebitCard extends Card {
  double balance;
  
  public DebitCard(Long cardno,String holder,String expdate,int pin,double balance)
  {
      super(cardno,holder,expdate,pin);
      this.balance=balance;
  }
  public void printDC()
  {
	  System.out.println("debit cartd"+balance);
	  
  }
  
}
