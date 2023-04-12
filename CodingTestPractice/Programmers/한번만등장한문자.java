package example;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public String solution(String s) {
        char[] alphabet = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 97]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == 1) sb.append((char) (i + 97));
        }

        return sb.toString();
    }
}
