import java.util.Scanner;
       public class DaysMonths{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter user name:");
       String name = input.nextLine();

       System.out.printf("%s enter month:", name);
       int month = input.nextInt();

       System.out.printf("%s enter year:", name);
       int year = input.nextInt();

       if( month == 1 ){
       System.out.printf("31 days in January");
        }

       if ( month == 2){
        System.out.printf("28 days in Febuary");
        }

      if ( month == 3){
        System.out.printf("31 days in March");
        }

      if ( month == 4){
        System.out.printf("30 days in April");
       }

       if ( month == 5){
        System.out.printf("31 days in  May");
       }

      if ( month == 6){
      System.out.printf("30 days in  June");
       }

      if ( month == 7){
      System.out.printf("31 days in July");
       }
 
      if ( month == 8){
      System .out.printf("31 days in August");
       }

     if ( month == 9){
     System.out.printf("30 days in September");
       }

    if ( month == 10){
      System.out.printf("31 days in  October");
      }

    if ( month == 11){
      System.out.printf("30 days in November");
      }

   if ( month == 12){
      System.out.printf("31 days in December");
     }

       }

   }

    