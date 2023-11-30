import java.util.Scanner;

  public class Multiplication{

  public static void main (String[] args){

  Scanner scanner = new Scanner (System.in);

 System.out.print("Enter a number from 1- 10: ");
  int number = scanner.nextInt();

if (number < 0 || number > 10 ){
 System.out.print("INVALID NUMBER");

 }


  else{

   int count = 1 ;
   
while( count < 13 ){
  
int multiplication = number * count ;

System.out.printf(" %d  x  %d   =  %d%n ", number , count , multiplication);

  count = count + 1;

}

}

}

}



   