package example;

public class 배열의유사도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int solution(String[] s1, String[] s2) {
	        int answer = 0;

	        for (int i=0; i<s1.length; i++) {
	            for (int j=0; j<s2.length; j++) {
	                if (s1[i].equals(s2[j])) {
	                    answer += 1;
	                }
	            }
	        }

	        return answer;
	    }
	}
}
