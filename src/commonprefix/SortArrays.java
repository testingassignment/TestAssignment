package commonprefix;

import java.util.Arrays;

public class SortArrays {

    public static void sortArrays(int[] input){
        int n= input.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }

        }

    public static void main(String[] args){
    int[] arr={2,10,0,1,0,0,1};
       sortArrays(arr);
        System.out.println(Arrays.toString(arr));
       for(int i : arr){
           System.out.println(i);
       }

    }
}
