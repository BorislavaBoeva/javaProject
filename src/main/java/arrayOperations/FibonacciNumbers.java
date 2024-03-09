package arrayOperations;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the number of fibonacci field: ");
        int N = scan.nextInt();
        if (N == 0) {
            System.out.println("The array is not exist!");
            return;
        }
        int[] Fn = new int[N]; //Declare an array with index N
        Fn[0] = 0;
        Fn[1] = 1;
        Fn[2] = Fn[1];
        //Print the 1st 3 numbers of the Fibonacci field
        System.out.printf("%d\n%d\n%d\n", Fn[0], Fn[1], Fn[2]);
        printNumbersOfFibonacciField(Fn);
    }
    public static void printNumbersOfFibonacciField(int[] Fn) {
        for (int i = 3; i < Fn.length; i++) {
            Fn[i] = Fn[i - 1] + Fn[i - 2];
            //Print the numbers of the Fibonacci field, start from 3rd number to N
            System.out.printf("%d\n", Fn[i]);
        }
    }
}









