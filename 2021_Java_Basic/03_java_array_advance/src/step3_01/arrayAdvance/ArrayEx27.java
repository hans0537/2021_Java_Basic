package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] game = {0,0,1,0,2,0,0,1,0};

		while(true) {
			System.out.println(Arrays.toString(game));
			int idx = 0;
			for (int i = 0; i < game.length; i++) {
				if (game[i]==2) {
					idx = i;
				}
			}
			System.out.print("이동 선택 1)왼쪽, 2)오른쪽: ");
			int move = scan.nextInt();

			if (move==1) {
				if (idx-1>=0) {

					if (game[idx-1]==1) {
						System.out.print("벽을 파괴하시겠습니까? 3번입력: ");
						int crash = scan.nextInt();
						if (crash==3) {
							game[idx-1]=0;
						}
					}else if(game[idx-1]==0) {
						game[idx-1]=2;
						game[idx]=0;
					}
				}	

			}
			else if(move==2) {
				if(idx+1<=8) {
					if (game[idx+1]==1) {
						System.out.print("벽을 파괴하시겠습니까? 3번입력: ");
						int crash = scan.nextInt();
						if (crash==3) {
							game[idx+1]=0;
						}
					}else if(game[idx+1]==0) {
						game[idx+1]=2;
						game[idx]=0;
					}
				}	

				}
			}
		}
	}

