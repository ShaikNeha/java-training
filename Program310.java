//program to print largest amoung three numbers using functions
import java.util.*;
public class Program310
{
public static void main(String args[])
{
int a,b,c;
System.out.println("enter the three numbers:");
Scanner Sc=new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
c=Sc.nextInt();
int max=0;
max=((a>b)&&(a>c))?a:((b>a)&&(b>c))? b:((c>a)&&(c>b))? c:a;
System.out.println("the largest amoung the three numbers is "+max);
}
}