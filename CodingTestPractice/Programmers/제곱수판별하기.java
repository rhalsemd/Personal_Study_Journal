package example;

public class 제곱수판별하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(976));
	}	
	public static int solution(int n) {
        int answer = 0;
        double typedouble = Math.pow(n,0.5);
        int typeint = (int)Math.pow(n, 0.5);
        if(typeint == typedouble) {
        	answer = 1;
        }
        else {
        	answer = 2;
        }
        return answer;
    }
}
