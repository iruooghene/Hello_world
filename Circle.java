import java.util.Scanner;
public class Circle{
public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter value for Radius");
 double Radius = input.nextDouble();

System.out.print("Enter value for Pi");
  double Pi = input.nextDouble();

double diameter = Radius * 2;

double circumference = 2 * Pi * Radius ;

double area = Pi * Radius * Radius;


System.out.printf("diamter is %f %n circumference is %f %n area is %f", diameter, circumference, area);


       }


}