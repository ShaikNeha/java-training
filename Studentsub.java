import java.util.*;
public class Studentsub
{
  public static void main(String[] args) 
	{
	  Scanner Sc=new Scanner(System.in);
	  System.out.println("enter number of studebt");
	  int n=Sc.nextInt();
	  int rollNo[]=new int[n];
	  int s1[]=new int[n];
	  int s2[]=new int[n];
      int s3[]=new int[n];
	  double total[]=new double[n];
	  double avg[]=new double[n];
	  for(int i=0;i<n;i++)
		{
		  System.out.println("enter student"+(i+1)+"details:");
		  System.out.println("RollNo:");
		  rollNo[i]=Sc.nextInt();
		  System.out.println("subject 1 marks");
		  s1[i]=Sc.nextInt();
		  System.out.println("subject 2 marks");
		  s2[i]=Sc.nextInt();
		  System.out.println("subject 3 marks");
		  s3[i]=Sc.nextInt();
		  total[i]=(s1[i]+s2[i]+s3[i]);
		  avg[i]=total[i]/3.0;
		}
		System.out.println("RollNo\tTotal\tAverage");
		for	(int i=0;i<n;i++)
		{
			System.out.println(rollNo[i]+"\t"+total[i]+"\t"+avg[i]);


		
	}
	}
}

