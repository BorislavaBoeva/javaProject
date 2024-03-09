package arrayOperations;

import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] Int) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter n numbers:");
        int numbers = sc.nextInt();
        for (int i = 1; i <= numbers; i++) {
            System.out.printf("%d\n", i);
        }
    }
}

