import java.util.Scanner;
       public class Age{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter a value:");
       int age = input.nextInt();

       if ( age < 0 ){

      System.out.printf("you no dey hear word,enter numbers greater than 0");
       }  

       if ( age > 0){
 
       int ageInYear = age * 365 ;

      System.out.printf("ageInYear is %d", ageInYear );

       }




    }


}

    