package example;

import java.util.ArrayList;
import java.util.List;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("abc1Addfggg4556b",6);
	}
	public static String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList();
        for (int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }
        if (my_str.length() % n != 0) {
             answer.add(my_str.substring( (my_str.length() / n) * n));
        }
        return answer.toArray(new String[0]);
    }

}
