package exceptions;

public class KeyNotFoundException extends Exception
{
	private static final long serialVersionUID = 682267963980463371L;

	public KeyNotFoundException()
	{
		super();
	}

	/**
	 * @param message error message specific to cause of error.
	 */
	public KeyNotFoundException( String message )
	{
		super( message );
	}
}
