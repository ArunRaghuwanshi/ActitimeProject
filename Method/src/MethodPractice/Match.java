package MethodPractice;

public class Match {
	
	public static void main(String[]args)
	{
		FootballPlayer f=new FootballPlayer("Macy",24,"male","india",true,"Red club",1);
	stadium(f);
		CricketPlayer c=new CricketPlayer("virat",36,"male","india",true,"india","batsman");
		stadium(c);
			
	}
     public static void stadium(Player p)
     {
    	 p.details();
    	 if(p instanceof FootballPlayer)
    	 {
    		 FootballPlayer e=(FootballPlayer)p;
    		 e.show();
    	 }
    	 else
    	 {
    		 CricketPlayer d=(CricketPlayer)p;
    		 d.view();
    	 }
     }
}
