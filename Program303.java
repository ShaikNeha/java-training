import java.util.*;
public class Program303
{
static boolean isEven(int n)
{
boolean even_no=true;
for(int i=1;i<=n;i++)
even_no=!even_no;
return even_no;
}
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=Sc.nextInt();
if(isEven(n))
System.out.print("Even/n");
else
System.out.println("Odd/n");
}
}