package Abstraction;

public class AtmExecute {
  
	public static void main(String[] args) {
	Sbi b=new Sbi(2131824854l,1233,75000d);
	b.withDraw();
	b.checkBal();
	b.interest();
	}
}
