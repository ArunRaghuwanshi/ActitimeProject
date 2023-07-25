package ExceptionHandaling;

public class X {
    public static void main(String[] args) {
    	
	div();
    	
    	
}
    public static void div()
    {
    	try {
    	System.out.println(10+3);
    	System.out.println(10/0);
    	System.out.println(15);
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("ok");
    	}
    }
   
}