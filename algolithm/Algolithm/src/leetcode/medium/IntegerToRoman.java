package leetcode.medium;
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
class IntegerToRomanSolution{
	public String intToRoman(int num) {
		String answer = "";
		while(num > 0) {
			
		}
		return answer;
    }
}

public class IntegerToRoman {
	public static void main(String[] args) {
		IntegerToRomanSolution solution = new IntegerToRomanSolution();
		
		int num = 3;
		int num2 = 58;
		int num3 = 1994;
		
		System.out.println(solution.intToRoman(num));
		System.out.println(solution.intToRoman(num2));
		System.out.println(solution.intToRoman(num3));
	}
}
