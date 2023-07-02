class Solution {

    static int maxDepth;
    static int[] aInfo;
    static int[] maxLInfo;
    static int maxScoreDiff = 0; 

    public int[] solution(int n, int[] info) {
        maxDepth = n;
        aInfo = info;
        int[] initLInfo = new int[11];
        dfs(0, initLInfo, -1);
        return maxScoreDiff > 0 ? maxLInfo : new int[]{-1};
    }

    public static void dfs(int depth, int[] lInfo, int idx) {
        if (depth == maxDepth) {
            int lScore = 0;
            int aScore = 0;
            for (int i = 0; i < 11; i++) {
                if (lInfo[i] > aInfo[i]) {
                    lScore += 10 - i;
                } else if (aInfo[i] != 0) {
                    aScore += 10 - i;
                }
            }
            int scoreDiff = lScore - aScore;
            if (scoreDiff > maxScoreDiff) {
                maxScoreDiff = scoreDiff;
                maxLInfo = lInfo;
            } else if (maxScoreDiff > 0 && scoreDiff == maxScoreDiff) {
                for (int i = 10; i >= 0; i--) {
                    if (lInfo[i] > maxLInfo[i]) {
                        maxScoreDiff = scoreDiff;
                        maxLInfo = lInfo;
                    } else if (maxLInfo[i] > lInfo[i]) {
                        return;
                    }
                }
            }
            return;
        }

        for (int i = idx + 1; i < 11; i++) {
            int[] nextLInfo = new int[11];
            for (int j = 0; j < 11; j++) {
                nextLInfo[j] = lInfo[j];
            }

            if (i == 10) {
                nextLInfo[i] += maxDepth - depth;
                dfs(maxDepth, nextLInfo, i);
            } else if (maxDepth - depth > aInfo[i]) {
                nextLInfo[i] += aInfo[i] + 1;
                dfs(depth + aInfo[i] + 1, nextLInfo, i);
            }
        }
    }
}