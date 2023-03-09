import java.util.*;
public class Factorial1
{
	public static void main(String[] args) 
	{
		int num;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a number for factor");
		num=Sc.nextInt();
		int size=(int)num/2;
		int[]FA=new int[size];
        int i,count=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				FA[count]=i;
				count=count+1;
				
			}
		}

		System.out.print("\n total factor of " + num + " : "+count);
		for(int j=0;j<count;j++)
	{
			System.out.print(FA[j]+" ");
	}
	}
}
