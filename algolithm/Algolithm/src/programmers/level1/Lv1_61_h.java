package programmers.level1;

/*
	StringBuilder를 사용해서 풀어야 런타임오버가 안나는 문제.
*/

class Try61 {
	public String solution(String X, String Y) {
		String answer = "";
		int[] A = new int[10];
		int[] B = new int[10];
		for(String x : X.split("")) {
			++A[Integer.parseInt(x)];
		}
		for(String x : Y.split("")) {
			++B[Integer.parseInt(x)];
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 9; i >= 0; --i) {
			if(A[i] > B[i]) {
				for(int j = 0; j < B[i]; ++j) {
					sb.append(i);
				}
			}else {
				for(int j = 0; j < A[i]; ++j) {
					sb.append(i);
				}
			}
		}
		answer = sb.toString();
		if(answer.equals(""))
			answer = "-1";
		if(answer.charAt(0) == '0') {
			return "0";
		}
		return answer;
	}
}

public class Lv1_61_h {
	public static void main(String[] args) {
		Try61 T = new Try61();
		System.out.println(T.solution("1436125", "1235342627321"));
	}
}








//public static Map<Character, String> xMap = new HashMap<>();
//public static Map<Character, String> yMap = new HashMap<>();
//
//public String solution(String X, String Y) {
//	String answer = "";
//	int cnt = 0;
//	XDfs(X);
//	YDfs(Y);
//	StringBuilder sb = new StringBuilder();
//	for (int i = 9; i >= 0; --i) {
//		if (yMap.containsKey((char) (i + 48))) {
//			if (i == 0 && cnt == 0) {
//				return "0";
//			}
//			cnt++;
//			if (xMap.get((char) (i + 48)).length() >= yMap.get((char) (i + 48)).length()) {
//				sb.append(yMap.get((char) (i + 48)));
//			} else {
//				sb.append(xMap.get((char) (i + 48)));
//			}
//
//		}
//	}
//	
//	if (cnt == 0) {
//		answer = -1 + "";
//	}else
//		answer = sb.toString();
//
//	return answer;
//}
//
//public void XDfs(String X) {
//	if (X.length() == 1) {
//		xMap.put(X.charAt(0), xMap.getOrDefault(X.charAt(0), "") + X);
//		return;
//	} else {
//		if (X.length() > 2) {
//			String x = X.substring(0, X.length() / 3);
//			String y = X.substring(X.length() / 3, X.length() / 3 * 2);
//			String z = X.substring(X.length() / 3 * 2, X.length());
//			XDfs(x);
//			XDfs(y);
//			XDfs(z);
//			return;
//		}
//		String x = X.substring(0, X.length() / 2);
//		String y = X.substring(X.length() / 2, X.length());
//		if (x.length() > 0 && y.length() > 0) {
//			XDfs(x);
//			XDfs(y);
//		} else if (x.length() > 0) {
//			XDfs(x);
//		} else if (y.length() > 0) {
//			XDfs(y);
//		}
//	}
//}
//
//public void YDfs(String Y) {
//	if (Y.length() == 1) {
//		if (xMap.containsKey(Y.charAt(0))) {
//			yMap.put(Y.charAt(0), yMap.getOrDefault(Y.charAt(0), "") + Y);
//		}
//		return;
//	} else {
//		if (Y.length() > 2) {
//			String x = Y.substring(0, Y.length() / 3);
//			String y = Y.substring(Y.length() / 3, Y.length() / 3 * 2);
//			String z = Y.substring(Y.length() / 3 * 2, Y.length());
//			YDfs(x);
//			YDfs(y);
//			YDfs(z);
//			return;
//		}
//		String x = Y.substring(0, Y.length() / 2);
//		String y = Y.substring(Y.length() / 2, Y.length());
//		if (x.length() > 0 && y.length() > 0) {
//			YDfs(x);
//			YDfs(y);
//		} else if (x.length() > 0) {
//			YDfs(x);
//		} else if (y.length() > 0) {
//			YDfs(y);
//		}
//	}
//}