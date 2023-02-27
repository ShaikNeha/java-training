import java.util.*;
public class Program501
{
	static double calculateArea(double b,double h)
	{
		double temp;
		temp=1.0/2.0*b*h;
		return temp;
	}
	public static void main(String[] args)
	{
		double base,height,area;
		Scanner Sc=new Scanner(System.in);
		System.out.println("\n enter base of right angle tringle:"); 
		base=Sc.nextDouble();
		System.out.println("\n enter height of right angle tringle:"); 
		height=Sc.nextDouble();
		area=calculateArea(base,height);
		System.out.println("Area of the tringle with base"+base+"height"+height+"is"+area+"sq unit");
	}
}



