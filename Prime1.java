import java.util.Scanner;
class Number
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;}
		public int getNum()
	{
			return this.num;}
			public boolean checkprime(){
				if(this.num==1||this.num==2)return true;
				for(int i=2;i<this.num;i++)
				{
					if(this.num%i==0)return false;
				}
				return true;
			}
}
class Prime1
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		
        System.out.println("enter a number:");
		int temp=Sc.nextInt();
        Number ob1=new Number();
	   ob1.setNum(temp);
	   if(ob1.checkprime())
		
		
			System.out.print("prime");
			else
		
			System.out.print("not Prime");
	}
}

