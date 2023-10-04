package programmers.level1;

class Try49{
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        
        int cnt1 = 0, cnt2 = 0;
        boolean check1 = false, check2 = false;
        for(int i = 0; i < goal.length; ++i) {
        	if(goal[i].equals(cards1[cnt1])) {
        		if(cards1.length-1 != cnt1)
        			cnt1++;
        		check1 = true;
        	}else if(goal[i].equals(cards2[cnt2])) {
        		if(cards2.length-1 != cnt2)
        			cnt2++;
        		check2 = true;
        	}
        	
        	if(check1 == true || check2 == true) {
        		check1 = false;
        		check2 = false;
        	}else {
        		return answer;
        	}
        }
        answer = "Yes";
        return answer;
    }
}

public class Lv1_49 {
	public static void main(String[] args) {
		Try49 T = new Try49();
//		String[] cards1 = {"i", "water", "drink"};
//		String[] cards2 = {"want", "to"};
//		String[] goal = {"i", "want", "to", "drink", "water"};
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		System.out.println(T.solution(cards1, cards2, goal));
	}
}
