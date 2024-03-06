package operatorsJava;

import java.util.Scanner;

public class ComperingNumbers {
    public static void main(String[] args) {

        System.out.println("Please enter three numbers: ");

        Scanner  scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

       if ( a > b && b > c){
           System.out.println("a is greater");
       }

       if  ( b > a && a > c){
           System.out.println("b is greater");}

       if  (c > a && a > b){
           System.out.println("c is greater");}

       }

    }


