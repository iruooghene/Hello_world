import java.util.Scanner;
    public class Energy{
    public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   
   System.out.print ("Enter finalTemperature");
    double finalTemperature=input.nextDouble();

  System.out.print ("Enter initialTemperature");
    double initialTemperature=input.nextDouble();

 System.out.print ("Enter weight in kilograms");
   double weight=input.nextDouble();

  double changeInTemperature=finalTemperature-initialTemperature;
  double result =(changeInTemperature*weight)*4.18;

System.out.printf("energy is %f", result);
   

        }

    
 }
 
     




    
    