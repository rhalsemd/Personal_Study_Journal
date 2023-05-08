package example;
import java.util.*;

public class 뒤에있는큰수찾기 {

	class Solution {
	    public int[] solution(int[] numbers) {
	        int[] answer = new int[numbers.length];

	        Arrays.fill(answer, -1);

	        Stack<Integer> stack = new Stack<>();

	        for (int arrIdx = 0; arrIdx < numbers.length; arrIdx++) {
	            while (!stack.isEmpty() && numbers[arrIdx] > numbers[stack.peek()]) {
	                int stkIdx = stack.pop();
	                answer[stkIdx] = numbers[arrIdx];
	            }

	            stack.push(arrIdx);
	        }

	        return answer;
	    }
	}
}
