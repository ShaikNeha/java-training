class Box 
{
	public double width;
	public double height;
	public double depth;

public Box()
{
	width=height=depth=0.0;
}
	public Box(double w,double h,double d) 
	{
		width=w;
		height=h;
		depth=d;
	}
	public void volume(){
		System.out.println("volume="+(width*height*depth));
	}
}
public class Boxdemo1{
	public static void main(String args[])
	{
		Box myBox1=new Box();
		Box myBox2=new Box(10,15,20);
		myBox1.volume();
		myBox2.volume();


	}
}
