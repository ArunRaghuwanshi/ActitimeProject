package collectionFramework;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class CountryEx {
 public static void main(String[] args) {
	HashSet<Country>h=new HashSet<Country>();
	 
	//ArrayList<Country>h=new ArrayList<Country>();
	h.add(new Country("UK","Boris Johnson","Rishi Sunak",+44));
	h.add(new Country("INDIA","Droupadi Murmu","Narendra modi0",+91));
	h.add(new Country("USA","Joe Biden","Joe Biden",+1));

	System.out.println(h);
   // Collections.sort(h);
  //  System.out.println(h);
    for(Country d:h)
    {
    	System.out.println(d);
    }
    
}
}
