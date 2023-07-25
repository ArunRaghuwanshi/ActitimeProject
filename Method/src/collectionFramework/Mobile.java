package collectionFramework;

public class Mobile implements Comparable<Mobile> {
String brand;
double price;

public Mobile(String brand,double price)
{
  this.brand=brand;
  this.price=price;
}
  public String toString()
  {
	  return brand+" "+price; 
  }
  public int compareTo(Mobile m)
  {
	  if(this.brand.compareTo(m.brand)>0)
		  return 1;
	  else if(this.brand.compareTo(m.brand)<0)
		  return -1;
	  else
		  return 0;
  }
  
}
