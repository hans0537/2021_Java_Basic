package step4_01.string;

import java.util.Scanner;

public class StringEx11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		while(true) {
			
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			
			System.out.print(": ");
			int sel = scan.nextInt();
			
			if	    (sel == 1) {
				System.out.print("추가하실 카테고리 입력: ");
				String cate = scan.next();
				items[itemCount][0] = cate;
				itemCount++;
			}
			else if (sel == 2) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println("["+i+"]" + items[i][0]);
				}
				System.out.print("카테고리 선택: ");
				int choice = scan.nextInt();
				
				System.out.print("추가할 아이템 입력: ");
				String item = scan.next();
				
				items[choice][1] += item + "/";
				
				
			}
			else if (sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println(items[i][0] + ":" + items[i][1]);
				}
			}
			
		}

	}

}
