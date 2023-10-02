package programmers;

import java.util.HashMap;

class Try71 {
	public String solution(String[] survey, int[] choices) {
		String answer = "";
		String servey1 = "RCJA";
		String servey2 = "TFMN";
		int cnt = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < 4; ++i) {
			map.put(servey1.charAt(i), 0);
			map.put(servey2.charAt(i), 0);
		}
		for (String x : survey) {
			String[] c = x.split("");
			int choose = choices[cnt];
			
			if (choose == 1) {
				map.put(c[0].charAt(0), map.get(c[0].charAt(0)) + 3);
			} else if (choose == 2) {
				map.put(c[0].charAt(0), map.get(c[0].charAt(0)) + 2);
			} else if (choose == 3) {
				map.put(c[0].charAt(0), map.get(c[0].charAt(0)) + 1);
			} else if (choose == 5) {
				map.put(c[1].charAt(0), map.get(c[1].charAt(0)) + 1);
			} else if (choose == 6) {
				map.put(c[1].charAt(0), map.get(c[1].charAt(0)) + 2);
			} else if (choose == 7) {
				map.put(c[1].charAt(0), map.get(c[1].charAt(0)) + 3);
			}
			cnt++;

		}
		
		for(int i = 0; i < 4; ++i) {
			int tmp1 = map.get(servey1.charAt(i));
			int tmp2 = map.get(servey2.charAt(i));
			if(tmp1 > tmp2 || tmp1 == tmp2) {
				answer += servey1.charAt(i) + "";
			}else if(tmp1 < tmp2) {
				answer += servey2.charAt(i) + "";
			}
		}
		
		return answer;
	}
}

public class Lv1_71 {
	public static void main(String[] args) {
		Try71 T = new Try71();
		String[] survey = { "TR", "RT", "TR" };
		int[] choices = { 7, 1, 3 };
		System.out.println(T.solution(survey, choices));
	}
}