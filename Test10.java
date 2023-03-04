import java.util.Scanner;
public class Test10
{
 public static void main(String[] args) 
 {
	 double x1,y1,x2,y2;
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("enter x1 coordinates and y1 coordinates");
	 x1=Sc.nextDouble();
	 y1=Sc.nextDouble();
	Point1 P=new Point1(x1,y1);
	 System.out.println("enter x2 coordinates and y2 coordinates of point");
	 System.out.println("for translating of the point");
	 x2=Sc.nextDouble();
	 y2=Sc.nextDouble();
	 System.out.println("coordinate points is"+P.getX()+" ," +P.getY());
	 System.out.println("After translation:");
	 P.translate(x2,y2);
     System.out.println("coordinate points is"+P.getX()+" ," +P.getY());


	 }
}

