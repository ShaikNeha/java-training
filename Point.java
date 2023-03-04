import java.util.*;
 class Point
{
	private double x;
	private double y;
	public Point()
	{ 
	x=0;
	y=0;
	}
public Point(double x1,double y1)
	{
	this.x=x1;
	this.y=y1;
	}
	public double distance_from_origin()
	{
		double dist;
		dist=Math.sqrt(x*x+y*y);
		return dist;
	}
	public double distance_from_Point(Point Q)
	{
		double diff_x=x-Q.x;
		double diff_y=y-Q.y;
		return Math.sqrt(diff_x* diff_x+diff_y*diff_y);
	}
	public void translate(double x_trans,double y_trans)
	{
		x=x+x_trans;
		y=y+y_trans;
	}
}