package programmers.level1;

class Try35{
	public int solution(String t, String p) {
        int answer = 0;
        int i = 0;
        String tmp = "";
        while(true) {
        	tmp += t.charAt(i);
        	if(tmp.length() == p.length()) {
        		if(Long.parseLong(tmp) <= Long.parseLong(p))
        			++answer;
        		tmp = tmp.substring(1, tmp.length());
        	}
        	if(i == t.length()-1)
        		break;
        	++i;
        	
        }
        return answer;
    }
}

public class Lv1_35 {
	public static void main(String[] args) {
		Try35 T = new Try35();
		int[] a = {2,2,3,3};
		
//		for(int x : )
		System.out.println(T.solution("10203", "15"));
	}
}