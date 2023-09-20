package programmers;

class Try52{
	public int[] solution(int[] answers) {
        int[] maxP = new int[3];
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for(int i = 0; i < answers.length; ++i) {
        	if(answers[i] == p1[cnt1]) {
        		maxP[0] += 1;
        	}
        	if(answers[i] == p2[cnt2]) {
        		maxP[1] += 1;
        	}
        	if(answers[i] == p3[cnt3]) {
        		maxP[2] += 1;
        	}
        	++cnt1;
        	++cnt2;
        	++cnt3;
        	if(cnt1 == p1.length)
        		cnt1 = 0;
        	if(cnt2 == p2.length)
        		cnt2 = 0;
        	if(cnt3 == p3.length)
        		cnt3 = 0;
        }
        int max = Integer.MIN_VALUE;
        String c = "";
        for(int i = 0; i < 3; ++i) {
        	if(max < maxP[i]) {
        		max = maxP[i];
        		c = (i+1) + ",";
        	}else if(max == maxP[i]) {
        		c += (i+1) + ",";
        	}
        }
        c = c.substring(0, c.length()-1);
        String[] d = c.split(",");
        int[] answer = new int[d.length];
        for(int i = 0; i < d.length; ++i) {
        	answer[i] = Integer.parseInt(d[i]);
        }
        return answer;
    }
}

public class Lv1_52 {
	public static void main(String[] args) {
		Try52 T = new Try52();
		int[] nums = {1,2,3,4,5};
		for(int x : T.solution(nums))
		System.out.println(x);	
	}
}
