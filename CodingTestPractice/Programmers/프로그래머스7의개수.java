package example;

public class 프로그래머스7의개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i<array.length; i++){
            String num = Integer.toString(array[i]);
            String[] temp = num.split("");
                for(int j=0;j<temp.length; j++){
                    if(temp[j].equals("7")){
                        answer++;
                    }
                }
        }
        
        return answer;
    }
}
