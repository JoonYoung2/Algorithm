package leetcode.easy;

import java.util.Stack;

public class IsValid {
	public static void main(String[] args) {
		IsValidSolution solution = new IsValidSolution();
		String str = "()";
		String str2 = "()[]{}";
		String str3 = "(]";
		String str4 = "([])";
		
		System.out.println(solution.isValid(str));
		System.out.println(solution.isValid(str2));
		System.out.println(solution.isValid(str3));
		System.out.println(solution.isValid(str4));
	}
	
	private static class IsValidSolution {
		public boolean isValid(String s) {
			if(s.toCharArray().length % 2 != 0)
				return false;

			Stack<Character> stack = new Stack<>();
	        
	        
	        for(char x : s.toCharArray()) {
	        	if(x != ')' && x != '}' && x != ']') {
	        		stack.add(x);
	        	}else {
	        		if(stack.size() == 0)
	        			return false;
	        		if(stack.peek() == '(' && x == ')')
	        			stack.pop();
	        		else if(stack.peek() == '{' && x == '}')
	        			stack.pop();
	        		else if(stack.peek() == '[' && x == ']')
	        			stack.pop();
	        		else
	        			return false;
	        	}
	        }
	        
	        if(stack.size() != 0)
	        	return false;
			return true;
	    }
	}
}
