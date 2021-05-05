package in;

public class Exception1 extends Exception
{
	Exception1(String s)
	{
		super(s);
	}

}

class TestException1
{
	public static void main(String[] args)
	{
		
		try {
			m11(7);
		} catch (Exception1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void m11( int i) throws Exception1
	{
		if(i>18)
		{
			throw new Exception1("age is not valid");
	
		}
		else
		{
			System.out.println("valid");
		}
	}
	
}