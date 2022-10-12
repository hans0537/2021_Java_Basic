package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class MemoryGame{
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1,1,2,2,3,3,4,4,5,5};
	int[] back = new int[10];
	
	int correctCnt = 0;
	
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}
	}
	
	void printCard() {
		System.out.print("front = [");
		for (int i=0; i<front.length; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println("] ");
		
		// 카드 뒷면 출력
		System.out.print("back  = [");
		for (int i=0; i<back.length; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println("] ");
	}
	
	void choiceCard() {
		System.out.print("카드1 입력[1~10] : ");
		int card1 = scan.nextInt() - 1;
		System.out.print("카드2 입력[1~10] : ");
		int card2 = scan.nextInt() - 1;
		
		if (front[card1]==front[card2]) {
			back[card1] = front[card1];
			back[card2] = front[card2];
			correctCnt++;
		}
	}
	
	void run() {
		shuffle();
		while(true) {
			printCard();
			if (correctCnt==5) {
				System.out.println("게임종료");
				break;
			}
			choiceCard();
		}
	}
}
public class MethodEx15 {

	public static void main(String[] args) {
	
		MemoryGame mg = new MemoryGame();
		mg.run();

	}

}
