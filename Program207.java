import java.util.*;
public class Program207
{
public static void main(String args[])
{
 char ch;
 Scanner Sc=new Scanner(System.in);
 ch=Sc.next().charAt(0);
if (ch>=65&&ch<=90)
System.out.println("upper");
 else if (ch>=97&&ch<=122)
System.out.println("lower");
 else if (ch>=48&&ch<=57)
System.out.println("number");
else
System.out.println("symbol");
 
}
}