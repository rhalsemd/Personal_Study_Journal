package example;

public class PCCP모의고사1유전법칙 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution3 {
	public static String solve(int generation, long number) {
	long upperCaseLastNum = 0;
	long centerGroupLastNum = 0;
	String strRoot = "Rr";
	long tempNum = 0;
	
	if (generation == 1) {
		return strRoot;
	}
	
	upperCaseLastNum = (long) Math.pow(4, generation - 2);
	centerGroupLastNum = upperCaseLastNum + (2 * upperCaseLastNum);
	
	if (number <= upperCaseLastNum) {
		return "RR";
	} else if (upperCaseLastNum < number && number <= centerGroupLastNum) {
		tempNum = number % ((centerGroupLastNum - upperCaseLastNum) / 2) == 0 ?
		(centerGroupLastNum - upperCaseLastNum) / 2 : number % ((centerGroupLastNum - upperCaseLastNum) / 2);
		return solve(generation - 1, tempNum);
	} else {
		return "rr";
	}
}

public static String[] solution(int[][] queries) {
	String[] answer = {};
	int generation = 0;
	long number = 0;
	
	answer = new String[queries.length];
	
	for (int i = 0; i < queries.length; i++) {
		generation = queries[i][0];
		number = queries[i][1];
		
		answer[i] = solve(generation, number);
	}
	
	return answer;
}
}