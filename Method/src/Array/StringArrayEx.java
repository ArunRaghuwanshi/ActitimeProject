package Array;
import java.util.Scanner;
public class StringArrayEx {
	public static void main(String[] args) {
		String g[]=create();
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(g[i]);
		 }
	}
	public static String[] create()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter 5 values");
	int n=s.nextInt();
	String g[]=new String[n];
	 for(int i=0;i<5;i++)
	 {
		  g[i]=s.next();
		 }
	  return g;
	}
	}

