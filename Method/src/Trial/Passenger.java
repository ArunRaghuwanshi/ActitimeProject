package Trial;

import java.util.Scanner;

public class Passenger extends Bus {

	Scanner s = new Scanner(System.in);

	public Passenger(int busno, String name, double price) {
		super(busno, name, price);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Bus nameOfBus = new Bus(1234, "Volvo", 4500d);
		Passenger p = new Passenger(1234, "redbus", 6500d);
		
		//p.addBusNo();
		//p.findBusName();
		p.quality();
		

	}

	public void findBusName() {
		System.out.println("enter bus no");
		int number = s.nextInt();
		if (number == getBusno()) {
			System.out.println("This is your Bus Name:" + getName());
		} else {
			System.out.println("you have enterd wrong number");
		}
	}

	public void addBusNo() {
		System.out.println("Enter old number");
		int number = s.nextInt();
		if (number == getBusno()) {
			System.out.println("enter new busnumber");
			int newNumber = s.nextInt();

			setBusno(newNumber);
			System.out.println("your bus has been updated");
		} else {
			System.out.println("you have enterd wrong no");
		}
	}
}
