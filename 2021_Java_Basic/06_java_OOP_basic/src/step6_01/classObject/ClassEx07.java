package step6_01.classObject;

import java.util.Arrays;
import java.util.Scanner;

class Ex07{
	int[] seat = new int[7];
	int money = 0;
	int cnt = 0;
}
public class ClassEx07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex07 e = new Ex07();
		
		while (true) {
			System.out.println(Arrays.toString(e.seat));
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if		(sel == 1) {
				
				System.out.println("좌석 선택: ");
				int idx = scan.nextInt();
				if (e.seat[idx]==0) {
					e.seat[idx]=1;
					e.cnt++;
				}else {
					System.out.println("이미 예매가 완료된 자리입니다.");
				}
			}
			else if (sel == 2) {
				e.money = e.cnt * 12000;
				System.out.println("매출액: " + e.money + "원");
				break;
			}
		}


	}

}
