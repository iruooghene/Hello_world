import java.util.Scanner;
public class Bmi{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

System.out.print("Enter weight in kilograms:");
   double weight=input.nextDouble();

System.out.print("Enter height in meters:");
   double meters=input.nextDouble();

double conversionToPounds = weight * 0.45359237;

double conversionToInches =(meters*meters)*39.37; 

double Bmi= conversionToPounds*703 / conversionToInches ;

System.out.printf("pound is %f %n inches is %f %n bmi is %f",conversionToPounds, conversionToInches, Bmi);


      }




}