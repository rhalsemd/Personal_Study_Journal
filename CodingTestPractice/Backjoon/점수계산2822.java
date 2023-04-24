package example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 점수계산2822 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[][] = new int[8][2];
		int arr2[] = new int[5];

		for(int i=0; i<8; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = i+1;
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return b[0] - a[0];
			}
		});
		
		for(int i=0; i< 5; i++) {
			sum += arr[i][0];
			arr2[i] = arr[i][1];
		}
		
		Arrays.sort(arr2);

		System.out.println(sum);
		
		for(int i=0; i<5; i++) {
			System.out.print(arr2[i] + " ");	
		}

		sc.close();
	}

}
