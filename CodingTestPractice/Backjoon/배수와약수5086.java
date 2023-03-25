package example;

import java.util.Scanner;

public class 배수와약수5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        
		while(true) {
			
			int first = in.nextInt();
			int second = in.nextInt();
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {
				System.out.println("factor");
			}
			else if(first % second == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
	}

}
