package Trial;

public class Employee implements Comparable <Employee>{
String id;
double salary;
long contact;
public Employee(String id, double salary, long contact) {
	super();
	this.id = id;
	this.salary = salary;
	this.contact = contact;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", salary=" + salary + ", contact=" + contact + "]";
}
  
public int compareTo(Employee e)
{
	if(this.id.compareTo(e.id)>0)
		return 1;
	else if(this.id.compareTo(e.id)<0)
		return -1;
	else
		return 0;
	}
}