//program to accept month number as input and display monthname
import java.util.Scanner;
public class Program307
{
static void displayMonth(int month_no)
{
String S=new String();
if(day_no==0)S="jan";
if(day_no==1)S="feb";
if(day_no==2)S="mar";
if(day_no==3)S="api";
if(day_no==4)S="may";
if(day_no==5)S="june";
if(day_no==6)S="july";
if(day_no==7)S="aug";
if(day_no==8)S="sep";
if(day_no==9)S="oct";
if(day_no==10)S="nov";
if(day_no==11)S="dec";
if((month_no<0)||(month_no>11))S="incorrect month number";
System.out.println("Month is:"+S);
}
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("enter the month number(0_11):");
int month_no=Sc.nextInt();
displayMonth(month_no);
}
}
