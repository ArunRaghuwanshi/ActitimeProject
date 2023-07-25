package collectionFramework;
import java.util.*;
public class ConversionEx {
  
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(34);
		a.add(24);
		a.add(54);
		a.add(67);
		a.add(12);
		a.add(24);
		System.out.println(a);
		HashSet<Integer>h=new HashSet<>(a);
		System.out.println(h);
		TreeSet<Integer>t=new TreeSet<>(h);
		System.out.println(t);
		t.add(54);
		LinkedHashSet<Integer>l=new LinkedHashSet<>(t);
		System.out.println(l);
		HashSet<Integer>s=new HashSet<>(a);
		System.out.println(s);
		
		
	
		
	}
}
