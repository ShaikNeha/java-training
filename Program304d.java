//program to swapping two numbers using * and /
import java.util.*;
public class Program304d
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=Sc.nextInt();
int b=Sc.nextInt();
a=(a*b)/(b=a);
System.out.println("number after swapping:"+a+""+b);
}
}
