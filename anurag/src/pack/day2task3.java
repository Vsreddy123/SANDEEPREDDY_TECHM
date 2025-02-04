package pack;

import java.util.Arrays;

public class day2task3 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("arr1 and arr2 equals " + Arrays.equals(arr1, arr2)); 
        int[][] nestedArr1 = {{1, 2}, {3, 4}};
        int[][] nestedArr2 = {{1, 2}, {3, 4}};

        System.out.println("arr1 and arr2 equals " + Arrays.equals(nestedArr1, nestedArr2)); 
        System.out.println("arr1 and arr2 deepequals " + Arrays.deepEquals(nestedArr1, nestedArr2)); 

    }

}
