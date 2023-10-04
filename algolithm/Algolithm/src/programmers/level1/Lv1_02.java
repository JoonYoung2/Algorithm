package programmers.level1;

import java.util.HashMap;
import java.util.Map;

class Try02{
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < name.length; ++i) {
			map.put(name[i], yearning[i]);
		}
		
		for(int i = 0; i < photo.length; ++i) {
			for(int j = 0; j < photo[i].length; ++j) {
				if(map.containsKey(photo[i][j]))
					answer[i] += map.get(photo[i][j]);
			}
		}
		return answer;
    }
}

public class Lv1_02 {
	public static void main(String[] args) {
		Try02 T = new Try02();
		String[] name = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
		for(int x : T.solution(name, yearning, photo)) System.out.println(x);
	}
}
