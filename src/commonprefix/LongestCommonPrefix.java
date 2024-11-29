package commonprefix;

public class LongestCommonPrefix {

    /*
     * 1. Examples- Input data
     * Input: strs = ["flower", "flow", "flight"]
     * Output: "fl"
     * 2. Input: strs = ["dog", "racecar", "car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     *
     * 3. Input: strs = ["man", "man", "man"]
     * Output: "man"
     *
     * 4. Input: strs = ["m", "", "match"]
     * Output: ""
     */

    //method to calculate the longestCommonPrefix by taking the string array parameter
    // Starting from first string as the initial prefix
    //and then reducing its length
    public static String longestCommonPrefix(String[] input) {
        if (input == null || input.length == 0) {
            return "";
        }

        String prefix = input[0];

        for (int i = 1; i < input.length; i++) {
            while (input[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;  // Return the longest common prefix
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs1);
        System.out.println("Longest common prefix is: " + result);

        String[] strs2 = {"dog", "racecar", "car"};
        String result1 = longestCommonPrefix(strs2);
        System.out.println("Longest common prefix is: " + result1);

        String[] strs3 = {"man", "man", "man"};
        String result2 = longestCommonPrefix(strs3);
        System.out.println("Longest common prefix is: " + result2);

        String[] strs4 = {"m", "mag", "match"};
        String result3= longestCommonPrefix(strs4);
        System.out.println("Longest common prefix is: " + result3);
    }
}
