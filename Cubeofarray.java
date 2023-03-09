import java.util.*;
public class Cubeofarray
{
  public static void main(String[] args) 
	{
	  Scanner Sc=new Scanner(System.in);
	  int cube[]=new int[10];
	  System.out.println("enter 10 array elements");
	  int Arr[]=new int[10];
	  for(int i=0;i<Arr.length;i++)
		  Arr[i]=Sc.nextInt();
		System.out.println("cube of numbre");
		for(int j=0;j<Arr.length;j++)
		{
			cube[j]=Arr[j]*Arr[j]*Arr[j];
		System.out.println(cube[j]);
		
	}
	}
}

