package example;

public class 문자열계산하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("3 + 4");

	}
	public static int solution(String my_string) {
		String[] stringArr = my_string.split(" ");
        int answer = Integer.parseInt(stringArr[0]);
        
        for(int i = 1; i < stringArr.length; i+=2) {
            if(stringArr[i].equals("+")) {
                answer += Integer.parseInt(stringArr[i+1]);
            } else {
                answer -= Integer.parseInt(stringArr[i+1]);
            }
        }
        
        return answer;
    }

}
