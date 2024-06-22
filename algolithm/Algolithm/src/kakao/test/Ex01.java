package kakao.test;

import java.util.HashMap;
import java.util.Map;

class Try01{
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;
		Map<String, Integer> giftNum = new HashMap<>();
		Map<String, Integer> receiveNum = new HashMap<>();
		Map<String, Integer> presentIndex = new HashMap<>();
		
		for(String x : friends) {
			giftNum.put(x, 0);
			receiveNum.put(x, 0);
		}
		
		for(String x : gifts) {
			String gift = x.split(" ")[0];
			String received = x.split(" ")[1];
			
			presentIndex.put(gift, presentIndex.getOrDefault(gift, 0)+1);
			presentIndex.put(received, presentIndex.getOrDefault(received, 0)-1);
		}
		
		for(String x : friends) {
			System.out.println(x + " = " + presentIndex.get(x));
		}
		
		return answer;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Try01 t = new Try01();
		String[] friends = {"muzi", "ryan", "frodo", "neo"};
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", 
				"ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		
		System.out.println(t.solution(friends, gifts));
	}
}
