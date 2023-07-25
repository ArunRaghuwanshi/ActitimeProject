package Trial;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Country>hs=new HashSet<>();
		hs.add(new Country("India", "Dropadi murmur", "MODI", +91));
		hs.add(new Country("Usa", "sam", "ram", 81));
		hs.add(new Country("Uk", "pom", "mona", 61));
		
		ArrayList<Country>al=new ArrayList<>(hs);
		Collections.sort(al);
	for(Country c:al)
	{
		System.out.println(c);
	}
	}
}
