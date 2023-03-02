import java.util.Scanner;
class Factorial
{
	public int n;
	public void setDigit(int n)
	{
		this.n=n;
	}
	public int getn()
	{
		return this.n;
	}
	public int FactorialDigit()
{
		int res=1;
		int n=this.n;
		while(n>0)
	{
	if(n==0)
		{
				return 1;
		}
		else
		{
          res=res*n;
		  n=n-1;
		}
		

}
return res;

}
}

public class Test6
{
 public static void main(String[] args) 
	{
	 Scanner Sc=new Scanner(System.in);
	 Factorial ob1=new Factorial();
	
     System.out.println("enter the number");
	 
	 ob1.setDigit(Sc.nextInt());
	 int res=ob1.FactorialDigit();
	 if(ob1.getn()<0)
		{
		 System.out.println("invalid");
		}
		else
		{
	 System.out.println("Factorial of Digit of"+ob1.getn()+" is "+res);
		}
	}
}


