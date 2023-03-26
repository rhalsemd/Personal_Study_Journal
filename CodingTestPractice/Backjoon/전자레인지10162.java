package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 전자레인지10162 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = {300, 60, 10};
		String result = "";
		int T = Integer.parseInt(st.nextToken());
		
		if (T % 10 != 0) {
            sb.append("-1");
        } else {
            for (int i = 0; i < arr.length; i++) {
                result += T / arr[i]+" ";
                T %= arr[i];
            }
            sb.append(result);
        }
		
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

}
