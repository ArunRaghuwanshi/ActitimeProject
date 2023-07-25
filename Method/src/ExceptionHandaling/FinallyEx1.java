package ExceptionHandaling;

import java.util.Scanner;
public class FinallyEx1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String t[]= {"java","js","sql","manual"};
	System.out.println("enter your number");
	 int n=s.nextInt();
	 try {
	 for(int i=0;i<=t.length;i++)
	 {
		 System.out.println(t[i]);
	 }
	 }
	/* catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("iam handling string exception");
	 }*/
	 catch(ArithmeticException e)
	 {
		 System.out.println("iam handling the exception ");
	 }
	 finally
	 {
		 System.out.println("finally block executed");
	 }
}
}
