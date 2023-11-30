import java.util.Scanner;
    public class Multiples{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter the first number: ");
  int firstNumber = input.nextInt();
System.out.print("Enter second number: ");
   int secondNumber = input.nextInt();
int tripleFirst = firstNumber * 3;
int doubleSecond = secondNumber * 2;

if( tripleFirst % doubleSecond == 0){
System.out.print("The first number tripled is a multiple of the second number doubled.");
   }

else{
System.out.print("The first number tripled is not a a multiple of the second number doubled.");
  }

}  

     }