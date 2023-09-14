package programmers;

class Try18{
	public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length()-4; ++i) {
        	answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        
        return answer;
    }
}

public class Lv1_18 {
	public static void main(String[] args) {
		Try18 T = new Try18();
		
		System.out.println(T.solution("01033334444"));
	}
}