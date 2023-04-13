package example;

public class 영어가싫어요 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public long solution(String numbers) {
        String[] matchNumbers = {
                "zero", "one", "two"
                , "three", "four", "five"
                , "six", "seven", "eight", "nine"};

        for (int i = 0; i < matchNumbers.length; i++) {
            numbers = numbers.replaceAll(matchNumbers[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}