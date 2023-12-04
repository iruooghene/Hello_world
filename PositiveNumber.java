import java.util.Scanner;

	public class PositiveNumber{
	
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

int positive = 1;

int negative = 1;

int zeroes = 1;

int count = 1;

System.out.print("Enter a number: ");
   int number = scanner.nextInt();

while( number > -100){

System.out.print("Enter a number: ");
    number = scanner.nextInt();

 
if (number > 0){
 
 positive+=1;
}

if (number < 0){
   negative+=1;
}

if (number == 0){
    zeroes+=1;
}

}

System.out.printf(" Positive number: %d%n ", positive );
System.out.printf(" Negative number: %d%n", negative );
System.out.printf("Zeroes number: %d%n",zeroes);

}

}

