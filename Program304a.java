//program to swapping two numbers using third variable
import java.util.*;
public class Program304a
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=Sc.nextInt();
int b=Sc.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("number after swapping:"+a+""+b);
}
}
