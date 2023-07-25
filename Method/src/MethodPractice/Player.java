package MethodPractice;

public class Player {
   String name;
   int age;
   String gender;
   String country;
   boolean captaincy;
  
   public Player(String name,int age,String gender,String country,boolean captaincy)
   {
	  this.name=name;
	  this.age=age;
	  this.gender=gender;
	  this.country=country;
	  this.captaincy=captaincy;
   } 
   public void details()
   {
	   System.out.println("Name of player is :"+ name );
	   System.out.println("Age of the player :"+age);
	   System.out.println("Gender of the player :"+gender);
	   System.out.println("Country of the of player :"+ country);
	   System.out.println("Captaincy of the player is possible :"+ captaincy);
   }
   
}
	  
   
   
   

