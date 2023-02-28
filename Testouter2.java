class Testouter2
{
	static int data=30;
	static class inner{
	static	void msg(){
			System.out.println("data is"+data);
		}
	}
	public static void main(String[] args) 
	{
		Testouter2.inner obj=new Testouter2.inner();
		obj.msg();
	}
}
