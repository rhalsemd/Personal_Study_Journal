import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		if(n==0 || n%2==1)
			System.out.println(0);
		else {
			int arr[] = new int[n+1];
			arr[2] = 3;
			int cnt = 1;//바로 가는 경우의 수*2
			for(int i=4;i<=n;i+=2) {
				arr[i] = arr[i-2]*3+cnt*2;
				cnt+=arr[i-2];
			}
			System.out.println(arr[n]);
		}
	}
}