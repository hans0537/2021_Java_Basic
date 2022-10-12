package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};

		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		int count = 0;

		String[] items = {"사과", "바나나", "딸기"};

		int identifier = -1;

		while(true) {
			System.out.println("-----------------------------");
			System.out.print("상태 : ");
			if ( identifier == -1 ) System.out.println("로그아웃");
			else System.out.println(ids[identifier] + "로그인");
			System.out.println("-----------------------------");

			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if		(sel == 1) {
				if (identifier!=-1) {
					System.out.println("이미 로그인중");
				}else {
					System.out.print("아이디 입력: ");
					String id = scan.next();
					System.out.print("비밀번호 입력: ");
					String pw = scan.next();

					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(id) && pw.equals(pws[i])) {
							System.out.println("로그인 성공");
							identifier = i;
						}
					}
					if (identifier == -1) System.out.println("ID와 PW를 확인해주세요.");
					else System.out.println(ids[identifier] +"님, 환영합니다.");
				}
			}
			else if (sel == 2) {
				identifier = -1;
				System.out.println("로그아웃 완료");
			}
			else if (sel == 3) {
				if (identifier==-1) {
					System.out.println("로그인 후 이용가능");
					continue;
				}
				while(true) {
					for (int i = 0; i < items.length; i++) {
						System.out.println("["+i+"]" + items[i]);
					}
					System.out.println("장바구니에 넣으실 아이템 입력 (3.뒤로가기)");
					int choice = scan.nextInt();
					
					if (choice==3) break;
					jang[count][0] = identifier;
					jang[count][1] = choice;
					
					count++;
				}	
			}
			else if (sel == 4) {
				int app = 0;
				int ban = 0;
				int ber = 0;
				
				for (int i = 0; i < count; i++) {
					if(jang[i][1]==0) app++;
					else if (jang[i][1]==1) ban++;
					else if (jang[i][1]==2) ber++;
				}
				System.out.println(items[0] + " : " + app + "개");
				System.out.println(items[1] + " : " + ban + "개");
				System.out.println(items[2] + " : " + ber + "개");
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}

}
