import java.util.*;
public class Program201
{
public static void main(String args[])
{
 Scanner Sc=new Scanner(System.in);
int n;
System.out.println("enter the number:");
n=Sc.nextInt();
if(n%2==0)
 {
   System.out.println("even\n");
   System.out.println(n+"is even\n");
 }
else
 {
  System.out.println("odd\n");
  System.out.println(n+"is odd\n");
 }
}
}