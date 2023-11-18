import java.util.Scanner;
public class Meter{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter value in ft");
 double ft = input.nextDouble();

double result = ft * 0.305;

System.out.printf("meter is %f", result);

     }



}