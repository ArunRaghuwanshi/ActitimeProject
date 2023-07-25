package collectionFramework;
import java.util.ArrayList;
public class ListEx {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add(null);
		a.add("java");
		a.add("sql");
		a.add("manual");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}
