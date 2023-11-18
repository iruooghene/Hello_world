import java.util.Scanner;
public class Game{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter player one name:");
String name1 = input.next();

System.out.print("Enter player two name:");
String name2 = input.next();

System.out.printf("%s enter an input:", name1);
int Victoria =input.nextInt();

System.out.printf("%s enter an input:", name2);
int Jumoke =input.nextInt();

if ( Victoria == 0 && Jumoke ==1){
System.out.printf("Jumoke won Victoria");
}
if (Victoria == 2 && Jumoke == 1){
System.out.printf("Victoria won Jumoke");
}

if (Jumoke == 2 && Victoria == 0){
System.out.printf("Jumoke won Victoria");
}

if(Victoria == 1 && Jumoke == 0){
System.out.printf("Victoria won Jumoke");
}

   }


}

  

