package example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드1_2161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

        int n= scan.nextInt();

        Queue<Integer> que=new LinkedList();

        for(int i=1;i<=n;i++){
            que.add(i);
        }
        while(que.size()!=1){
            int s=que.poll();
            System.out.print(s+" ");
            int qu=que.poll();
            que.add(qu);
        }
        System.out.print(que.poll());
	}

}
