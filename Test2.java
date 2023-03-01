import java.util.*;
class MyDate
{
	private int day;
	private int month;
	private int year;
	public void setDay(int day)
	{
		this.day=day;
	}
	private int getDay()
	{
		return day;
	}
     public void setMonth(int month)
	{
		this.month=month;
	}
	private int getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	private int getYear()
	{
		return year;
	}
	public void displayDate()
		{
			System.out.println("the date you have given"+getDay()+"/"+getMonth()+"/"+getYear());
		}
}
public class Test2
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		MyDate d1=new MyDate();
		System.out.println("enter day");
		d1.setDay(Sc.nextInt());
		System.out.println("enter  month");
		d1.setMonth(Sc.nextInt());
		System.out.println("enter year");
		d1.setYear(Sc.nextInt());
		d1.displayDate();
		MyDate d2=new MyDate();
		System.out.println("enter  day");
		d2.setDay(Sc.nextInt());
		System.out.println("enter  month");
		d2.setMonth(Sc.nextInt());
		System.out.println("enter  year");
		d2.setYear(Sc.nextInt());
		d2.displayDate();

		
	}
}
	