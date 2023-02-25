//program to swapping two numbers without using third variable
import java.util.*;
public class Program304b
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=Sc.nextInt();
int b=Sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("number after swapping:"+a+""+b);
}
}
