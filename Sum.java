import java.util.*;
class Number
{
	private int num;
	public void setNum(int num)

	{this.num=num;}
	public int getNum()
	{return this.num;}
	public int sumDigit()
	{
		int num=this.num;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
		
	}
}
class Sum
{
public static void main(String[] args) 
	{
	  

	  Scanner Sc=new Scanner(System.in);
	   System.out.println("enter number of arrays");
	  int size=Sc.nextInt();
      int[]numList=new int[size];
	 int[]numSum=new int[size];

	   System.out.println("enter "+size+" "+ " numbers");

	
	  for(int i=0;i<size;i++)
		  
		{
			numList[i]=Sc.nextInt();
			
		}
		Number obj1=new Number();
		
		for(int i=0;i<size;i++)
		{
			obj1.setNum(numList[i]);
			numSum[i]=obj1.sumDigit();
			}
	  for(int i=0;i<size;i++)

		{
		System.out.print(numSum[i]+",");
		
	}
	}
	}

