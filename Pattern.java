class Pattern
{
	static void printpattern(char ch,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(ch);
		}
		System.out.print("\n");
	}
	public static void main(String[] args) 
	{
		printpattern('#',1);
		printpattern('#',2);
		printpattern('#',3);
		printpattern('#',4);
		printpattern('#',5);
	}
}
