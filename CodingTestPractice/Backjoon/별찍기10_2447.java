package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기10_2447 {
	static StringBuilder[] sb;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = String.format("%" + N + "s", ' ').replace(' ', '*');
		sb = new StringBuilder[N];
		
		for(int i = 0; i < N; i++) {
			sb[i] = new StringBuilder(s);
		}
		star(0, 0, N, false);
		
		for (int i = 0; i < N; i++) {
			System.out.println(sb[i]);
		}
	}

	static void star(int x, int y, int N, boolean blank) {
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					sb[i].setCharAt(j, ' ');
				}
			}
			return;
		}
 
		// 더이상 쪼갤 수 없는 블록일 때
		if (N == 1) {
			return;
		}
 
		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(i, j, size, true);
				}
				else {
					star(i, j, size, false);
				}
			}
		}
	}

}
