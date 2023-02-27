class  Print3
{
	static void printpatternOneRow(char ch,int nc)
	{
		for(int i=0;i<nc;i++)
		{
		System.out.print(ch);
}
System.out.print("\n");
	}
	static void printpatternDec(int nr,char ch)
	{
		for(int i=1;i<=nr;i++)
		{
			printpatternOneRow(ch,i);
		}
	}
	static void printpatterninc(int nr,char ch)
	{
		for(int i=nr;i>0;i--)
		{
			printpatternOneRow(ch,i);
		}
	}

	public static void main(String[] args) 
	{
	Scanner Sc=new Scanner(System.in);
	int n =Sc.nextInt();
	if(n%2==0)
		{
		printpattrenDec(n/2,'*');
		printpattreninc(n/2,'*');

	}
	else
		{
		printpattreninc(n/2,'*');

		printpattrenDec(n/2+1,'*');


}
	}
}