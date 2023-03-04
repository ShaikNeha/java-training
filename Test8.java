import java.util.Scanner;
public class Test8
{
 public static void main(String[] args) 
 {
	 double x1,y1,x2,y2,res;
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("enter x coordinates and y coordinates");
	 x1=Sc.nextDouble();
	 y1=Sc.nextDouble();
	 Point P=new Point(x1,y1);
	 res=P.distance_from_origin();
	 System.out.println("distance of point from origin is"+res);
	 }
}

