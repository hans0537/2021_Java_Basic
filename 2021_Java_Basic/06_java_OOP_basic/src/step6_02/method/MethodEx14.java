package step6_02.method;

import java.util.Arrays;
import java.util.Scanner;

class NumberGame{
	
	Scanner scan = new Scanner(System.in);
	
	int[] move = {0,0,0,0,8,0,0,0,0,0};
	int playerLocation = 4;
	
	void printPlay() {
		System.out.println(Arrays.toString(move));
	}
	
	void showMenu() {
		System.out.println("1.좌로 이동");
		System.out.println("2.우로 이동");
		System.out.println("3.종료 하기");
		System.out.print("메뉴 선택: ");
	}
	
	void moveLeft() {
		if (playerLocation > 0) {
			move[playerLocation] = 0;
			move[playerLocation-1] = 8;
			playerLocation--;
		}else {
			System.out.println("더이상 움직일수 없습니다.");
		}
	}
	
	void moveRight() {
		if (playerLocation < move.length - 1) {
			move[playerLocation] = 0;
			move[playerLocation+1] = 8;
			playerLocation++;
		}else {
			System.out.println("더이상 움직일수 없습니다.");
		}
	}
	
	void run() {
		while(true) {
			printPlay();
			
			showMenu();
			int sel = scan.nextInt();
			
			if (sel==1) {
				moveLeft();
			}else if(sel==2) {
				moveRight();
			}else if(sel==3) {
				System.out.println("프로그램 종료");
				break;
			}
		
			
		}
	}
}
public class MethodEx14 {

	public static void main(String[] args) {
			
		NumberGame ng = new NumberGame();
		ng.run();
		

	}

}
