//program to accept day number as input and display day name using else if
import java.util.Scanner;
public class Program306b
{
static void displayDay(int day_no)
{
String S=new String();
if(day_no==0)S="Sunday";
else if(day_no==1)S="Monday";
else if(day_no==2)S="Tuesday";
else if(day_no==3)S="Wednesday";
else if(day_no==4)S="Thursday";
else if(day_no==5)S="Friday";
else if(day_no==6)S="Saterday";
else if((day_no<0)||(day_no>6))S="incorrect day number";
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
