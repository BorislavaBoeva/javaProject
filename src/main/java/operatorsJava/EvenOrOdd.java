package operatorsJava;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {

       Scanner scan = new  Scanner(System.in);
       System.out.println("Please enter an integer number: ");

       int i = scan.nextInt();

       int m = i % 2;
       if(m == 0){
          System.out.println("The integer number is EVEN!" );
       }
       else{
          System.out.println("The integer number is ODD!");
       }
    }
}
