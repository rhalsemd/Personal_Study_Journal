import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->{
			if(a[0]-b[0] == 0) {
				return b[1]-a[1];
			}
			return a[0]-b[0];
		});
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			pq.add(new int[] {M,V});
			
		}

		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < K; i++) {
			int C = Integer.parseInt(br.readLine()); //가방 최대 무게 
			b.add(C);
		}
		Collections.sort(b);
		
		PriorityQueue<Integer> v = new PriorityQueue<Integer>(Collections.reverseOrder());
		long total = 0;
		for (int i = 0; i < b.size(); i++) {
			int weight = b.get(i);
			
			while (!pq.isEmpty()) {
				 
				if(pq.peek()[0] <= weight) {
					v.add(pq.poll()[1]);
				}else {
					break;
				}
			}
			
			if(v.isEmpty()) continue;
			total += v.poll();
		}

		
		System.out.println(total);
		
		
	}

}