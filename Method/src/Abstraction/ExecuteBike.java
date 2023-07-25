package Abstraction;

public class ExecuteBike {
	
	public static void fast(Bike b)
	{
		b.run();
	}
	public static void main(String[] args) {
		Duke d=new Duke();
		fast(d);
	}

}
