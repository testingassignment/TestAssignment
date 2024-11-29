package commonprefix;

public class LongestSubstring {


    public static String longestSubstring(String str) {
        int maxlength = 1;
        int currntLength = 1;
        if (str == null || str.length() == 0) {
            System.out.println("enter a valid string");
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) - str.charAt(i - 1) == str.charAt(1) - str.charAt(0)) {
                currntLength++;
            } else {
                maxlength = Math.max(maxlength, currntLength);
                currntLength = 1;
            }
        }
             //maxLength = Math.max(maxLength, currentLength);
             return "maxLength";
    }

    public static void main(String[] args){

        String input= "abccbaa";
        String output= longestSubstring(input);
        System.out.println(output.length());
    }

}
