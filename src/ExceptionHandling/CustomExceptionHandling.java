package ExceptionHandling;

class InvalidAgeException extends Exception
{
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String msg)
	{
		System.out.println("Exception is: "+msg);
	}
}

public class CustomExceptionHandling {
	
	public void checkAge(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("Age valid for process");
		}
		else
		{
			throw new InvalidAgeException("age is below 18");
		}
	}

	public static void main(String[] args) {
		CustomExceptionHandling t=new CustomExceptionHandling();
		try {
		t.checkAge(13);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}

	}

}


