import java.util.Scanner;
public class Test9
{
 public static void main(String[] args) 
 {
	 double x1,y1,x2,y2,res;
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("enter x1 coordinates and y1 coordinates");
	 x1=Sc.nextDouble();
	 y1=Sc.nextDouble();
	Point P=new Point(x1,y1);
	 //res=P.distance_from_origin();
	// System.out.println("distance of point from origin is"+res);
	 System.out.println("enter x2 coordinates and y2 coordinates of point");
	 x2=Sc.nextDouble();
	 y2=Sc.nextDouble();
	 Point Q=new Point(x2,y2);
	 res=P.distance_from_Point(Q);
	 System.out.println("distance between Point p and q"+res);

	 }
}

