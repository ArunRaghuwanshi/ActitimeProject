package collectionFramework;
import java.util.ArrayList;
public class CharEx {
 public static void main(String[] args) {
	ArrayList<Character>a=new ArrayList<Character>();
	a.add('a');
	a.add('a');
	a.add('n');
	a.add('e');
	//System.out.println(a.size());
/*	for(Character i:a)
	{
		System.out.println(i);
	}*/
	a.add(2, 'z');
   /*  for(int i=a.size()-1;i>0;i--)
    {
    	System.out.println(a.get(i)); 
	}*/
     ArrayList<Object>b=new ArrayList<Object>();
     b.add(12);
     b.add("java");
     b.add("sam");
     b.add('a');
     b.add(null);
   //  for(Object i:b)
    /* {
    	 System.out.println(i);
     }*/
	System.out.println(b.addAll(a));
    for(Object i:b)
    {
    	System.out.println(i);
    }
    System.out.println(b);
    b.clear();
    System.out.println(b);
    
}
}
