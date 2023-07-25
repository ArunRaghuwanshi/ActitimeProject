package MethodPractice;

public class Cafe {
	public static void main(String[]args)
	{
		Drink d=new Coffee();
		d.ready();
		d.welcome();
		
		Coffee c=(Coffee)d;
		c.typesC();
		
		Drink d1=new Tea();
		d1.ready();
		d1.welcome();
		
		Tea t=(Tea)d1;
		t.typesT();
		
		
	}

}
