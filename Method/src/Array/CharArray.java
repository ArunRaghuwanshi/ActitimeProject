package Array;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class CharArray {
  public static void main(String[] args) {
	
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter 10 char");
	 // char ch=s.next().charAt(5);
	  char a[]=new char[5];
	  for(int i=0;i<5;i++)
	  {
		  a[i]=s.next().charAt(0);
	  }
	 
	  for(int i=0;i<5;i++)
	  {
		  int x=(int)a[i];
		  System.out.println(x);
	  }
	  
	  /*  IntStream.range(0, a.length)
              .mapToObj(i -> a[i]).forEach(x->System.out.println((int)x));; */
}
}
