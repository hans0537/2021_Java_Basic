package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx12 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = {10,20,30,40,50};
		int getIndex1 , getIndex2;
		int getValue1 , getValue2;
		int temp = 0;

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		    인덱스2 입력 : 3
		//		    {10, 40, 30, 20, 50}
		System.out.println(Arrays.toString(arr));
		System.out.print("인덱스 1 입력:");
		getIndex1 = scan.nextInt();
		System.out.print("인덱스 2 입력:");
		getIndex2 = scan.nextInt();

		temp = arr[getIndex1];
		arr[getIndex1] = arr[getIndex2];
		arr[getIndex2] = temp;
		System.out.println(Arrays.toString(arr));


		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//          값2 입력 : 50
		//		    {50, 20, 30, 40, 10}
		System.out.println(Arrays.toString(arr));
		System.out.print("값 1 입력 :");
		getValue1 = scan.nextInt();
		System.out.print("값 2 입력 :");
		getValue2 = scan.nextInt();
		int idx1 = 0;
		int idx2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == getValue1) {
				idx1 = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == getValue2) {
				idx2 = i;
			}
		}

		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println(Arrays.toString(arr));



		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
	}
}
