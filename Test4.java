import java.util.Scanner;
class Number 
{
	private int n1;
	public void setDigit(int n1)
	{
		this.n1=n1;
	} 
	public int getn1()
	{  
	 return this.n1;	 
	}
	public int sumDigit()//n1=12345
	{
		int sum=0;
		int n=this.n1;
		while(n>0)
		{
			sum=sum+n%10;//sum+=num%10
			n=n/10;
		}//while
	return sum;
	}//sum Digit
}//number
public class Test4
{
  public static void main(String[] args) 
	{
	  Number ob1=new Number();
	  Scanner Sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int temp=Sc.nextInt();
	 ob1.setDigit(temp);
	 int res=ob1.sumDigit();
	 System.out.println("sum of Digits of "+ob1.getn1()+" is "+res);
	}
}
