package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class PCCP모의고사1외톨이알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution1 {
    public String solution(String input_string) {
        String answer = "";
		char tempChar;
		int tempCnt = 0;
		int repeatCnt = 0;
        
		Queue<Character> q = new LinkedList<>();
		HashMap<Character, Integer> originHm = new HashMap<>();
		HashMap<Character, Integer> repeatChkHm = new HashMap<>();
		ArrayList<Character> list = new ArrayList<>();
        
		for (int i = 0; i < input_string.length(); i++) {
			q.offer(input_string.charAt(i));
		}
        
		while (!q.isEmpty()) {
        	
			tempChar = q.poll();
        	
			if (originHm.get(tempChar) == null) {
				originHm.put(tempChar, 1);
				repeatChkHm.put(tempChar, 1);
			} else {
				tempCnt = originHm.get(tempChar) + 1;
				originHm.put(tempChar, tempCnt);
			}
        	
			if (!q.isEmpty()) {
        		
				if (tempChar == q.peek()) { 
					repeatCnt = repeatChkHm.get(tempChar) + 1;
					repeatChkHm.put(tempChar, repeatCnt);
				}
			}
		}
        
		for (char key : originHm.keySet()) {
        	
			if (originHm.get(key) != repeatChkHm.get(key) && originHm.get(key) > 1) {
				list.add(key);
			}
		}
        
		if (list.size() == 0) {
			answer = "N";
		} else {
			Collections.sort(list);
        	
			StringBuilder sb = new StringBuilder();
             
			for (int i = 0; i < list.size(); i++) {
				sb.append(list.get(i));
			}
             
			answer = sb.toString();
		}
        
		return answer;
    }
}
