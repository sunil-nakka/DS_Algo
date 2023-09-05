package maths;

public class NumberToExcelCoulmnName {

	public static void main(String[] args) {

		StringBuilder ans = new StringBuilder();

		int n = 943566;
		while (n > 0) {
		
			int index = (n - 1) % 26;
			ans.append((char) (index + 'A'));
			n = (n - 1) / 26;
		}

		System.out.println(ans.toString());

	}

}
