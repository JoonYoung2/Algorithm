package programmers;

import java.util.HashMap;
import java.util.Map;

class Try61 {
	public static Map<Character, String> xMap = new HashMap<>();
	public static Map<Character, String> yMap = new HashMap<>();
	
	public String solution(String X, String Y) {
		String answer = "";
		int cnt = 0;
		XDfs(X);
		YDfs(Y);
		
		for (int i = 9; i >= 0; --i) {
			if (yMap.containsKey((char) (i + 48))) {
				if (i == 0 && cnt == 0) {
					return "0";
				}
				cnt++;
				if (xMap.get((char) (i + 48)).length() >= yMap.get((char) (i + 48)).length()) {
					answer += yMap.get((char) (i + 48));
				} else {
					answer += xMap.get((char) (i + 48));
				}

			}
		}
		if (cnt == 0) {
			answer = -1 + "";
		}

		return answer;
	}

	public void XDfs(String X) {
		if (X.length() == 1) {
			xMap.put(X.charAt(0), xMap.getOrDefault(X.charAt(0), "") + X);
			return;
		} else {
			if (X.length() > 2) {
				String x = X.substring(0, X.length() / 3);
				String y = X.substring(X.length() / 3, X.length() / 3 * 2);
				String z = X.substring(X.length() / 3 * 2, X.length());
				XDfs(x);
				XDfs(y);
				XDfs(z);
				return;
			}
			String x = X.substring(0, X.length() / 2);
			String y = X.substring(X.length() / 2, X.length());
			if (x.length() > 0 && y.length() > 0) {
				XDfs(x);
				XDfs(y);
			} else if (x.length() > 0) {
				XDfs(x);
			} else if (y.length() > 0) {
				XDfs(y);
			}
		}
	}

	public void YDfs(String Y) {
		if (Y.length() == 1) {
			if (xMap.containsKey(Y.charAt(0))) {
				yMap.put(Y.charAt(0), yMap.getOrDefault(Y.charAt(0), "") + Y);
			}
			return;
		} else {
			if (Y.length() > 2) {
				String x = Y.substring(0, Y.length() / 3);
				String y = Y.substring(Y.length() / 3, Y.length() / 3 * 2);
				String z = Y.substring(Y.length() / 3 * 2, Y.length());
				YDfs(x);
				YDfs(y);
				YDfs(z);
				return;
			}
			String x = Y.substring(0, Y.length() / 2);
			String y = Y.substring(Y.length() / 2, Y.length());
			if (x.length() > 0 && y.length() > 0) {
				YDfs(x);
				YDfs(y);
			} else if (x.length() > 0) {
				YDfs(x);
			} else if (y.length() > 0) {
				YDfs(y);
			}
		}
	}
}

public class Lv1_61 {
	public static void main(String[] args) {
		Try61 T = new Try61();

		System.out.println(T.solution("1436125", "1235342627321"));
	}
}