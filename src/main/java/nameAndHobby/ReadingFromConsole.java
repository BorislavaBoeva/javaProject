package nameAndHobby;

import java.util.Scanner;

public class ReadingFromConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = sc.nextLine();

        System.out.println("Please enter your Hobby:");
        String hobby = sc.nextLine();

        System.out.println("Nice to meet you," + name + "!" + " Interesting Hobby, " + hobby + "!");

    }
}
