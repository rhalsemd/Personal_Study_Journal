package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 상근날드5543 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burger1 = Integer.parseInt(br.readLine());
        int burger2 = Integer.parseInt(br.readLine());
        int burger3 = Integer.parseInt(br.readLine());
        int coke = Integer.parseInt(br.readLine());
        int soda = Integer.parseInt(br.readLine());
        
        System.out.println(Math.min(Math.min(burger1, burger2), burger3) + Math.min(coke, soda) - 50);
	}

}
