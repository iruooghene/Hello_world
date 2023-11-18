import java.util.Scanner;
public class Triangle{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

System.out.print("input base");
double base=input.nextDouble();

System.out.print("input height");
double height=input.nextDouble();

double AreaofTriangle=((base*height)/2);
System.out.printf("the AreaofTriangle is %f", AreaofTriangle);

}


}