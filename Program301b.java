import java.util.*;
public class Program301b
{
static void checkPositiveNegative(int a)
{
 if(a>=0)
   System.out.print("Positive");
  else
   System.out.print("Negative");
}
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int num;
System.out.println("enter the number");
num=Sc.nextInt();
checkPositiveNegative(num);
}
}