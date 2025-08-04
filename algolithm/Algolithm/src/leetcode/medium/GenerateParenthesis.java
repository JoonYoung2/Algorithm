package leetcode.medium;

import java.util.List;

public class GenerateParenthesis {
	public static void main(String[] args) {
		GenerateParenthesisSolution solution = new GenerateParenthesisSolution();
		
		for(String x : solution.generateParenthesis(3)) {
			System.out.println(x);
		}
		
		System.out.println("==========================================");
		
		for(String x : solution.generateParenthesis(1)) {
			System.out.println(x);
		}
	}
	
	private static class GenerateParenthesisSolution {
		public List<String> generateParenthesis(int n) {
	        return null;
	    }
	}
}
