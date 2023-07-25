package Trial;

public class A {
	int number ;
	String name;
	double balance;
	
	public A(int number,String name,double balance) {
		
		this.number=number;
		this.name=name;
		this.balance=balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString() {
		return number+" "+name+""+balance;
	}                                                                                                         
	public void parent() {
		System.out.println("Hello from parent");
	}
}
