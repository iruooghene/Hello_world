import java.util.Scanner;
public class RunwayLength{
public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter value of speed");
 double speed= input.nextDouble();

System.out.print("Enter value of acceleration");
 double acceleration = input.nextDouble();

double squareOfSpeed = speed * speed;

double result = squareOfSpeed / (acceleration * 2);
 System.out.printf("runwaylength is %f%n", result );

       }


}