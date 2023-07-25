package utils;

public class ArrayUtils {
	


    public static void printArray(int[] arr) {
        if(arr == null || arr.length == 0) {
            System.out.println("Array is Empty");
            return;
        }
        for(int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    
    public static void printArray(int[] arr, String logMessgae) {
    	
    	System.out.println(logMessgae);
    	printArray(arr);
    }

}
