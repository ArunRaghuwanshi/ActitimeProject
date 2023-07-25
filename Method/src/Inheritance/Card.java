package Inheritance;

public class Card {

	 long cardno;
	 String holder;
	 String expdate;
	 int pin;
	 
	 public Card(Long cardno,String holder,String expdate,int pin)
	 {
		 this.cardno=cardno;
		 this.holder=holder;
		 this.expdate=expdate;
		 this.pin=pin;
		  }
	 public void printCard()
	 {
		 System.out.println(cardno);
		 System.out.println(holder);
		 System.out.println(expdate);
		 System.out.println(pin);
	 }
	 
	 }
