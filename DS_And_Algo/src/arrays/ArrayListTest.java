package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> alist = new ArrayList<>();
		alist.add("a1");
		alist.add("b");
		alist.add("c");
		Collections.sort(alist);
		
		
		List<String> blist = new ArrayList<>();
		blist.add("c");
		blist.add("a1");
		blist.add("b");
		Collections.sort(blist);
		
		
		
		System.out.println(alist.equals(blist));
		
		

	}

}
