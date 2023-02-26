import java.util.*;
class Program307b
{
	static double area_of_square(double s)
	{
		return(s*s);
	}
	static double perimeter_of_square(double s)
	{
		return(4*s);
	}

	public static void main(String[] args) 
	{
		double s;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the area of the squsre");
		s=Sc.nextDouble();
		System.out.println("area of the square:"+area_of_square(s));
		System.out.println("perimeter of the square:"+perimeter_of_square(s));
	}
}
