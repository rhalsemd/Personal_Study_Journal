package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 지능형기차2455 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int result = 0;
		int max = 0;
		for(int i=0 ; i<4 ; i++) {
			st = new StringTokenizer(br.readLine());
			int getOff = Integer.parseInt(st.nextToken());
			int getOn = Integer.parseInt(st.nextToken());
			
			result -= getOff;
			result += getOn;
			if(max < result) {
				max = result;
			}
		}
		System.out.println(max);
	}

}
