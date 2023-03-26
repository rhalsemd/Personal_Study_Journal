package example;

public class 자릿수더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(1234));
	}
	public static int solution(int n) {
		int answer = 0;
		
		String temp = Integer.toString(n);
		String[] tempArray = temp.split("");
		for(int i=0; i<tempArray.length;i++) {
			answer += Integer.valueOf(tempArray[i]);
		}
		
		return answer;
	}
}
