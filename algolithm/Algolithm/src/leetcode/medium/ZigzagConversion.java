package leetcode.medium;

class ZigzagConversionSolution {
    public String convert(String s, int numRows) {
        String answer = "";
        String[] convert = new String[numRows];
        int cnt = 0;
        boolean check = false; // true == 감소 false == 증가
        for(char x : s.toCharArray()) {
        	if(convert[cnt] == null) convert[cnt] = "";
        	convert[cnt] += x;
        	
        	cnt = (check) ? cnt-1 : cnt+1;
        	
        	if(cnt == 0) {
        		check = false;
        	}else if(cnt == numRows-1) {
        		check = true;
        	}
        }
        
        for(String str : convert)
        	answer += str;
        return answer;
    }
}

public class ZigzagConversion {
	public static void main(String[] args) {
		
		ZigzagConversionSolution solution = new ZigzagConversionSolution();
		
		// result "PAHNAPLSIIGYIR"
		String s = "PAYPALISHIRING";
		int numRows = 3;
		
		// result = "PINALSIGYAHRPI"
		String s1 = "PAYPALISHIRING";
		int numRows1 = 4;
		
		// result = "A"
		String s2 = "A";
		int numRows2 = 1;
		
		System.out.println(solution.convert(s, numRows));
		System.out.println(solution.convert(s1, numRows1));
		System.out.println(solution.convert(s2, numRows2));
	}
}
