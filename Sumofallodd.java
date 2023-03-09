import java.util.*;
public class Sumofallodd
{
  public static void main(String[] args) 
	{
	  Scanner Sc=new Scanner(System.in);
	  int Sumodd=0;
	  System.out.println("enter 10 array elements");
	  int Arr[]=new int[10];
	  for(int i=0;i<Arr.length;i++)
		  Arr[i]=Sc.nextInt();
	  for(int j=0;j<Arr.length;j++)
		{
		  if(Arr[j]%2!=0)
			{
			  Sumodd=Sumodd+Arr[1];
			}
		}
		System.out.println("Sum of odd numbers:"+Sumodd);
	}
	}

