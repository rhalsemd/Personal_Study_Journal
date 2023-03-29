package example;

import java.util.ArrayList;

public class n의배수고르기 {
	public static void main(String[] args) {
		
	}
	class Solution {
	    public int[] solution(int n, int[] numlist) {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        for (int num : numlist) {
	            if (num % n == 0) {
	                arrayList.add(num);
	            }
	        }
	        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
	        return answer;
	    }
	}
}
