package MethodPractice;

public class CricketPlayer extends Player{
    String team;
    String category;
    
    public CricketPlayer(String name,int age,String gender,String country,boolean captaincy,String team,String category)
    {
    	super(name,age,gender,country,captaincy);
    	this.team=team;
    	this.category=category;
    }
    
    public void details()
    {
    	System.out.println("Name of the player :"+ name);
    	System.out.println("Age of the player :"+ age);
    	System.out.println("Gender of the palyer :"+gender);
    	System.out.println("Country of the player :"+ country);
    	System.out.println("captaincy of the player :"+captaincy);
    	System.out.println("Player belons to the team :"+team);
    	System.out.println("Category of the player :"+category);
    }
    public void view()
    {
    	System.out.println("I love cricket");
    }
}
