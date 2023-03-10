public class Multiplecatchblock{
public static void main(String[] args) 
{
try  
{
 int a[]=new int[5];
 a[5]=30/0;

}
catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception occure");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(" Array Index OutOf Bounds Exception occure");
	}
	catch(Exception e)
	{
		System.out.println("parent Exception occure");
	}
	
    System.out.println("rest of code");

	}
}
