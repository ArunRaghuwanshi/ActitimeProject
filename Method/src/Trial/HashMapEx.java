package Trial;
import java.util.TreeMap;
public class HashMapEx {
  public static void main(String[] args) {
	 TreeMap<Integer, Employee>hm=new TreeMap<Integer,Employee>();
	 hm.put(1234, new Employee("abc", 4563d, 123456l));
	 hm.put(7894, new Employee("afv", 78964d, 789654l));
	 System.out.println(hm.descendingMap());
	 for(Integer i:hm.keySet())
	 {
		 System.out.println(hm.get(i));
	 }
	 System.out.println(hm.lastKey());
	 
  
  
}
}