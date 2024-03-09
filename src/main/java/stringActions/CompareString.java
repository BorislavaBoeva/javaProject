package stringActions;

import java.util.Scanner;

public class CompareString {
      public static void Myname() {
        String name = "What is your name?";
        System.out.println(name);}

      public static void MySurname () {
            String surname = "What is your Surname?";
            System.out.println(surname);
        }

    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            Myname();


            String FirstName = sc.nextLine();


            System.out.printf("Hello, %S!\n", FirstName);

            MySurname();

            String SurName = sc.nextLine();
            System.out.printf("Nice to meet you, %S!\n", SurName);

            System.out.println(FirstName.equals(SurName));

            Boolean b1 = FirstName.equals(SurName);
            System.out.println("The result of comparison of the 2 Strings is " + b1 + ".");

        }


    }

