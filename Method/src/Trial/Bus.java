package Trial;

public class Bus implements Comparable<Bus> {
	private int busno;
	String name;
	double price;

	public Bus(int busno, String name, double price) {
		this.busno = busno;
		this.name = name;
		this.price = price;
	}
	public int compareTo(Bus s)
	{
		if(this.busno>s.busno)
			return 1;
			else if(this.busno<s.busno)
				return -1;
			else
				return 0;
		
		}
	

	@Override
	public String toString() {
		return "Bus [busno=" + busno + ", name=" + name + ", price=" + price + "]";
	}


	public int getBusno()
	{
		return busno;
	}
	public void setBusno(int busno)
	{
		this.busno=busno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void quality()
	{
		System.out.println("quality of bus is amazing");
	}

}
