package Trial;

public class Country implements Comparable <Country>{
String name;
String President;
String pm;
int countrycode;
public Country(String name, String president, String pm, int countrycode) {
	super();
	this.name = name;
	President = president;
	this.pm = pm;
	this.countrycode = countrycode;
}
@Override
public String toString() {
	return "Country [name=" + name + ", President=" + President + ", pm=" + pm + ", countrycode=" + countrycode + "]";
}
public int compareTo(Country c)
{
     if(this.countrycode>c.countrycode)
    	 return 1;
     else if(this.countrycode<c.countrycode)
    	 return -1;
     else
    	 return 0;
}
public boolean
equals(Country c)
{
	if(this.name.equals(c.name))
		return true;
	else
		return false;
	

	}


}
