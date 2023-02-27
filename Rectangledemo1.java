import java.util.*;
class Rectangle
{
	private double length;
	private double breath;
	public Rectangle()
	{
		length=breath=0;
}
public Rectangle(double l,double b)
	{
	length=l;
	breath=b;
	}
	public void result()
{
		System.out.println("perimeter of rectangle with length"+length+"breath"+breath+"is" +(2*(length+breath)));
}
}
public class Rectangledemo1
{

public static void main(String args[])
	{
	double length,breath,result;
	Scanner Sc=new Scanner(System.in);
    System.out.println("\n enter length of the triangle:");
	length=Sc.nextDouble();
	System.out.println("\n enter breath of the triangle:");
	breath=Sc.nextDouble();
	Rectangle r1=new Rectangle();
	r1.result();
	Rectangle r2=new Rectangle();
	r2.result();
	
	
	
	}
}
	

