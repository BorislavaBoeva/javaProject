package operatorsJava;

import java.util.Scanner;
public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter integer number from 1 to 7, including 7: ");

        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.printf("You have selected %d. Day of the week is: Monday", day);
                break;
            case 2:
                System.out.printf("You have selected %d. Day of the week is: Tuesday", day);
                break;
            case 3:
                System.out.printf("You have selected %d. Day of the week is: Wednesday", day);
                break;
            case 4:
                System.out.printf("You have selected %d. Day of the week is: Thursday", day);
                break;
            case 5:
                System.out.printf("You have selected %d. Day of the week is: Friday", day);
                break;
            case 6:
                System.out.printf("You have selected %d. Day of the week is: Saturday", day);
                break;
            case 7:
                System.out.printf("You have selected %d. Day of the week is: Sunday", day);
                break;
        }


    }

    }

