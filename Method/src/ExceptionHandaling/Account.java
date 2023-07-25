

package ExceptionHandaling;
import java.util.Scanner;
public class Account {
  int pin;
  double balance;
  public Account(int pin,double balance)
  {
	  this.pin=pin;
	  this.balance=balance;  
  }
  public void withdrawMoney()
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter pin");
	  int p=s.nextInt();
	  if(p==pin)
	  {
		  System.out.println("enter amount");
		  double amount=s.nextDouble();
		  if(amount<balance)
		  {
			  balance=balance-amount;
		  System.out.println("collect your cash");
			 // throw new InSufficentFundException("your bal is less");
		  }
		  else
		  {
			//  balance=balance-amount;
			//  System.out.println("collect your cash");
			  throw new InSufficentFundException("your bal is less");
		  }
	  }
	  else
	  {
		  System.out.println("invalid pin");
	  }
  }
  public void printBal()
  {
	  System.out.println("your bal is :"+balance);
}
  public static void main(String[] args) {
	Account a=new Account(1234,5000d);
	try {
		a.withdrawMoney();
		a.printBal();
	}
	finally
	{
		System.out.println("Thankyou for using our services");
	}
	}
}



