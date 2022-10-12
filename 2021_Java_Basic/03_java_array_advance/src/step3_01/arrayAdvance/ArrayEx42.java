package step3_01.arrayAdvance;

import java.util.Scanner;

public class ArrayEx42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};

		int turn = 0;
		int win = 0;
		
		while(true) {
			System.out.println("========OMOK========");
			System.out.print("  ");
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
				for (int j = 0; j < size; j++) {
					System.out.print(omok[i][j] + " ");
				}
				System.out.println();
			}
			if(win==1) {System.out.println("P1승리!"); break;}
			else if(win==2) {System.out.println("P2승리!"); break;}
			
			if(turn%2==0) {
				System.out.print("P1 선택 idx1: ");
				int idx1 = scan.nextInt();
				System.out.print("P1 선택 idx2: ");
				int idx2 = scan.nextInt();
				
				if (omok[idx1][idx2]==0) {
					omok[idx1][idx2] = 1;
					turn++;
				}
			}
			else if (turn%2==1) {
				System.out.print("P2 선택 idx1: ");
				int idx1 = scan.nextInt();
				System.out.print("P2 선택 idx2: ");
				int idx2 = scan.nextInt();
				
				if (omok[idx1][idx2]==0) {
					omok[idx1][idx2] = 2;
					turn++;
				}
			}
			
			for (int i = 0; i < omok.length; i++) {
				for (int j = 0; j < omok[i].length-4; j++) {
					if (omok[i][j]==1 && omok[i][j+1]==1 && omok[i][j+2]==1 && omok[i][j+3]==1 && omok[i][j+4]==1) {
						win = 1;
					}else if (omok[i][j]==2 && omok[i][j+1]==2 && omok[i][j+2]==2 && omok[i][j+3]==2 && omok[i][j+4]==2) {
						win = 2;
					}
				}
			}
			
			for (int i = 0; i < omok.length-4; i++) {
				for (int j = 0; j < omok[i].length; j++) {
					if (omok[i][j]==1 && omok[i+1][j]==1 && omok[i+2][j]==1 && omok[i+3][j]==1 && omok[i+4][j]==1) {
						win = 1;
					}else if (omok[i][j]==2 && omok[i+1][j]==2 && omok[i+2][j]==2 && omok[i+3][j]==2 && omok[i+4][j]==2) {
						win = 2;
					}
				}
			}
			
			for (int i = 0; i < omok.length-4; i++) {
				for (int j = 0; j < omok[i].length-4; j++) {
					if (omok[i][j]==1 && omok[i+1][j+1]==1 && omok[i+2][j+2]==1 && omok[i+3][j+3]==1 && omok[i+4][j+4]==1) {
						win = 1;
					}else if (omok[i][j]==2 && omok[i+1][j+1]==2 && omok[i+2][j+2]==2 && omok[i+3][j+3]==2 && omok[i+4][j+4]==2) {
						win = 2;
					}
				}
			}
			
			for (int i = 0; i < omok.length-4; i++) {
				for (int j = omok[i].length-1; j >3; j--) {
					if (omok[i][j]==1 && omok[i+1][j-1]==1 && omok[i+2][j-2]==1 && omok[i+3][j-3]==1 && omok[i+4][j-4]==1) {
						win = 1;
					}else if (omok[i][j]==2 && omok[i+1][j-1]==2 && omok[i+2][j-2]==2 && omok[i+3][j-3]==2 && omok[i+4][j-4]==2) {
						win = 2;
					}
				}
			}
		}
	}

}
