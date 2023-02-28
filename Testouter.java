class Testouter 
{
	static int data=30;
	static class inner{
		void msg(){
			System.out.println("data is"+data);
		}
	}
	public static void main(String[] args) 
	{
		Testouter.inner obj=new Testouter.inner();
		obj.msg();
	}
}
