import java.util.Scanner;
public class Operators{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a value");
int x = input.nextInt();

if(x % 6 == 0 && x % 5 ==0)
System.out.printf("true");
else 
System.out.printf("false");

if (x % 5== 0 || x % 6 ==0)
System.out.printf("true");
else
System.out.printf("false");

if (x % 5==0 ^ x %6 ==0)
System.out.printf("true");
else
System.out.printf("false");
  

       }

}