package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;
public class PenEx {

	public static void main(String[] args) {
		ArrayList<Pen>al=new ArrayList<Pen>();
		al.add(new Pen(1234,"Cello"));
		al.add(new Pen(3456,"Raymod"));
		al.add(new Pen(2356,"Ray"));
		//System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
