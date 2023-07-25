package collectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import MethodPractice.Employee;
public class IteratorEx {
  
	public static void main(String[] args) {
		ArrayList<Object>al=new ArrayList<Object>();
		al.add(new Employee("arun",12,12354l,123,"manager"));
		al.add(new Employee("Chotu",13,12354l,124,"Analyst"));
		//System.out.println(al);
		//Iterator<Object>it=al.iterator();
		  ListIterator<Object>li=al.listIterator();
	    while(li.hasNext()) // for Iterator you can use reference variable it and for ListIterator you can use li
	    {
	    	System.out.println(li.next());
	    }
	    while(li.hasPrevious())
	    {
	    	System.out.println(li.previous());
	    }
		
	}
}
