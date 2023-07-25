package collectionFramework;
import java.util.Collections;
import java.util.TreeSet;
public class TreeSetChar {
public static void main(String[] args) {
	TreeSet<Character>t=new TreeSet<Character>();
	t.add('A');
	t.add('$');
	t.add('k');
	t.add('a');
	t.add('%');
	t.add('o');
	t.add('5');
	t.add('#');
	t.add('o');
  
	for(Character i:t)
	{
		System.out.print(i+"  ");
		System.out.println((int)i);
		
	}
	
	TreeSet<Character> t1=new TreeSet<>();
	t1=(TreeSet<Character>) t.descendingSet();
			for(Character i:t1)
			
	{   System.out.print(i+"  ");
		System.out.println((int)i);
	}

	
}
}
