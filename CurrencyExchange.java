import java.util.Scanner;
       public class CurrencyExchange{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter 0 to convert dollars to RMB and 1 to convert RMB to dollars :");
       int conversion = input.nextInt();

       if(conversion == 0){
       System.out.print("Enter exchange rate from dollar to rmb:");
       double conversionRate = input.nextDouble();

       System.out.print("Enter amount to convert:");
        double amountDollar = input.nextDouble();

       double resultRmd  = amountDollar * conversionRate ;

      System.out.printf("resultRmd is %c %f is %f yuan",'$', amountDollar,resultRmd);
         }
  
       if (conversion == 1){
       System.out.print("Enter exchange rate from rmb to dollar:");
       double conversionRate = input. nextDouble();
      
       System.out.print("Enter amount to convert:");
        double amountRmd = input.nextDouble();
     
      double resultDollar = amountRmd / conversionRate ;
  
     System.out.printf("result is %f yuan is %c %f",amountRmd, '$' , resultDollar);
        }

          } 

     }

       
