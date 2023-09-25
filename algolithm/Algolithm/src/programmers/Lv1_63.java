package programmers;

import java.util.Arrays;

class Try63 {
	public String solution(String[] participant, String[] completion) {
        String answer = participant[participant.length-1];
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i < participant.length-1; ++i) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        
        return answer;
    }
}

public class Lv1_63 {
	public static void main(String[] args) {
		Try63 T = new Try63();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(T.solution(participant, completion));
	}
}