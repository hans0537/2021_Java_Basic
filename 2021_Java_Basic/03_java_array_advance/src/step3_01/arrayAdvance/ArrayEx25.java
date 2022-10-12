package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		int cnt = 0;
		
		while(cnt<5) {
			System.out.println(Arrays.toString(arr));
			
			int max = 0;
			int maxidx = 0;
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
					maxidx = i;
				}
			}
			System.out.print("최댓값 입력: ");
			int data = scan.nextInt();
			
			if (data==max) {
				arr[maxidx] = 0;
				cnt++;
			}
			
		}
		
	}

}
