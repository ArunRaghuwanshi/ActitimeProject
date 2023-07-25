package ExceptionHandaling;

public class FinallyEx {

	public static void main(String[] args) {
		String s="java Class";
		try
		{
			for(int i=0;i<=s.length();i++)
			{
				System.out.println(s.charAt(i));
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("iam executed");
		}
	}
}
