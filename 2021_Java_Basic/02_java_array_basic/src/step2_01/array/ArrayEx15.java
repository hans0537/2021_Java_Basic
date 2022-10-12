package step2_01.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int temp = 0;
		int tempRan = 0;
		int cnt  = 0;

		// ���� ����(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {			
			tempRan = ran.nextInt(9);
			temp = front[0]; 
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}
		cnt = 0;
		while(cnt<5) {
			for (int i=0; i<10; i++) {
				System.out.print(front[i] + " ");
			}
			System.out.println();
			for (int i=0; i<10; i++) {
				System.out.print(back[i] + " ");
			}
			System.out.println();

			System.out.print("인덱스1 입력 :");
			int idx1 = scan.nextInt();
			System.out.print("인덱스2 입력 :");
			int idx2 = scan.nextInt();

			if (idx1==idx2) {
				System.out.println("인덱스가 중복됩니다");
				System.out.println();
				continue;
			}
			
			if (front[idx1]==front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
				cnt++;
			}
			
			
			
		}
	}

}
