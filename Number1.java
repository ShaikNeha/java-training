import java.util.*;
public class Number1
{
	static int Gcd(int u,int v)
	{
		if(u==0)
			return v;
		return Gcd(v%u,u);
	}
	static int Lcm(int u,int v)
	{
		return(u/Gcd(u,v))*v;
	}

	public static void main(String[] args) 
	{
int u,v;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the numbers for Lcm");

u=Sc.nextInt();
v=Sc.nextInt();
		System.out.println("Lcm of"+u+"and"+v+"is"+Lcm(u,v));
		
		
	}
}
