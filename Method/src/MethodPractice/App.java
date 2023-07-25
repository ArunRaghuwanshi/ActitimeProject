package MethodPractice;

public class App {
	public static void main(String[] args) {
		Student s=new Student("Mohan",24,125347272873l,15,"mba");
		register(s);
		Employee e=new Employee("Shyam",25,2132713747l,10,"manager");
		register(e);
		PeopleOfBangalore p=new PeopleOfBangalore("Sam",30,389433752l);
		register(p);

	}	
	public static void register(PeopleOfBangalore p)
	{
		p.display();
		p.displayP();
		
		
		
		if(p instanceof Student)
		{
			Student u=(Student)p;
			u.detailsS();
		}
		else if(p instanceof Employee )
		{
			Employee v=(Employee)p;
			v.detailsE();
		}
		
		
		
	}
	

}
