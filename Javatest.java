import java.util.Scanner;
class Javatest 
{
	static boolean isNumber(String s)
	{
		for(int i=0;<s.length();i++)
		{
			if(character.is Digit(s.charAt(i)==false)
			{
				return false;
			}
		}
		return true;
	}
	static public void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		String str=Sc.next();
		if(isNumber(str))
			System.out.println("integer");
		else 
	
		System.out.println("String");
	}
}
