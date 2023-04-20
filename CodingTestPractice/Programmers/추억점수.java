package example;

import java.util.Arrays;

public class 추억점수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(Arrays.asList(name).indexOf(photo[i][j]) != -1){
                    answer[i] += yearning[Arrays.asList(name).indexOf(photo[i][j])];
                }
            }
        }
        return answer;
    }
}
