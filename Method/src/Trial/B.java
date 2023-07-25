package Trial;

public class B extends A {
	int pin;
	String address;
	int add;
public B(int number, String name, double balance,int pin,String address) {
		super(number, name, balance);
		this.pin=pin;
		this.address=address;
	}
public void addNumber() {
	System.out.println("old name is:"+getName());
	System.out.println("your pin is "+pin);
	
}

public static void main(String[] args) {
	 A a=new A(9876,"jeevan",5600d);
	 B b=new B(4567,"sam",5670d,1234,"train");
	b.comparision();
	 
	 
}
public void comparision() {
	if(pin>(number)) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
}

/*public int compareTo(B b) {
	if(this.pin>b.pin) {
		return 1;
	}
		else if(this.pin<b.pin) {
			return -1;
			}
		else {
			return 0;
		
	}*/
}



