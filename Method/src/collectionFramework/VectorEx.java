package collectionFramework;
import java.util.Vector;

public class VectorEx {
  public static void main(String[] args) {
	Vector<Integer>v=new Vector<Integer>();
	v.add(10);
	v.add(14);
	v.add(78);
	v.add(74);
	v.add(65);
	v.add(10);
	v.add(14);
	v.add(78);
	v.add(74);
	v.add(65);
	v.add(45);
	System.out.println(v);
	for(int i=0;i<v.size();i++)
	{
		System.out.println(v.get(i));
	}
	
}
}
