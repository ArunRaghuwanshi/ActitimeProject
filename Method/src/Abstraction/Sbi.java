package Abstraction;

import java.util.Scanner;
public class Sbi extends Rbi implements Atm {
     long acno;
     int pin;
     double balance;
     Scanner s=new Scanner(System.in);
     
     
     public void withDraw()
     {
    	 System.out.println("enter Your pin");
    	 int p=s.nextInt();
    	 if(p==pin)
    	 {
    		 System.out.println("enter Amount");
    		 double amount=s.nextDouble();
    		 balance=balance-amount;
    		 System.out.println("collect your cash");
    	 }
    	 else
    	 {
    		 System.out.println("You have entered wrong pin");
    	 }
     }
    	
    

	public Sbi(long acno, int pin, double balance) {
		super();
		this.acno = acno;
		this.pin = pin;
		this.balance = balance;
	}



	public void checkBal()
     {
    	System.out.println("enter your pin");
    	int p=s.nextInt();
    	if(p==pin)
    	{
    		System.out.println("your balance is :"+balance);
    		
    	}
    	else
    	{
    		System.out.println("you have entered wrong pin");
    	}
     }

}
