package example;

import java.util.*;
import java.io.*;

public class K번째수11004  {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> A = new ArrayList<>(); // 풀이 1
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(A);
		
		System.out.println(A.get(K-1));

	}
}