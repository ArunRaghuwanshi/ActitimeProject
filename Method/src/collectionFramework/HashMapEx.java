package collectionFramework;
import java.util.HashMap;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Object>h=new HashMap<String, Object>();
		h.put("name", "jhon");
		h.put("Hometown", "bangalore");
		h.put("State", "KA");
		h.put("Age",27 );
		h.put("sal",3455d);
		
		System.out.println("All entries in the map"+h.entrySet());
		System.out.println("All keys"+h.keySet());
		System.out.println("All values"+h.values());
		System.out.println("Searching age "+h.containsKey("State"));
		System.out.println("Searching given value  "+h.containsValue(27));
		System.out.println("Getting value for given key "+h.get("sal"));
		h.put("value", 65);
		System.out.println(h.get("value"));
		h.putIfAbsent("age", null);
		//System.out.println(h.entrySet());
		System.out.println(h);
		
		
	}
}
