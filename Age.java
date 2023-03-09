import java.util.*;
public class Age
{
  public static void main(String[] args) 
	{
	  Scanner Sc=new Scanner(System.in);
	  int below18=0,in18and60=0,above60=0;
	  System.out.println("enter 10 array elements");
	  int Arr[]=new int[10];
	  for(int i=0;i<Arr.length;i++)
		  Arr[i]=Sc.nextInt();
	  for(int j=0;j<Arr.length;j++)
		{
		  if(Arr[j]<18)
			  below18=below18+1;
		  else if(Arr[j]>=18&&Arr[j]<60)
			  in18and60=in18and60+1;
		  else
			  above60=above60+1;
		}
		System.out.println("Below 18 numbers:"+below18);
		System.out.println("Below 18 and 59 numbers:"+in18and60);
		System.out.println("above 60 numbers:"+above60);
	}
	}

