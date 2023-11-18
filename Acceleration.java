import java.util.Scanner;
public class Acceleration{

  public static void main(String[] args){
  Scanner input=new Scanner (System.in);
  System.out.print("Velocity 2");
   double Velocity2= input.nextDouble();
  System.out.print("Velocity 1");
   double Velocity1= input.nextDouble();
  System.out.print("time");
   double time=input.nextDouble();
   
   double acceleration= (Velocity2-Velocity1)/time;
   
   System.out.printf("the acceleration is %f", acceleration);

   }




   } 

    