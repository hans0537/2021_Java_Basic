package step3_01.arrayAdvance;

import java.util.Scanner;

public class ArrayEx41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};

		int x = 0; int y = 0;

		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j]==0) {
					System.out.print(" │ ");
				}else if(ladder[i][j]==1) {
					if (j!=0 && ladder[i][j-1]==1) {
						System.out.print("─┤ ");
					}else if (j!=4 && ladder[i][j+1]==1) {
						System.out.print(" ├─");
					}
				}	
			}
			System.out.println();
		}

		System.out.print("0~4 번호 입력: ");
		int num = scan.nextInt();

		for (int i = 0; i < ladder.length; i++) {
			if (ladder[y][x]==0) {
				y++;
			}else if (ladder[y][x]==1) {
				if(x!=0 && ladder[y][x-1]==1) {
					x--;
				}else if(x!=4 && ladder[y][x+1]==1) {
					x++;
				}
				y++;
			}
		}
		System.out.println("결과 x: " + x);
		System.out.println("결과 y: " + y);
	}

}
