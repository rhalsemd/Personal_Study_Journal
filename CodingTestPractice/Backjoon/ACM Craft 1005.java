import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 0; t<T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] timeArr = new int[N+1];
			int[] indegree = new int[N+1];
			
			ArrayList<Integer>[] outdegree = new ArrayList[N+1];
			for(int i = 1; i<=N; i++) {
				outdegree[i] = new ArrayList<Integer>();
			}
			
			for(int i = 1; i<=N; i++) {
				timeArr[i] = sc.nextInt();
			}
			
			for(int i = 0; i<K; i++) {
				int curV = sc.nextInt();
				int nextV = sc.nextInt();
				
				outdegree[curV].add(nextV);	
				indegree[nextV] += 1;
			}
			
			int W = sc.nextInt();
			int[] timeSum = new int[N+1];
			
			Queue<Integer> que = new LinkedList<Integer>();
			for(int i = 1; i<=N; i++) {
				if(indegree[i]==0) {
					que.add(i);
					timeSum[i] = timeArr[i];
				}
			}
		
			while(!que.isEmpty()) {
				int now = que.poll();
				
				if(now==W) break;
				
				for(int i = 0; i<outdegree[now].size(); i++) {
					int next = outdegree[now].get(i);
					
					if(timeSum[next] < timeSum[now] + timeArr[next]) {
						timeSum[next] = timeSum[now] + timeArr[next];
					}
					indegree[next] -= 1;
					if(indegree[next] == 0) que.add(next);
					
				}
			
			}
			System.out.println(timeSum[W]);
		}
	}
}