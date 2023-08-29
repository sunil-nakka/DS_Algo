package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// Find out how minimum number of meeting rooms required for the given meeting schedules
public class MeetingRoom2 {

	public static void main(String[] args) {
		
		
		//int[][] intervals = {{0,30},{5,10},{15,20}};
		
		int[][] intervals = {{1,5},{8,9},{8,9}};
		
		
		int roomsRequired = findMinRooms(intervals);
		
		System.out.println(roomsRequired);

	}

	private static int findMinRooms(int[][] intervals) {
		
		
		Arrays.sort(intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
			
		});
		
		PriorityQueue<Integer> p_queue = new PriorityQueue<Integer>();

		p_queue.add(intervals[0][1]);
		for(int i=1;i<intervals.length;i++)
		{
			int start = intervals[i][0];
			int end = intervals[i][1];
			
			if(start>=p_queue.peek())
			{
				p_queue.poll();
			}
			
			p_queue.add(end);
			
		}
				
		return p_queue.size();
		
	}

}
