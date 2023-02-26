import java.util.*;
public class Program307d
{
	static double area_of_circle(double radius)
	{
		return Math.PI*radius*radius;
    }
	static double perimeter_of_circle(double radius)
	{
		return 2*Math.PI*radius;
	}

	public static void main(String[] args) 
	{
		double radius;
		Scanner Sc=new Scanner(System.in);
		System.out.println("\n enter the radius of circle:");
		radius=Sc.nextDouble();
		
		System.out.println("area of the circle:"+area_of_circle(radius));
		System.out.println("perimeter of the circle:"+perimeter_of_circle(radius));

	}
}
