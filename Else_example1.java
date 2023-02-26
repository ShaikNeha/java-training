import java.util.Scanner;
class Else_example1 
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		i=Sc.nextInt();
		j=Sc.nextInt();
        if(j==0)
        System.out.println("Division by error");
	else
		System.out.println(i+"Divided by"+j+"is"+(i/j));
	}
}
