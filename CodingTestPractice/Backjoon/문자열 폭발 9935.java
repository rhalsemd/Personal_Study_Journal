import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Stack<Character> stack = new Stack<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line =  br.readLine();
		String regex = br.readLine();
		for(int i = 0; i< line.length();i++) {
			stack.push(line.charAt(i));
			boolean flag = true;
			
			if(stack.size()>= regex.length()) {
				for(int j = 0 ; j< regex.length();j++) 
				{
					if(stack.get(stack.size()-regex.length()+j) != regex.charAt(j)) {
						flag = false;
						break;
					}
						
				}

			if(flag) {
				for(int cnt = 0;cnt <regex.length();cnt++) 
					stack.pop();
			}
			
			}	
			
		}
		StringBuilder sb = new StringBuilder();
		for(Character c : stack) {
			sb.append(c);
		}
		System.out.println(stack.size() == 0? "FRULA":sb.toString());
	}
}