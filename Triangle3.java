public class Triangle3
{
	Point P;
	Point Q;
	Point R;
	public Point getP()
	{
		return this.P;
	}
	public Point getQ()
	{
		return this.Q;
	}
	public Point getR()
	{
		return this.R;
    }
public Triangle3(Point a,Point B,Point C)
	{
	
    this.P=new Point(A.x,A.y);
	this.Q=new Point(A.x,A.y);
	this.R=new Point(A.x,A.y);
	}
public triangle3(double x1,double y1,double x2,double y2,double x3,double y3)
	{
		this.P=new Point(x1,y1);
		this.Q=new Point(x2,y2);
		this.R=new Point(x3,y3);
	}
	public double perimeter()
	{
		double peri;
		peri=this.p.distance_from_point(this.Q);
		peri=peri+this.p.distance_from_point(this.R);
		peri=peri+this.Q.distance_from_point(this.R);
		return peri;
		public void Translate(double x_trans,double y_trans)
			this.P.translate(x_trans,y_trans);
			this.Q.translate(x_trans,y_trans);
			this.R.translate(x_trans,y_trans);

	}
	public double Area()
	{
		double peri,area,s,a,b,c;
		peri=this.perimeter();
		s=peri/2;
		a=this.p.distance_from_point(this.Q);
		b=this.p.distance_from_point(this.R);
        c=this.Q.distance_from_point(this.R);
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}




