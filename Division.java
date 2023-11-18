import java.util.Scanner;
public class Division{
public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter an input");
 int x = input.nextInt();

if ( x % 3 == 0 ){
System.out.printf(" %d is divisible by 3", x);
}
 else{
System.out.printf(" %d is not divisible by 3", x);
}

    }



}