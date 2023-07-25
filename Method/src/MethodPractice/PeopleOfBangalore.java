package MethodPractice;

public class PeopleOfBangalore {
    String name;
    int age;
    long contact;
    static String district="Bangaluru";
    public void display()
    {
    	System.out.println("Iam a people of bangalore");
    }
    public PeopleOfBangalore(String name,int age,long contact)
    {  
    	this.name=name;
    	this.age=age;
    	this.contact=contact;
    }
    public PeopleOfBangalore()
    {
    	
    }
    public void displayP()
    {
    	System.out.println(name);
    }
    
    
}
