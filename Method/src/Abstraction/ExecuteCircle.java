package Abstraction;

public class ExecuteCircle {

	public static void pass(Drawable d)
	{
		d.draw();
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		pass(c);
		Rectangle r=new Rectangle();
		pass(r);
	}
}
