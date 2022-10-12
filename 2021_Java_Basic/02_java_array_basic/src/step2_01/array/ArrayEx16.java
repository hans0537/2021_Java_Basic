package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int[] arr = new int[4];
		int[] check = new int[4];
		int i = 0;

		while(i<4) {
			int r = ran.nextInt(4)+1;

			if (check[r-1]==0) {
				arr[i] = r;
				check[r-1] = 1;
				i++;
			}
		}

		i = 0;
		while(i<4) {
			System.out.println(Arrays.toString(arr));
			System.out.print("입력 : ");
			int idx = scan.nextInt();
			int min = arr[0];
			for (int j = 0; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
				}
			}

			if (arr[idx]==min) {
				arr[idx] = 9;
				i++;
			}


		}System.out.println(Arrays.toString(arr));
	}

}
