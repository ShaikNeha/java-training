import java.util.*;
public class Program205
{
public static void main(String args[])
{
 char ch;
 System.out.println("enter a character:");
 Scanner Sc=new Scanner(System.in);
 ch=Sc.next().charAt(0);
 System.out.println();
 if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
 System.out.println("ch+is an alphabet");

else
 System.out.println("ch+is not an alphabet");

}
}