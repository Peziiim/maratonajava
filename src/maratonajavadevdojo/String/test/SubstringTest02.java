package maratonajavadevdojo.String.test;

import java.util.SplittableRandom;

public class SubstringTest02 {
    public static void main(String[] args) {
        String s = "bnee";
        String myFinalAnswerGuys = "";
        String[] palindrome = new String[s.length()];
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String temp = s.substring(i, j);
                String reverse = new StringBuilder(temp).reverse().toString();

                if (temp.equals(reverse)) {
                    palindrome[i] = reverse;
                }

            }
        }

        for(String dick: palindrome){
            if (dick.length() > length){
                length = dick.length();
                myFinalAnswerGuys = dick;

            }
        }

    }
}
