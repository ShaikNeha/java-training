import java.util.Scanner;
public class Armstrong1
{
	public static void main(String[] args) 
	{
	
	
		Scanner input=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=input.nextInt();
		int[]arr=new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("enter the "+(i+1)+" element");
			arr[i]=input.nextInt();
		}
		for(int num:arr)
		{
			int sum=0;
			int temp=num;
			int numLength=String.valueOf(num).length();
			while(temp !=0)
			{
		int digit=temp%10;
		sum+=Math.pow(digit,numLength);
		temp/=10;
			}
		if(sum==num)
			{
		
			
		System.out.println(num+"is an armstrong number");
	}
	else
		{
		System.out.println(num+"is not an armstrong");

}
}
input.close();
	}
}

