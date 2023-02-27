import java.util.*;
public class Triangle
{
	static double area_of_triangle(double base,double height)
	{
		return 0.5*base*height;
	}
	public static void main(String[] args)
	{
		double base,height;
		Scanner Sc=new Scanner(System.in);
		System.out.println("\n enter the area of the triangle");
		base=Sc.nextDouble();
		height=Sc.nextDouble();
		System.out.println("area of the triangle:"+area_of_triangle(base,height));
	}
}



