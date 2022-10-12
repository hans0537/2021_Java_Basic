package step3_01.arrayAdvance;

import java.util.Arrays;

public class ArrayEx37 {

	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
		}; 

		int[] garo = new int[3];
		int[] sero = new int[4];

		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < sero.length; j++) {
				total += arr[i][j];
			}
			garo[i] = total;
			total = 0;
		}
		System.out.println(Arrays.toString(garo));
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		total = 0;
		int j = 0;
		while(j<4) {
			for (int i = 0; i < arr.length; i++) {
				total += arr[i][j];
			}
			sero[j] = total;
			total=0;
			j++;
		}
		System.out.println(Arrays.toString(sero));
		
		//다른방법
		
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				garo[i] += arr[i][k];
				sero[k] += arr[i][k];
			}
		}
		System.out.println(Arrays.toString(garo));
		System.out.println(Arrays.toString(sero));
	}

}
