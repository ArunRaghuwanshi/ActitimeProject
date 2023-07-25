package Trial;

public class InSufficientFundException extends RuntimeException {
	
	public InSufficientFundException(String s)
	{
		super(s);
	}
	
	public InSufficientFundException(String s, Throwable e)
	{
		super(s,e);
	}

}
