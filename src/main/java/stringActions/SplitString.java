package stringActions;

public class SplitString {

    public static void main(String[] args) {

        String str = "How many words is in this String?";
        int countWords = str.split("\\s").length;
        System.out.println(countWords);

    }
}
