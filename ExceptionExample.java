public class ExceptionExample{
public static void main(String[] args) 
{
try  
{
 int date=100/0;
}catch(ArithmeticException e)
	{
		System.out.println(e);
	}
		System.out.println("rest the code...");

	}
}
