class Employee 
{
	float salary=40000;
}
class Programmer extends Employee
{
	int bonus=10000;

	public static void main(String[] args) 
	{
		Programmer P=new Programmer();
        System.out.println("Programmer salary is:"+P.salary);
		System.out.println("bonus of programmer is:"+P.bonus);
	}
}
