package example;

public class 세균증식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int n, int t) {

        for(int i = 1; i <= t; i++) {
            n *= 2;
        }

        return n;
    }

}
