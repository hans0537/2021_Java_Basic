package atm_v2_practice;

import java.util.Scanner;

public class ATM {

	Scanner scan = new Scanner(System.in);
	int identifier = -1;
	UserManager um = UserManager.getInstance();

	void play() {
		
		FileManager.getinstance().load();
		UserManager.getInstance().printAllUser();
		
		while(true) {
			System.out.println("[ATM]");
			System.out.println("[1.회원가입]");
			System.out.println("[2.로그인]");
			System.out.println("[0.종료]");
			System.out.print("[메뉴 선택]: ");
			int sel = scan.nextInt();

			if     (sel==1) join();
			else if(sel==2) login();
			else if(sel==0) break;

		}
	}
	void join() {
		um.joinUser();
	}

	void login() {

		identifier = um.logUser();
		if (identifier == -1) {
			System.out.println("아이디와 패스워드를 확인해주세요");
		}else {
			System.out.println(um.userList[identifier].id + "님 환영합니다.");
			loginMenu();
		}
	}

	void loginMenu() {
		while (true) {

			System.out.println("[" + um.userList[identifier].id + "님, 환영합니다.]");
			System.out.println("[1.계좌생성]\n[2.계좌삭제]\n[3.조    회]\n[4.회원탈퇴]\n[5.입    금]\n[0.로그아웃]");
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();

			if (selectMenu == 1) {
				AccountManager.getInstace().createAcc(identifier);
				FileManager.getinstance().save();
			}
			else if (selectMenu == 2) {
				AccountManager.getInstace().deletAcc(identifier);
				FileManager.getinstance().save();
			}
			else if (selectMenu == 3) {
				AccountManager.getInstace().showAcc(identifier);
			}
			else if (selectMenu == 4) {
				identifier = um.deletMember(identifier);
				break;
			}
			else if (selectMenu == 5) {
				
			}
			else if (selectMenu == 0) {
				identifier = -1;
				System.out.println("로그아웃이 되었습니다");
				break;
			}

		}
	}
}
