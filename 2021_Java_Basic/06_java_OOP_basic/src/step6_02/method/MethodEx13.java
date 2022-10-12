package step6_02.method;

import java.util.Scanner;

class Theater{
	
	Scanner scan = new Scanner(System.in);
	int[] seat = new int[10];
	int bookCnt = 0;
	int money = 0;
	
	void showMenu() {
		System.out.println("====메가박스====");
		System.out.println("1. 예매하기");
		System.out.println("2. 종료하기");
	}
	
	void showSeat() {
		for (int i = 0; i < seat.length; i++) {
			if (seat[i]==0) {
				System.out.print("[X]");
			}else {
				System.out.print("[O]");
			}
		}
		System.out.println();
	}
	
	void choiceSeat() {
		showSeat();
		
		System.out.println("좌석번호 선택하세요[1~10]: ");
		int idx = scan.nextInt() - 1;
		
		if (seat[idx]==0) {
			seat[idx]=1;
			bookCnt++;
			System.out.println("예매 완료");
		}else {
			System.out.println("이미 예매가 끝난 좌석");
		}
	}
	
	void showSales() {
		money = bookCnt * 12000;
		System.out.println("총 매출 금액= " + money + "원");
		
	}
	
	void run() {
		while(true) {
			showMenu();
			
			System.out.println("메뉴선택: ");
			int sel = scan.nextInt();
			if (sel==1) {
				choiceSeat();
			}else if(sel==2) {
				showSales();
				break;
			}
		}
	}
}
public class MethodEx13 {

	public static void main(String[] args) {
		Theater mega = new Theater();
		mega.run();
	}

}
