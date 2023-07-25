package ExceptionHandaling;
import java.util.Scanner;
public class Matrimoney {

	public static void main(String[] args) {
		register();
	}
	public static void register()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("go ahead");
			details();
		}
		else
		{
			throw new InvalidAgeException("Your age is minor");
			
		}
		
	}
	public static void details()
	{
		System.out.println("upload photo");
	}
}
