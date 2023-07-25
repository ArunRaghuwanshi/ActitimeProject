package collectionFramework;

public class Pen implements Comparable<Pen> {
int price;
String name;

 public Pen(int price,String name)
 {
	 this.price=price;
	 this.name=name;
 }
 public String toString()
 {
	 return price+" "+name;
 }

 public int compareTo(Pen p)
 {
	 if(this.name.compareTo(p.name)>0)
	 return 1;
	 
	 else if(this.name.compareTo(p.name)<0)
		 return -1;
	 else
		 return 0;
 } 
 
 }
 

