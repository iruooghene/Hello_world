import java.util.Scanner;
public class Integers {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter an integer:");
int number1 = input.nextInt();

System.out.print("Enter an integer:");
 int number2 = input.nextInt();

System.out.print("Enter an integer:");
  int number3 = input.nextInt();

int sum = number1 + number2 + number3 ;

int average = sum / 3 ;

int product = number1 * number2 * number3 ;

System.out.printf("the sum is %d %n the average is %d %n the product is %d", sum , average , product);

if ( number1 >= number2 && number1 >= number3)
 System.out.printf("Largest is %d");

if ( number2 >= number1 && number2 >= number3)
  System.out.printf("Largest is %d");

if ( number3 >= number1 && number3 >= number2)
   System.out.printf("Largest is %d");

if ( number1 <= number2 && number1 <= number3)
    System.out.printf("Smallest is %d");

if ( number2 <= number1 && number2 <= number3)
   System.out.printf("Smallest is %d");

if ( number3 <= number1 && number3 <= number2)
   System.out.printf("Smallest is %d");


      }



}


 