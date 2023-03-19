package example;

import java.util.Arrays;

public class 문자열정렬하기2 {
	public static void main(String[] args) {
		System.out.println(solution("Bcad"));
	}
	public static String solution(String my_string) {
        String lowString = my_string.toLowerCase();
        String[] chartoString = lowString.split("");
        Arrays.sort(chartoString);
        String answer = "";
        for(int i=0;i<chartoString.length; i++) {
        	answer+=chartoString[i];
        }
        return answer;
    }
}
