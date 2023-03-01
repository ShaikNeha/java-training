class Student 
{
	int rollno;
	String name;
	static String college="Mother Theresa";
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	}
	public class TestStatic4
	{
	
	public static void main(String[] args) 
	{
		Student S1=new Student(111,"Chinna");
		S1.display();
	
	}
}
