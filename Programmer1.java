class Employee 
{
	float salary=40000;
}
class Programmer1 extends Employee
{
	int bonus=10000;

	public static void main(String[] args) 
	{
		Programmer1 P=new Programmer1();
        System.out.println("Programmer salary is:"+P.salary);
		System.out.println("bonus of programmer is:"+P.bonus);
	}
}
