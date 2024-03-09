package arrayOperations;

import java.util.Scanner;

public class OperationsWithNumbers {
    public static void main(String[] Int) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter n numbers:");
        int numbers = sc.nextInt();

        for (int i = 1; i <= numbers; i++) {
            if (i % 3 != 0 || i % 7 != 0) {
                System.out.printf("The number: %d is not divided to 3 and 7.\n", i);
            }
        }
    }
}

