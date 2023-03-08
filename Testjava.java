import java.util.Scanner;
public class Testjava 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter three values");
		float P,R,T;
		P=Sc.nextFloat();
		R=Sc.nextFloat();
		T=Sc.nextFloat();
		float s1=(P*R*T)/100;
		System.out.println("simple interest="+s1);
	}
}
