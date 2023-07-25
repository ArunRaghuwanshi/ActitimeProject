package MethodPractice;

public class Employee extends PeopleOfBangalore {
	int eid;
	String designation;
	
	public Employee(String name,int age,long contact,int eid,String designation)
	{
		super(name,age,contact);
		this.eid=eid;
		this.designation=designation;
	}
	public Employee(int eid,String designation)
	{
		this.eid=eid;
		this.designation=designation;
	}
	
   public void display()
   {
	 System.out.println("Iam employee method");  
   }
   
   @Override
public String toString() {
	return "Employee [eid=" + eid + ", designation=" + designation + ", name=" + name + ", age=" + age + ", contact="
			+ contact + "]";
}
public void detailsE()
   {
	   System.out.println("employee eid is :"+eid);
	   System.out.println("employee is designation :" + designation);
	   
   }
}
