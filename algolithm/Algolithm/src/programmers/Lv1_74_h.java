package programmers;

import java.util.HashMap;
import java.util.Map;

class Try74 {
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> playersMap = new HashMap<>();
		for(int i = 0; i < players.length; ++i) {
			playersMap.put(players[i], i);
		}
		
		for(int i = 0; i < callings.length; ++i) {
			String tmp = players[playersMap.get(callings[i])-1];
			players[playersMap.get(callings[i])-1] = players[playersMap.get(callings[i])];
			players[playersMap.get(callings[i])] = tmp;
			
			playersMap.put(callings[i], playersMap.get(callings[i])-1);
			playersMap.put(tmp, playersMap.get(tmp)+1);
		}
		
		return players;
    }
}

public class Lv1_74_h {
	public static void main(String[] args) {
		Try74 T = new Try74();
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		for(String x : T.solution(players, callings))
		System.out.println(x);
	}
}
