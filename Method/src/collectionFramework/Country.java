package collectionFramework;

public class Country implements Comparable<Country> {
 String name;
 String president;
 String primeminister;
 int countrycode;
 
 public Country(String name,String president,String primeminister,int countrycode)
 {
	 this.name=name;
	 this.president=president;
	 this.primeminister=primeminister;
	 this.countrycode=countrycode;
 }
 /* public int compareTo(Country c)
  {
	  if(this.name.compareTo(c.name)>0)
		  return 1;
	  else if(this.name.compareTo(c.name)<0)
		  return -1;
	  else
		  return 0;
  }*/
  public int compareTo(Country c)
  {
	  if(this.countrycode>c.countrycode)
		  return 1;
	  else if(this.countrycode<c.countrycode)
		  return -1;
	  else
		  return 0;
  }
  
  public String toString()
  {
	  return name+" "+president+" "+primeminister+" "+countrycode;
  }
}
