package Array;

public class MobileEx {

	public static void main(String[] args) {
		
		Mobile ob[]=new Mobile[5];
		Mobile m1=new Mobile("Micromax",450);
		Mobile m2=new Mobile("Nokia",500);
		Mobile m3=new Mobile("Samsung",550);
		Mobile m4=new Mobile("Oppo",600);
		Mobile m5=new Mobile("Oneplus",650);
		ob[0]=m1;
		ob[1]=m2;
		ob[2]=m3;
		ob[3]=m4;
		ob[4]=m5;
		
		//compare(ob);
		//checkLength(ob);
		printchar(ob);
	}
	public static void compare(Mobile ob[])
	{
		for(int i=0;i<ob.length;i++)
		{
			//if("Oppo".equals(ob[i].getBrand()))
			if(ob[i].getBrand().equals("Oppo"))
			{
				print(ob[i]);
			}
		}
	}
	public static void print(Mobile ob)
	{
		System.out.println("Brand : "+ob.getBrand()+"\n"+"Price :"+ob.getPrice());
	}
	public static void checkLength(Mobile ob[])
	{
		for(int i=0;i<ob.length;i++)
			if(ob[i].getBrand().length()>6)
			{
				System.out.println(ob[i].getBrand());
			}
	}
		public static void printchar(Mobile ob[])
		{
			for(int i=0;i<ob.length;i++)
			{
				String s=ob[i].getBrand();
				for(int j=0;j<s.length();j++)
					if(s.charAt(j)=='l')
					{
					  System.out.println(s);
					}
			   }
		}
}