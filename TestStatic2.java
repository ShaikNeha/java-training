class Student 
{
	int rollno;
	String name;
	static String college="ITC";
	static void change()
	{
		college="Mother Theresa";
	}
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
	class TestStatic2 
	{
	
	public static void main(String[] args) 
	{
		Student.change();
		Student S1=new Student(111,"Chinna");
		Student S2=new Student(222,"vijay");
		Student S3=new Student(333,"Deverakonda");
		S1.display();
		S2.display();
		S3.display();
	}
}
