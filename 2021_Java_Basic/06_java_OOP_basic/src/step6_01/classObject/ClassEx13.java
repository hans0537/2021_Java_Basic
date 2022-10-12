package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex13{
	final int SIZE = 9;

	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}

public class ClassEx13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex13 e = new Ex13();

		for (int i = 0; i < e.SIZE; i++) {
			e.front[i] = (i + 1);
			e.back[i] = (i + 1 + e.SIZE);
		}

		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(e.SIZE);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(e.SIZE);
			int temp = e.back[0];
			e.back[0] = e.back[r];
			e.back[r] = temp;
		}

		int num = 1;
		System.out.println(Arrays.toString(e.front));
		System.out.println(Arrays.toString(e.back));
		while(true) {
			for (int i=0; i<e.SIZE; i++) {
				if (e.front[i] == 0) System.out.print("\t");
				else 				 System.out.print(e.front[i] + "\t");

				if (i % 3 == 2) System.out.println("\n"); 
			}

			if (num==19) {
				break;
			}
			System.out.print("인덱스 입력: ");
			int idx = scan.nextInt();

			if (e.front[idx]==num) {
				if (1<=e.front[idx] && e.front[idx]<=9) {
					e.front[idx]=e.back[idx];
					num++;
				}else if (10<=e.front[idx] && e.front[idx]<=18) {
					e.front[idx]=0;
					num++;
				}
			}
		}
	}

}
