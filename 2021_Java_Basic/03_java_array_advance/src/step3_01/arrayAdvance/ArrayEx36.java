package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];

		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스1 입력: ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력: ");
		int idx2 = scan.nextInt();
		System.out.println(arr[idx1][idx2]);


		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		idx1 = 0;
		idx2 = 0;
		System.out.print("값 입력: ");
		int data = scan.nextInt();
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j]==data) {
					idx1=i; idx2=j;
				}
			}
		}
		System.out.println("인덱스1 출력: " + idx1 + "  인덱스2 출력: " + idx2);
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		idx1 = 0;
		idx2 = 0;
		int max = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					idx1 = i; idx2 = j;
				}
			}
		}
		System.out.println("인덱스1 출력: " + idx1 + "  인덱스2 출력: " + idx2);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.println("값1 입력: ");
		int data1 = scan.nextInt();
		System.out.println("값2 입력: ");
		int data2 = scan.nextInt();
		
		int data1_idx1 = 0;
		int data1_idx2 = 0;
		int data2_idx1 = 0;
		int data2_idx2 = 0;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j]==data1) {
					data1_idx1=i; data1_idx2=j;
				}
			}
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j]==data2) {
					data2_idx1=i; data2_idx2=j;
				}
			}
		}
		
		arr[data1_idx1][data1_idx2] = data2;
		arr[data2_idx1][data2_idx2] = data1;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
		
	}
}
