package StringActions;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {

       String str = "My name is <Test>";
       System.out.println(str);

       Scanner scan = new Scanner(System.in);

       String name = scan.nextLine();

       String replaceString=str.replace("<Test>", name);

       System.out.println(replaceString);
    }
}
