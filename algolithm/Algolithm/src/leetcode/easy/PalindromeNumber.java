package leetcode.easy;

class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
    	String str = "" + x;
    	
    	int end = str.length()-1;
    	
    	for(int i = 0; i < str.length()/2; ++i) {
    		if(str.charAt(i) != str.charAt(end))
    			return false;
    	}
    	
        return true;
    }
}

public class PalindromeNumber {
	public static void main(String[] args) {
		PalindromeNumberSolution solution = new PalindromeNumberSolution();
		
		int[] x = new int[] {121, -121, 10};
		
		for(int y : x) System.out.println(solution.isPalindrome(y));
	}
}
