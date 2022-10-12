package atm_v3_practice;

import java.util.Scanner;

public class ATM {

	Scanner scan = new Scanner(System.in);
	
	void showMenu() {
		
		while(true) {
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]로 그 인");
			System.out.println("[0]종    료");
			System.out.print("메뉴 선택: ");
			int sel = scan.nextInt();
			
			if     (sel==1) join();
			else if(sel==2) login();
			else if(sel==0) break;
		}
	}
	
	void login() {
		UserManager.getInstance().loginUser();
	}
	
	void join() {
		UserManager.getInstance().joinUser();
	}
}
