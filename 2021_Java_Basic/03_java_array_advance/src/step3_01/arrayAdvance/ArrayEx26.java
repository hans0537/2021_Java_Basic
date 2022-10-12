package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 9;
		
		int[] blank = new int[SIZE];
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			blank[i] = i;
			front[i] = i+1;
			back[i] = i+10;
		}
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(SIZE);
			
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			r = ran.nextInt(SIZE);
			temp = back[0];
			back[0] = back[r];
			back[r] = temp;
		}
		
		int i = 1;
		
		while(true) {
			System.out.println(Arrays.toString(blank));
			System.out.println(Arrays.toString(front));
			System.out.print("인덱스 입력: ");
			int idx = scan.nextInt();
			
			
			if (front[idx] == i) {
				if (1<=i && i<=SIZE) {
					front[idx]=back[idx];
				}else {
					front[idx]=0;
				}
				i++;
			}
			
			if (i==19) {
				break;
			}
		}
	}

}
