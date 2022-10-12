package step7_01.classArray;

import java.util.Scanner;

class User2{
	
	String id;
	int money;
	
}
public class ClassArrayEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int MAX_NUM = 100;
		User2[] user2 = new User2[MAX_NUM];
		
		for (int i = 0; i < user2.length; i++) {
			user2[i] = new User2();
		}
		
		int usrCnt = 0;
		
		while (true) {

			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			int sel = scan.nextInt();
			
			if(sel==1) {
				System.out.print("이름을 입력하세요: ");
				user2[usrCnt].id = scan.next();
				System.out.print("금액 입력: ");
				user2[usrCnt].money = scan.nextInt();
				usrCnt++;
			}
			else if(sel==2) {
				System.out.print("인덱스 입력: ");
				int idx = scan.nextInt();
				
				for (int i = idx; i < usrCnt-1; i++) {
					user2[i] = user2[i+1];
				}
				usrCnt--;
			}
			else if(sel==3) {
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(user2[i].id + " : " + user2[i].money);
				}
			}
			else if(sel==4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
