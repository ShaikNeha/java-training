//program to print smallest amoung three numbers using functions
import java.util.*;
public class Program309
{
static int smallest_amoung_three(int a,int b,int c)
{
if(a<b&&a<c)
return a;
else if(b<a&&b<c)
return b;
else if (c>a&&c>b) return c;
return 0;
}
public static void main(String args[])
{
int a,b,c;
System.out.println("enter the three numbers:");
Scanner Sc=new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
c=Sc.nextInt();
int max=smallest_amoung_three(a,b,c);
System.out.println("the smallest amoung the three numbers is "+max);
}
}