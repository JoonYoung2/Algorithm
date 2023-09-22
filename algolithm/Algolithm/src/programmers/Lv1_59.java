package programmers;

class Try59 {
	public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"};
        int index = 0;
        for(int i = 0; i < babbling.length; ++i) {
        	for(int j = 0; j < babbling[i].length(); ++j) {
        		if(babbling[i].charAt(j) == 'a') {
        			if(baby[0].equals(babbling[i].substring(j, j+baby[0].length()))) {
//        				if(baby[0].length())
        			}
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_59 {
	public static void main(String[] args) {
		Try59 T = new Try59();
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		System.out.println(T.solution(babbling));
	}
}