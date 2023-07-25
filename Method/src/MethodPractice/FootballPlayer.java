package MethodPractice;

public class FootballPlayer extends Player {
   String club;
   int position;
   
   public FootballPlayer(String name,int age,String gender,String country,boolean captaincy,String club,int position)
   {
	   super(name,age,gender,country,captaincy);
	   this.club=club;
	   this.position=position;   
   }
   public void details()
   {
	   System.out.println("player belongs to this club :"+club);
	   System.out.println("Position of the player :"+ position);
	   System.out.println("Name of player is :"+ name );
	   System.out.println("Age of the player :"+age);
	   System.out.println("Gender of the player :"+gender);
	   System.out.println("Country of the of player :"+ country);
	   System.out.println("Captaincy of the player is possible :"+ captaincy);
   }
   public void show()
   
   {
	   System.out.println("I love football");
   }
   
}
