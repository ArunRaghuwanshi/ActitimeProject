package collectionFramework;

public class Employee {

	String id;
	double salary;
	long contact;
	public Employee(String id,double salary,long contact)
	{
		this.id=id;
		this.salary=salary;
		this.contact=contact;
	}
	public String toString()
	{
		return id+"  "+salary+"  "+contact;
	}
}
