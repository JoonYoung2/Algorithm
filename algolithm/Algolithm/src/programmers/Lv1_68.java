package programmers;

class Try68 {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        int imsiRight = 0;
        int imsiLeft = 0;
        for(int x : numbers) {
        	if(x == 0) {
        		x = 11;
        	}
        	int leftCnt = 0;
            int rightCnt = 0;
            
        	if(x == 1 || x == 4 || x == 7) {
        		answer += "L";
        		left = x;
        	}else if(x == 3 || x == 6 || x == 9) {
        		answer += "R";
        		right = x;
        	}else {
        		imsiRight = right;
        		imsiLeft = left;
        		while(true) {
        			if(imsiRight == 2 || imsiRight == 5 || imsiRight == 8 || imsiRight == 11) {
        				if(imsiRight == x) {
        					break;
        				}else if(imsiRight > x) {
        					rightCnt++;
        					imsiRight -= 3;
        				}else {
        					rightCnt++;
        					imsiRight += 3;
        				}
        			}else {
        				imsiRight--;
        				rightCnt++;
        			}
        		}
        		
        		while(true) {
        			if(imsiLeft == 2 || imsiLeft == 5 || imsiLeft == 8 || imsiLeft == 11) {
        				if(imsiLeft == x) {
        					break;
        				}else if(imsiLeft > x) {
        					leftCnt++;
        					imsiLeft -= 3;
        				}else {
        					leftCnt++;
        					imsiLeft+=3;
        				}
        			}else {
        				imsiLeft++;
        				leftCnt++;
        			}
        		}
        		if(leftCnt == rightCnt) {
        			if(hand.equals("right")) {
        				right = imsiRight;
        				answer += "R";
        			}else {
        				left = imsiLeft;
        				answer += "L";
        			}
        		}else {
        			if(leftCnt > rightCnt) {
        				right = imsiRight;
        				answer += "R";
        			}else {
        				left = imsiLeft;
        				answer += "L";
        			}
        		}
        	}
        }
        return answer;
    }
}

public class Lv1_68 {
	public static void main(String[] args) {
		Try68 T = new Try68();
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		System.out.println(T.solution(numbers, "left"));
	}
}