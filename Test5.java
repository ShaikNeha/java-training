import java.util.Scanner;
class Reverse
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
	public int ReverseDigit()//n1=12345
	{
		int sum=0;
		int n=this.n1;
		while(n>0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}//while
	return sum;
	}//sum Digit
}//number
public class Test5
{
  public static void main(String[] args) 
	{
	  Reverse ob1=new Reverse();
	  Scanner Sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int temp=Sc.nextInt();
	 ob1.setDigit(temp);
	 int res=ob1.ReverseDigit();
	 System.out.println("Reverse of Digits of "+ob1.getn1()+" is "+res);
	}
}
