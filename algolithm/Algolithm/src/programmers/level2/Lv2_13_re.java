package programmers.level2;

class Try13{
	private static int location = 0;
	private static int min = Integer.MAX_VALUE;
	public int solution(int n) {
		location = n;
        int ans = 1;
        
        int check = 0;
        while(check == 0) {
        	
        }

        return ans;
    }
	
	private void DFS(int nowLocation, int ans) {
		boolean check = false;
		
		nowLocation += ans;
		
		
	}
}

public class Lv2_13_re {
	public static void main(String[] args) {
		Try13 T = new Try13();
		
		int n = 5000;
		
		System.out.println(T.solution(n));
	}
}