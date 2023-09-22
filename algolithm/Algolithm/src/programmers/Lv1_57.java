package programmers;

import java.util.Arrays;

class Try57 {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float peopleNum = stages.length;
        float failNum = 0;
        float[] failed = new float[N];
        float[] failed2 = new float[N];
        int index = 0;
        float a = 0;
        for(int i = 1; i <= N; ++i) {
        	failNum = 0;
        	for(int j = 0; j < stages.length; ++j) {
        		if(stages[j] == i) {
        			++failNum;
        		}
        	}
        	if(peopleNum > 0) {
        		a = (failNum * 100)/peopleNum;        		
        	}else
        		a = 0;
        		
        	peopleNum -= failNum;
        	failed[i-1] = a;
        	failed2[i-1] = a;
        }
        Arrays.sort(failed2);
        for(int i = N-1; i >= 0; --i) {
        	for(int j = 0; j < N; ++j) {
        		if(failed[j] == failed2[i]) {
        			answer[index] = j + 1;
        			index++;
        			failed[j] = Integer.MAX_VALUE;
        			break;
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_57 {
	public static void main(String[] args) {
		Try57 T = new Try57();
		int[] stages = {2,2,2,2,2};
		for(int x : T.solution(4, stages))
		System.out.println(x);
	}
}