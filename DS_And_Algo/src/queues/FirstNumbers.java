package queues;

import java.util.ArrayList;

public class FirstNumbers {

	public static void main(String[] args) {
		

		int A = 5;
        

        ArrayList<String> numberList = new ArrayList<>();
        numberList.add("1");
        numberList.add("2");
        ArrayList<String> list = new ArrayList<>(numberList);
        ArrayList<String> resultList = new ArrayList<>();
        int index = 0;

        while(resultList.size() <= A)
        {
            String currentNumber = list.get(index++);
            for(String num : numberList )
            {
                String temp  = currentNumber+num;
                if(temp.length()%2==0)
                {
                    resultList.add(temp);
                }
                list.add(temp);
                
            }
        }

        System.out.println(resultList);
        
	}

}
