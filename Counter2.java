class Counter2 
{
	static int count=0;
	Counter2()
	{
		count++;
       System.out.println(count);
	}	
	public static void main(String[] args) 
	{
		Counter2 C1=new Counter2();
		Counter2 C2=new Counter2();
		Counter2 C3=new Counter2();
	}
}
