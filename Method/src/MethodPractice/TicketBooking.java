package MethodPractice;

public class TicketBooking {
	public static void book(Train t)
	{
		t.welcome();
		t.purpose();
		
		if(t instanceof SuperTrain)
		{
			SuperTrain s=(SuperTrain)t;
			s.printTicketRate();
		}
		else
		{
			GoodTrain g=(GoodTrain)t;
			g.printCapacity();
		}
	} 
	public static void main(String[] args) {
		
		SuperTrain x=new SuperTrain();
		book(x);
		GoodTrain y=new GoodTrain();
		book(y);
	}

}
