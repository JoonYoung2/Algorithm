package programmers;

class Try40{
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; ++i) {
        	int a1 = arr1[i];
        	int a2 = arr2[i];
        	String s1 = "";
        	String s2 = "";
        	while(a1 > 0 || a2 > 0) {
        		if(a1 > 0) {
        			s1 = a1%2 + s1;
        			a1 /= 2;
        		}
        		if(a2 > 0) {
        			s2 = a2%2 + s2;
        			a2 /= 2;
        		}
        	}
        	if(s1.length() != n || s2.length() != n) {
        		int a = n - s1.length();
        		int b = n - s2.length();
        		for(int m = 0; m < a; ++m) {
        			s1 = 0 + s1;
        		}
        		
        		for(int l = 0; l < b; ++l) {
        			s2 = 0 + s2;
        		}
        	}
        	answer[i] = "";
        	for(int j = 0; j < n; ++j) {
        		if(Integer.parseInt(s1.charAt(j) + "") == 1 || Integer.parseInt(s2.charAt(j) + "") == 1) {
        			answer[i] += "#";
        		}else {
        			answer[i] += " ";
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_40 {
	public static void main(String[] args) {
		Try40 T = new Try40();
		int[] a = {46, 33, 33 ,22, 31, 50};
		int[] b = {27 ,56, 19, 14, 14, 10};
		
//		for(int x : )
		for(String x : T.solution(6, a, b))
		System.out.println(x);
	}
}
