package arrayOperations;

import java.util.Scanner;

public class ArrayEvenAndOddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the size of the array");
        int evenSum = 0;
        int oddSum = 0;
        int i = scan.nextInt();
        int[] arr = new int[i];
        if (i == 0) {
            System.out.println("The array is not exist!");
            return;
        }
        System.out.println("This is the numbers of elements of the array: ");
        System.out.println(".......................");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Please enter an element of the array:");
            arr[j] = scan.nextInt();
            if (arr[j] % 2 == 0) {
                evenSum += arr[j];
            }
            if (arr[j] % 2 != 0) {
                oddSum += arr[j];
            }
        }
        System.out.printf("The sum of the element with the value even is: %d\n", evenSum);
        System.out.printf("The sum of the element with the value odd is: %d\n", oddSum);
    }
}

