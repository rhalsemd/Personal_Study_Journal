package example;

public class 암호해독 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1;i<cipher.length();i+=code){
            answer+=cipher.charAt(i);
        }
        return answer;
    }
}