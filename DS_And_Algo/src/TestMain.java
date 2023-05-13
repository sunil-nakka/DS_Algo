import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TestMain {

	public static void main(String[] args) {
		
		
		int[] obstacles = {5,1,5,5,1,3,4,5,1,4};
		System.out.println(Arrays.toString(longestObstacleCourseAtEachPosition(obstacles)));
		
	}
	
public static int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        
        PriorityQueue<Integer>  heap = new PriorityQueue();
        int[] result = new int[obstacles.length];
        result[0] = 1;
        
        for(int i=1;i<obstacles.length;i++) {
            
            heap.add(obstacles[i]);
            
            result[i] = findLength(heap, obstacles[i],obstacles[0]);
        }
        return result;
    }

    private static int findLength(PriorityQueue<Integer> heap, int maxHeight, int first) {

        Integer[] array = heap.toArray(new Integer[0]);
        Arrays.sort(array);
        int pos = Arrays.binarySearch(array, maxHeight);
        if(pos<0) {
        	Arrays.sort(array);
        	pos = Arrays.binarySearch(array, maxHeight);
        }
        int i = pos+1;
        for(;i<array.length;i++) {
            if(array[i] != maxHeight) {
                break;
            }
        }
        
        if(array[0]>= first) {
        	return i+1;
        }

        return i;

    }

}
