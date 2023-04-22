package example;

public class PCCP모의고사1체육대회 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution2 {
    public static int[][] studentAbility;
	public static int studentCnt = 0;
	public static int sportsCnt = 0;
	public static int[] exceptCmbMax;
	
	public static int getMaxAbility(int studentCmbNum, int sportsIndex) { 
		int maxScore = 0;
		int score = 0;
		int checkNum = 0;
		
		if (sportsIndex == sportsCnt) { // sportsIndex 0 ~ 2까지만 체크하도록 함
			return 0;
		}
		
		if (exceptCmbMax[studentCmbNum] == 0) {
			
			for (int i = 0; i < studentCnt; i++) { 
				
				checkNum = (1 << i); 
				
				if ((studentCmbNum & checkNum) > 0) { 
					continue;
				}
				
				score = studentAbility[i][sportsIndex] + getMaxAbility((studentCmbNum | checkNum), sportsIndex + 1); 
				
				if (score > maxScore) {
					maxScore = score;
				}
				
				exceptCmbMax[studentCmbNum] = maxScore; 
			}
		}
		
		return exceptCmbMax[studentCmbNum];
	}
	
	public static int solution(int[][] ability) {
		int answer = 0;
		studentCnt = ability.length; 
		sportsCnt = ability[0].length; 
		exceptCmbMax = new int[1 << studentCnt];
		studentAbility = ability;
		
		answer = getMaxAbility(0, 0);
		
		return answer;
	}
}