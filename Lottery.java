
import java.util.Scanner;
import java.util.Random;
 public class Lottery{
 public static void main(String[] args){
 
Scanner input = new Scanner(System.in);
   System.out.print("Enter lottery number: ");
     int guess1 = input.nextInt();
System.out.print("Enter lottery number: ");
    int guess2 = input.nextInt();
System.out.print("Enter lottery number: ");
    int guess3 = input.nextInt();

Random rand = new Random();
   int upperbound = 10;
int lottery1 = rand.nextInt(10);
int lottery2 = rand.nextInt(10);
int lottery3 = rand.nextInt(10);

        if( guess1 == lottery1 && guess2 == lottery2 && guess3 == lottery3){
 System.out.printf("Congratulation!you entered in the exact order;reward is $10000");
    }
   if ( guess1 == lottery3 || guess2 == lottery1 || guess3 == lottery2){
 System.out.printf("Congratulations!your guess match all digits in the lottery;reward is $3000");
   }
    if (guess1 == lottery1 || guess2 == lottery2 || guess3 == lottery3 || guess2 == lottery1 || guess3 == lottery2 || guess1 ==lottery3 || guess2 == lottery3){
  System.out.printf("Congratulation!one of your guess matched the lottery number;reward is $1000");
  }
   if (guess1 != lottery1 || guess2 != lottery2 || guess3 != lottery3){
   System.out.printf("Pls try again");

    }

}

   }