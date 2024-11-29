package commonprefix;
import java.util.*;
public class IncrementLargeInteger {
    public static int[] incrementLargeInteger(int[] input) {
        int inputLength = input.length;
    //starting from the last element and checking if it is less than 9 or not
        //for greater that 9 value we need to make the last element and
        //pass the carry
        //for less than we will just increase the last element by +1
        for (int i = inputLength - 1; i >= 0; i--) {
            if (input[i] < 9) {
                input[i]++;
                return input;
            }
            input[i] = 0;
        }

        int[] newArray = new int[inputLength + 1];
        newArray[0] = 1;

        return newArray;
    }
    public static void main(String[] args){
        int[] arr1={1,2,3};
        int[] arr2={4,3,2,1};
        int[] arr3={1,2,9};
        int [] result1=incrementLargeInteger(arr1);
        int [] result2=incrementLargeInteger(arr2);
        int [] result3=incrementLargeInteger(arr3);
       System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}
