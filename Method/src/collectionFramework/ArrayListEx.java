package collectionFramework;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Object>a=new ArrayList<Object>();
		a.add(100);
		a.add("java");
		a.add('a');
		a.add(100);
		a.add(null);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	}
}
