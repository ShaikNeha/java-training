import java.util.Scanner;
class Number
{
	public int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public long productDigit()
	{
		long res=1;
		int n=this.num;
			while(n>0)
		{
			res=res*(n%10);
			n=n/10;
		}
		return res;
	}
	public int Calculatefactorial()
{
		int result=1;
		int n=this.num;
		while(n>=0)
	{
	if(n==0)
		{
	result=result*1;
	break; 
}
else
		{
          result=result*n;
		  n=n-1;
		  
		}
	}
return result;
}
}


public class Test7
{
 public static void main(String[] args) 
	{
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("enter a non-negative integer:");
	 int temp=Sc.nextInt();
	 Number ob=new Number();
	
	 if(temp>=0)
		{
		 ob.setNum(temp);
		 System.out.println(ob.Calculatefactorial());
		 System.out.println(ob.productDigit());
		}
		else
		{
	 System.out.println("invalid");
		
	}
}
}

