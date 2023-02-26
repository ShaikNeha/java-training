import java.util.*;
public class Program307c
{
	static double area_of_rectangle(double length,double breath)
	{
		return(length*breath);
    }
	static double perimeter_of_rectangle(double length,double breath)
	{
		return 2*(length+breath);
	}

	public static void main(String[] args) 
	{
		double length,breath;
		Scanner Sc=new Scanner(System.in);
		System.out.println("\n enter the radius of rectangle:");
		length=Sc.nextDouble();
		breath=Sc.nextDouble();
		System.out.println("area of the rectangle:"+area_of_rectangle(length,breath));
		System.out.println("perimeter of the rectangle:"+perimeter_of_rectangle(length,breath));

	}
}
