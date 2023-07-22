package recurssion;

import java.util.ArrayList;

public class Combinations {
	
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
	public static void main(String[] args) {
		
		
		ArrayList<Integer> result = new ArrayList<>();
		int a = 1;
		int b = 2;
		
		if(a<b) {
			System.out.println(ans);
			System.exit(0);
        }
		combinations(a,b,1,result);
		
		System.out.println(ans);
		
	}

	private static void combinations(int a, int b, int index, ArrayList<Integer> result) {

		if(result.size() == b) {
			ans.add(new ArrayList(result));
		}
		
		for(int i=index;i<=a;i++) {
			result.add(i);
			combinations(a, b, i+1, result);;
			result.remove(result.size()-1);
		}
		
	}
	
	

}
