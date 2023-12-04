import java.util.Scanner;

	public class Power{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

int power = 1;
int count = 1;


System.out.print("Enter an integer: ");
 int integer1 = scanner.nextInt();

System.out.print("Enter an integer: ");
 int integer2 = scanner.nextInt();

if (integer2 > 0){

	while (count <= integer2){
power = power * integer1 ;
    count+=1;
}

}

System.out.printf(" %d raised to the power of %d is: %d", integer1 , integer2, power);

}

}
  