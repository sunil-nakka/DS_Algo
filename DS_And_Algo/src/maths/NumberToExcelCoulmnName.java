package maths;

public class NumberToExcelCoulmnName {
	
	public static void main(String[] args) {
		
		
StringBuilder ans = new StringBuilder();
		

int n = 943566;
while (n > 0)
{
    // find the index of the next letter and concatenate the letter
    // to the solution

    // here index 0 corresponds to 'A', and 25 corresponds to 'Z'
    int index = (n - 1) % 26;
    ans.append((char)(index + 'A'));
    n = (n - 1) / 26;
}	
		
		System.out.println(ans.toString());
		
		
		
	
		
	}

}
