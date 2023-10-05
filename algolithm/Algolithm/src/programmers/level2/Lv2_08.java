package programmers.level2;

import java.util.HashMap;

class Try08{
	static private HashMap<Integer, Long> map = new HashMap<>();
	public int solution(int n) {
		map.put(0, 0L);
		map.put(1, 1L);
		fibo(n);
        int answer = (int)(map.get(n) + 0);
        return answer;
    }
	
	private void fibo(int n) {
		int cnt = 2;
		while(cnt <= n) {
			map.put(cnt, (map.get(cnt-1) + map.get(cnt-2))%1234567);
			cnt++;
		}
	}
}

public class Lv2_08 {
	public static void main(String[] args) {
		Try08 T = new Try08();
		int n = 100000;

		System.out.println(T.solution(n));
	}
}