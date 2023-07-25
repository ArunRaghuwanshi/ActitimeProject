package collectionFramework;
import java.util.LinkedList;
public class LinkedListEx {

	 public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<Integer>();
		l.add(10);
		l.add(12);
		l.add(65);
		l.add(15);
		l.add(null);
		l.add(2, 35);
		System.out.println(l.poll());
		System.out.println(l);
		l.pollLast();
		System.out.println(l);
		l.peekLast();
		System.out.println(l);
	}
}
