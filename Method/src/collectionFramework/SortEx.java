package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;
public class SortEx {
	
	public static void main(String[] args) 
{
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(12);
		al.add(46);
		al.add(75);
		al.add(35);
		al.add(85);
		System.out.println(al);
		Collections.sort(al);
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
	  
}
}
