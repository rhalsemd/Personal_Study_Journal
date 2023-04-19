package example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class 달리기경주 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 private static Map<String, Integer> playerInfo = new HashMap<>();

	    public String[] solution(String[] players, String[] callings) {
	        makeInfo(players);

	        Arrays.stream(callings).forEach( player -> {
	            int idx = playerInfo.get(player);
	            String frontPlayerName = players[idx - 1];
	            players[idx] = frontPlayerName;
	            players[idx - 1] = player;

	            playerInfo.put(frontPlayerName, idx);
	            playerInfo.put(player, idx - 1);
	        });

	        return players;
	    }

	    private static void makeInfo(String[] players) {
	        IntStream.range(0, players.length).forEach(index -> {
	            playerInfo.put(players[index], index);
	        });
	    }
}
