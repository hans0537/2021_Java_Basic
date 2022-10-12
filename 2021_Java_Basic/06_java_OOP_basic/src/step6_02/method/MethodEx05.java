package step6_02.method;

import java.util.Scanner;

class Ex05{
	void test1() {
		int a = 0;
		for (int i = 1; i < 6; i++) {
			a+=i;
		}
		System.out.println("합: " + a);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력: ");
			int num = scan.nextInt();
			arr[i] = num;
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값: " + max);
	}
}
public class MethodEx05 {

	public static void main(String[] args) {
		Ex05 e = new Ex05();
		
		// 문제 1) 1부터 5까지의 합을 출력하는 메서드
		e.test1();
		
		// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
		e.test2();

	}

}
