import java.util.Scanner;
import java.util.Random;
       public class Coin{
       public static void main(String[] args){

Scanner input = new Scanner(System.in); 
  System.out.print("Take a guess between 0 and 1: ");
    int guess = input.nextInt();

int head= 0;
int tail= 1; 
  
Random rand = new Random();
    int upperbound = 2;
int random = rand.nextInt(upperbound);

   if ( guess == random){
System.out.printf(" Congratulations! you guessed right", head , tail );
    }
    else{
System.out.printf("Your guess is incorrect,pls try again");
    }

      }

}