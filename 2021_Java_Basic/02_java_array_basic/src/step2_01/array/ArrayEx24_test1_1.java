package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_test1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = { 10, 4, 5, 3, 1 };
		System.out.println(Arrays.toString(a));
		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력
		int total = 0;

		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		System.out.println(total);

		// 문제 2) 값을 입력하면 인덱스 출력
		// 예) 5 ==> 2  ,  1 ==> 4
		int idx = -1;
		System.out.print("값입력: ");
		int data = scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i]==data) {
				idx = i;
			}
		}
		if (idx==-1) {
			System.out.println("해당 값 없음");
		}else {
			System.out.println(idx);
		}

		// 문제 3)  인덱스를 입력하면 값 출력
		// 예) 2 ==> 5  , 4 ==> 1

		System.out.print("인덱스 입력: ");
		idx = scan.nextInt();

		if (idx<0 || idx>5) {
			System.out.println("해당 인덱스 값 없음");
		}else {
			System.out.println(a[idx]);
		}

		// 문제 4) 위 배열중 가장 큰 값 출력 
		// 예) 10

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max<a[i]) {
				max = a[i];
			}
		}
		System.out.println("최대값: " + max);
		// 문제 5) 위 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==1) {
				cnt++;
			}
		}
		System.out.println("홀수의 개수: " + cnt);

		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		int[] b = {0, 0, 0, 0, 0};

		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=1) {
				b[i] = 0;
			}else {
				b[i]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));




		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터  저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}
		int[] c = { 0,0,0,0,0 };
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==1) {
				c[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
