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
		for(int i=nr;i>0;i--)
		{
			printpatternOneRow(ch,i);
		}
	}
	static void printpatterninc(int nr,char ch)
	{
		for(int i=1;i<=nr;i++)
		{
			printpatternOneRow(ch,i);
		}
	}

	public static void main(String[] args) 
	{
	int n=10;
	char c='*';
	if(n%2==0)
		{
		printpatterninc(n/2,c);
		printpatternDec(n/2,c);
		}
else
		{
	     printpatterninc((int)(n/2),c);
		 printpatternDec((n+1)/2,c);


}
}
}
