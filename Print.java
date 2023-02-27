class Print 
{
	public static void print_multiple_stare(int i)
	{
		int k=1;
		for(k=1;k<=i;k=k+1)
			System.out.print("*");
	}
	public static void main(String[] args) 
	{
		int j=5;
		print_multiple_stare(j);
		System.out.println(" ");
	}
}
