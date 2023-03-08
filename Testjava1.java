import java.util.Scanner;
public class Testjava1 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter three values");
		double principal,rate,time;
		principal=Sc.nextDouble();
		rate=Sc.nextDouble();
		time=Sc.nextDouble();
		double CI=principal*(Math.pow((1+rate/100),time));
		System.out.println("compound interest="+CI);
	}
}
