package collectionFramework;
import java.util.TreeMap;
public class TreeMapMobile {

	public static void main(String[] args) {
		TreeMap<String, Mobile>tm=new TreeMap<String,Mobile>();
		tm.put("dedew",new Mobile("vivo",34545d));
		tm.put("edfeww",new Mobile("nokia",4567d));
		for(String i:tm.keySet())
		{
		  System.out.println(tm.get(i));	
		}
	}
}
