import java.util.Scanner;
   public class Zellers{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
System.out.print("Enter month in figure eg 1 - january: ");
   int month = input.nextInt();
System.out.print("Enter day of month in figure: ");
   int day = input.nextInt();
System.out.print("Enter year: ");
   int year = input.nextInt();

int k = year % 100;
int j = year / 100 ;
int l = month + 1;
int m = (26 * l) / 10;

int resultH = (day + m + k + (k / 4) + (j / 4) + (5 * j))% 7;

if (resultH == 0)
  System.out.printf("Saturday");
if (resultH == 1)
   System.out.printf("Sunday");
if (resultH == 2)
   System.out.printf("Monday");
if (resultH == 3)
   System.out.printf("Tuesday");
if (resultH == 4)
   System.out.printf("Wednesday");
if (resultH == 5)
   System.out.printf("Thursday");
if (resultH == 6)
   System.out.printf("Friday");

    }



} 

