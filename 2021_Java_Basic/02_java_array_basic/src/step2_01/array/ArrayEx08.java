package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		String[] arr = new String[5];
		int cnt = 0;	
		System.out.println("정 답: ");
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = scan.nextInt();
		}
		
		for (int i = 0; i < hgd.length; i++) {
			if (hgd[i]==answer[i]) {
				arr[i] = "O";
				cnt++;
			}else {
				arr[i] = "X";
			}
		}
		System.out.println(Arrays.toString(hgd));
		System.out.println(Arrays.toString(arr));
		System.out.println("점수 = " + (cnt*20));
	}

}
