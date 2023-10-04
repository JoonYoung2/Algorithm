package programmers.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 달리기 경주
 */

class Try01{
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

public class Lv1_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Try01 T = new Try01();
		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		for(String x : T.solution(players, callings))System.out.println(x);
	}
}


//class Try01{
//	public String[] solution(String[] players, String[] callings) {
//		for(int i = 0; i < callings.length; ++i) {
//			for(int j = 0; j < players.length; ++j) {
//				if(callings[i] == players[j]) {
//					String tmp = players[j];
//					players[j] = players[j-1];
//					players[j-1] = tmp;
//					break;
//				}
//			}
//		}
//		return players;
//	}
//}
//
//public class Lv1_01 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		Try01 T = new Try01();
//		
//		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
//		String[] callings = {"kai", "kai", "mine", "mine"};
//		
//		for(String x : T.solution(players, callings))System.out.println(x);
//	}
//}
