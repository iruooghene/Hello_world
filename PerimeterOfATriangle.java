import java.util.Scanner;
       public class PerimeterOfATriangle{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

System.out.print("Enter the first edge of the triangle: ");
      int a = input.nextInt();
System.out.print("Enter the second edge of the triangle: ");
      int b = input.nextInt();
System.out.print("Enter the third edge of the triangle: ");
      int c = input.nextInt();

      int perimeter =( a + b + c ); 

if ( a + b > c || b + c > a || a + c >b ){    
    System.out.printf("perimeter is: %d ", perimeter );
   }

else{
     System.out.printf("Input is not valid");

}

    }

}