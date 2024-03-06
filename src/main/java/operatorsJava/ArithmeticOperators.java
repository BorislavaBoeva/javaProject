package operatorsJava;
import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter length of rectangle: ");
        double l = scan.nextDouble();

        if (l <= 0) {
            System.out.println("Error: Invalid entry. Number must be positive!");
            return;
        }

        System.out.println("Please enter width of rectangle: ");
        double h = scan.nextDouble();

        if (h <= 0) {
            System.out.println("Error: Invalid entry. Numbers must be positive!");
            return;
        }

        double p = 2 * l + 2 * h;
        System.out.println("The perimetar of reactangle is: " + p);

        double s = l * h;
        System.out.println("The Area of reactangle is: " + s);

    }
}


