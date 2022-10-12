package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class SpeedGame{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[][] front = new int[3][3];
	int[][] back = new int[3][3];
	
	int num = 1;
	
	void setting() {
		int k = 1;
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				front[i][j] = k++;
			}
		}
		
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back[i].length; j++) {
				back[i][j] = k++;
			}
		}
	}
	
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int xr = ran.nextInt(3);
			int yr = ran.nextInt(3);
			
			int temp = front[0][0];
			front[0][0] = front[xr][yr];
			front[xr][yr] = temp;
		}
		
		for (int i = 0; i < 1000; i++) {
			int xr = ran.nextInt(3);
			int yr = ran.nextInt(3);
			
			int temp = back[0][0];
			back[0][0] = back[xr][yr];
			back[xr][yr] = temp;
		}
	}
	
	void showGame() {
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				System.out.print(front[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	void playGame() {
		
		System.out.print("인덱스1 입력: ");
		int xidx = scan.nextInt();
		System.out.print("인덱스2 입력: ");
		int yidx = scan.nextInt();
		
		if (front[xidx][yidx]==num) {
			if (num<=9) {
				front[xidx][yidx] = back[xidx][yidx];
			}
			else {
				front[xidx][yidx] = 0;
			}
			num++;
		}
		
	}
	
	void run() {
		setting();
		shuffle();
		
		while(true) {
			showGame();
			if (num==19) {
				System.out.println("프로그램 종료");
				break;
			}
			playGame();
		}
	}
}
public class MethodEx17 {

	public static void main(String[] args) {

		SpeedGame sg = new SpeedGame();
		sg.run();

	}

}
