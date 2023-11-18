import java.util.Scanner;
public class Comparison{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter an input");
int number1 = input.nextInt();

 System.out.print("Enter an input");
 int number2 = input.nextInt();

int squareOfNumber1 = number1 * number1 ;
   if( squareOfNumber1 > number2);
System.out.printf("%d > %d%n" , squareOfNumber1, number2);
   

if( squareOfNumber1 == number2) 
System.out.printf("%d ==%d%n" , squareOfNumber1, number2);
    

if( squareOfNumber1 != number2) 
System.out.printf("%d != %d%n" , squareOfNumber1, number2);
    

if( squareOfNumber1 < number2) 
System.out.printf("%d < %d%n" , squareOfNumber1, number2);
      

     }

}