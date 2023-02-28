public class StaticMethod
{
	static void myStaticMethod()
	{
		System.out.println("Static method can be called without creating object");
	}
	public void mypublicMethod()
	{
		System.out.println("public method must be called by creating object");
}

	public static void main(String[] args) 
	{
		myStaticMethod();
		StaticMethod myObj=new StaticMethod();
		myObj.mypublicMethod();
		
	}
}
