package example;

public class 숫자찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int num, int k) {
        String numS = Integer.toString(num);
        String sK = Integer.toString(k);
        if(numS.indexOf(sK) == -1) {
            return -1;
        } else {
            return numS.indexOf(sK)+1;
        }
    }

}
