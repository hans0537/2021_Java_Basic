package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx43 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;

		int[][] map = new int[SIZE][SIZE];

		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;

		System.out.print(">>> 설치할 벽의 개수를 입력하세요: ");
		wallCount = scan.nextInt();

		while(wallCount!=0) {
			int rx = ran.nextInt(SIZE);
			int ry = ran.nextInt(SIZE);

			if (map[rx][ry]==0) {
				map[rx][ry] = WALL;
				wallCount--;
			}
		}

		while(true) {
			int rx = ran.nextInt(5)+1;
			int ry = ran.nextInt(5)+1;

			if (map[rx][ry]==0) {
				ballX = rx;
				ballY = ry;
				map[rx][ry]=BALL;
				break;
			}
		}

		while(true) {
			int rx = ran.nextInt(SIZE);
			int ry = ran.nextInt(SIZE);

			if (map[rx][ry]==0) {
				goalX = rx;
				goalY = ry;
				map[rx][ry]=GOAL;
				break;
			}
		}

		while(true) {
			int rx = ran.nextInt(SIZE);
			int ry = ran.nextInt(SIZE);

			if (map[rx][ry]==0) {
				pY = ry;
				pX = rx;
				map[rx][ry]=PLAYER;
				break;
			}
		}

		while(true) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j]==BALL) System.out.print("공 ");
					else if (map[i][j]==GOAL) System.out.print("골 ");
					else if (map[i][j]==WALL) System.out.print("벽 ");
					else if (map[i][j]==PLAYER) System.out.print("읏 ");
					else System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
			if (ballX == goalX && ballY == goalY) {
				System.out.println("게임 종료");
				break;
			}
			System.out.println("1.상, 2.하, 3.좌, 4.우  선택:");
			int sel = scan.nextInt();
			
			int xx = pX;
			int yy = pY;
			
			if (sel==1) xx--;
			else if(sel==2) xx++;
			else if(sel==3) yy--;
			else if(sel==4) yy++;
			
			if (yy<0 || yy>=SIZE) continue;
			if (xx<0 || xx>=SIZE) continue;
			if (map[xx][yy]==WALL) continue;
			
			if (map[xx][yy]==BALL) {
				int xxx = ballX;
				int yyy = ballY;
				if (sel==1) xxx--;
				else if(sel==2) xxx++;
				else if(sel==3) yyy--;
				else if(sel==4) yyy++;
				
				if (yyy<0 || yyy>=SIZE) continue;
				if (xxx<0 || xxx>=SIZE) continue;
				if (map[xxx][yyy]==WALL) continue;
				
				map[ballX][ballY] = 0;
				ballX = xxx;
				ballY = yyy;
				map[ballX][ballY] = BALL;
				
			}
			
			map[pX][pY] = 0;
			pX = xx;
			pY = yy;
			map[pX][pY] = PLAYER;
		}
	}
}
