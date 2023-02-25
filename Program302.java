import java.util.*;
public class Program302
{
static int isEven(int n)
{
return(n&1);
}
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=Sc.nextInt();
if(isEven(n)==0)
System.out.print("Even/n");
else
System.out.println("Odd/n");
}
}