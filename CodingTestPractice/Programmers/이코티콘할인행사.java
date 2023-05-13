import java.util.*;

class Solution {
    static class Imoticon{
        double price;
        double percent;
        Imoticon(double price, double percent){
            this.price = price;
            this.percent = percent;
        }
    }
    static double[] sales = {0.1, 0.2, 0.3, 0.4};
    static List<Imoticon> imsi = new ArrayList<>();
    static int maxJoin=Integer.MIN_VALUE, maxPrice = Integer.MIN_VALUE;
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        dfs(0, users, emoticons);

        answer[0] = maxJoin;
        answer[1] = maxPrice;

        return answer;
    }
    
    public static void dfs(int depth, int[][] users, int[] emoticons){
        if(depth == emoticons.length){
            int total = 0;
            int join = 0;
            for(int i=0;i<users.length;i++){
                int userPercent = users[i][0];
                int userPrice = users[i][1];
                int sum = 0;
                for(int j=0;j<imsi.size();j++){
                    Imoticon cur = imsi.get(j);
                    double curPrice = cur.price;
                    double curPercent = cur.percent;
                    if(curPercent >= userPercent)
                        sum += curPrice;
                }
                if(sum >= userPrice)
                    join++;
                else{
                    total += sum;
                }

                if(maxJoin < join){
                    maxPrice = total;
                    maxJoin = join;
                }else if(maxJoin == join && maxPrice < total){
                    maxPrice = total;
                }
            }
            return;
        }

        for(int i=0;i<sales.length;i++){
            imsi.add(new Imoticon(((1-sales[i])*(emoticons[depth])), (100*sales[i])));
            dfs( depth+1, users, emoticons);
            imsi.remove(imsi.size()-1);

        }
    }
}