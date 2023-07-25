package MethodPractice;

public class Student extends PeopleOfBangalore {
	int sid;
	String degree;
	
	public Student(String name,int age,long contact,int sid,String degree)
	{
		super(name,age,contact);
		this.sid=sid;
		this.degree=degree;
	}
	public void display()
	{
		System.out.println(district);
		System.out.println("iam student method");
	}
	public void detailsS()
	{
		System.out.println("My name is :" + name);
		System.out.println("My age is : " +age);
		System.out.println("my contact number is :"+ contact);
		System.out.println("Student id is :"+ sid);
		System.out.println("Student degree is :"+degree);
		
	}
	
}
