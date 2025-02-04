package pack;  

import java.util.Arrays;  

public class day2task1 {  
    public static void main(String[] args) {  
        
        int[] OArray = {10, 20, 30, 40, 50, 60, 70, 80};  


        int newSize = (OArray.length + 1) / 2;
        int[] AArray = new int[newSize];  

        for (int i = 0, j = 0; i < OArray.length; i += 2, j++) {  
            AArray[j] = OArray[i];  
        }  

     
        System.out.println("Original Array: " + Arrays.toString(OArray));  
        System.out.println("Array with Alternative Elements: " + Arrays.toString(AArray));  
    }  
}