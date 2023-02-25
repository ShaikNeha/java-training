//program to find the area of circle riventhe radius
import java.util.Scanner;
public class Program307a
{
static double area_of_a_circle(double radius)
{
return Math.PI*radius*radius;
}
public static void main(String args[])
{
double radius;
Scanner Sc=new Scanner(System.in);
System.out.println("\n enter the rasius of the circle:");
radius=Sc.nextDouble();
System.out.println("Area of the circle:"+area_of_a_circle(radius));
}
}
