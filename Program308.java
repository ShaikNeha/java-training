//program to print largest amoung three numbers
import java.util.*;
public class Program308
{
public static void main(String args[])
{
int a,b,c;
System.out.println("enter three numbers:");
Scanner Sc=new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
c=Sc.nextInt();
if(a>b&&a>c)
System.out.println("The length amoung the three numbers is"+a);
else if(b>a&&a>c)
System.out.println("The length amoung the three numbers is"+b);
else
System.out.println("The length amoung the three numbers is"+c);
}
}
