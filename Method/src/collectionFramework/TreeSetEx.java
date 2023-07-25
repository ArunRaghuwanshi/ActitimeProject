package collectionFramework;
import java.util.*;
public class TreeSetEx {
 public static void main(String[] args) {
	TreeSet<Mobile>t=new TreeSet<>();
	t.add(new Mobile("Nokia",12334d));
	t.add(new Mobile("Samsung",329823747.34d));
	t.add(new Mobile("Oneplus",479324.45d));
	t.add(new Mobile("Iphone",37733d));
	
	
	for(Object i:t)
	{
		System.out.println(i);
	}
 }
 }