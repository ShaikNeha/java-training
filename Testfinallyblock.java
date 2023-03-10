public class Testfinallyblock{
public static void main(String[] args) 
{
try  
{
 int date=25/5;
System.out.println(date);


}
catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	finally{
		System.out.println("finally key is always executed");
	}
	
    System.out.println("rest of code");

	}
}
