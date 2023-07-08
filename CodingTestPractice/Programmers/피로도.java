class Solution {
	
    static int result = 0;
	
    public int solution(int k, int[][] dungeons) {        
        boolean[] check = new boolean[dungeons.length];
        
        dfs(dungeons, check, 0, k, 0, 0);
        return result;
    }
    
    public void dfs(int[][] dungeons, boolean[] check, int sum, int k, int dfs_result, int idx){
    	for(int i=0; i<dungeons.length; i++) {
    		if(check[i]) continue;
    		check[i] = true;
    		if(k-sum >= dungeons[i][0]) {
    			dfs(dungeons, check, sum+dungeons[i][1], k, dfs_result+1, idx+1);
    		}    		
    		check[i] = false;    		
    	}
        result = Math.max(result, dfs_result);

    }
}