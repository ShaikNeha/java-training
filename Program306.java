//program to accept day number as input and display day name
import java.util.Scanner;
public class Program306
{
static void displayDay(int day_no)
{
String S=new String();
if(day_no==0)S="Sunday";
if(day_no==1)S="Monday";
if(day_no==2)S="Tuesday";
if(day_no==3)S="Wednesday";
if(day_no==4)S="Thursday";
if(day_no==5)S="Friday";
if(day_no==6)S="Saterday";
if((day_no<0)||(day_no>6))S="incorrect day number";
System.out.println("Day is:"+S);
}
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("enter the day number(0_6):");
int day_no=Sc.nextInt();
displayDay(day_no);
}
}
