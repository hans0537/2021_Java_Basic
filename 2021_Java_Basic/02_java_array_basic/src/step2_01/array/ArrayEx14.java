package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;

		for (int i=0; i<7; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		while(true) {
			System.out.println(Arrays.toString(game));
			System.out.print("왼쪽[1] 오른쪽[2] 입력: ");
			int sel = scan.nextInt();
			if (sel==1) {
				int temp = player - 1;
				if (temp<0) {
					continue;
				}
				game[player] = 0;
				game[temp] = 2;
				player--;
			}
			else if (sel==2) {
				int temp = player + 1;
				if (temp>6) {
					continue;
				}
				game[player] = 0;
				game[temp] = 2;
				player++;
			}
		
		
		}
	}
}
