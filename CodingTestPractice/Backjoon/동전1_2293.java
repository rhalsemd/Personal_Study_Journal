package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전1_2293 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    int k = Integer.parseInt(st.nextToken());
	    int[] dp = new int[k+1];
	    for (int t = 0; t < n; t++) {
	      int coin = Integer.parseInt(br.readLine());
	      for (int i = 1; i <= k; i++) {
	        if (i - coin > 0) {
	          dp[i] = dp[i] + dp[i-coin];
	        } else if (i - coin == 0) {
	          dp[i]++;
	        }
	      }
	    }
	    System.out.print(dp[k]);
	}

}
