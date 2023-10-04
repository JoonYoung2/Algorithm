package programmers.level1;

class Try60 {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6, 6};
        int maxCount = 0;
        int minCount = 0;
        for(int i = 0; i < 6; ++i) {
        	for(int j = 0; j < 6; ++j) {
        		if(lottos[i] == 0) {
        			maxCount++;
        			if(maxCount > 1) {
        				--answer[0];
        			}
        			break;
        		}else if(lottos[i] == win_nums[j]) {
        			maxCount++;
        			minCount++;
        			if(maxCount > 1) {
        				--answer[0];
        			}
        			if(minCount > 1) {
        				--answer[1];
        			}
        			break;
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_60 {
	public static void main(String[] args) {
		Try60 T = new Try60();
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		for(int x : T.solution(lottos, win_nums))
		System.out.println(x);
	}
}