import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		
		for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
			pq.add(Long.parseLong(st.nextToken()));
		}
		
		long num = 0;
		while (pq.size() > 1) {
			long temp1 = pq.poll();
			long temp2 = pq.poll();
			
			num += temp1 + temp2;
			pq.add(temp1 + temp2);
		}
		
		System.out.println(num);
		
	}
}