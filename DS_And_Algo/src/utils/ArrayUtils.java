package utils;

public class ArrayUtils {
	


    
    public static void printArray(int[] arr, String logMessgae) {
    	
    	System.out.println(logMessgae);
    	printArray(arr);
    }

	public static void printArray(int arr[])
	{
		if(arr.length == 0)
		{
			return;
		}
		
		System.out.println("[");
		for(int i=0;i<arr.length;i++)
		{
			if(i!=arr.length-1)
				System.out.println(arr[i]+",");
			else
				System.out.println(arr[i]+"");
			
		}
		System.out.println("]");
	}

    


}
