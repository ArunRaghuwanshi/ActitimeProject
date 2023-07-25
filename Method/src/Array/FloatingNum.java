package Array;
import java.util.Scanner;
public class FloatingNum {
   public static void main(String[]args)
   {
	 System.out.println("enter size of element"); 
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	System.out.println("enter all elements"); 
     float a[]=new float[n];
	for(int i=0;i<n;i++)
	{
		 a[i]=s.nextFloat();
	}
	for(int i=n-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
   }
}
