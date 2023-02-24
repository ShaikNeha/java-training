import java.util.*;
public class Program202
{
static boolean isEven(int n)
{
return((n/2)*2==n);
}
public static void main(String args[])
{
 Scanner Sc=new Scanner(System.in);
int n;
System.out.println("enter the number:");
n=Sc.nextInt();
if(isEven(n))
  System.out.print("Even\n");
  else
  System.out.print("Odd\n");
}
}