import java.util.Scanner;
public class Squares{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer");
int number1 = input.nextInt();

System.out.print("Enter second integer");
int number2 = input.nextInt();

int squareOfNumber1 = number1 * number1;

int squareOfNumber2 = number2 * number2;

int sum = squareOfNumber1 + squareOfNumber2;

int difference = squareOfNumber1 - squareOfNumber2;

System.out.printf("%d%n%d" , sum , difference);


      }



}





