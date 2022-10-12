package step8_01.atm_v1;

import java.util.Random;
import java.util.Scanner;

public class ATM {

	Scanner scan = new Scanner(System.in);
	UserManager usermanager = new UserManager();
	Random ran = new Random();

	int identifier = -1;

	void printMainMenu() {

		while(true) {
			usermanager.printUser();
			System.out.println("===ATM===");
			System.out.println("[1.로그인]");
			System.out.println("[2.로그아웃]");
			System.out.println("[3.회원가입]");
			System.out.println("[4.회원탈퇴]");
			System.out.println("[0.종료]");
			System.out.print("[메뉴선택]: ");
			int sel = scan.nextInt();

			if(sel==1) {login();}
			else if(sel==2) {logout();}
			else if(sel==3) {join();}
			else if(sel==4) {leave();}
			else if(sel==0) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	void join() {
		usermanager.addUser();
	}

	void login() {
		identifier = usermanager.logUser();

		if (identifier==-1) {
			System.out.println("아이디를 다시 입력하세요");
		}else {
			System.out.println(usermanager.user[identifier].id + "님 환영합니다.");
			printAccountMenu();
		}
	}

	void logout() {
		if (identifier==-1) {
			System.out.println("로그인후 사용가능");
		}else {
			identifier = -1;
			System.out.println("로그아웃 되었습니다.");
		}
	}

	void leave() {
		usermanager.leave();
	}

	void printAccountMenu() {

		while(true) {
			System.out.println("[1.계좌생성]");
			System.out.println("[2.계좌삭제]");
			System.out.println("[3.조회]");
			System.out.println("[0.로그아웃]");
			System.out.print("[메뉴선택]: ");

			int sel = scan.nextInt();
			String account = Integer.toString(ran.nextInt(90001)+10000);

			if(sel==1) {
				if (usermanager.user[identifier].accCount == 0) {
					usermanager.user[identifier].acc = new Account[1];

					usermanager.user[identifier].acc[0] = new Account();
					usermanager.user[identifier].acc[0].number = account;
				}else {
					Account[] temp = usermanager.user[identifier].acc;
					int tempCnt = usermanager.user[identifier].accCount;
					usermanager.user[identifier].acc = new Account[tempCnt + 1];
					for (int i = 0; i < tempCnt; i++) {
						usermanager.user[identifier].acc[i] = temp[i];
					}
					usermanager.user[identifier].acc[tempCnt] = new Account();
					usermanager.user[identifier].acc[tempCnt].number = account;
				}
				usermanager.user[identifier].accCount++;
			}
			else if(sel==2) {
				if (usermanager.user[identifier].accCount == 1) {
					usermanager.user[identifier].acc = null;
				}else {
					System.out.println("삭제할 계좌 입력하세요: ");
					String number = scan.next();
					int check = -1;
					int tempCnt = usermanager.user[identifier].accCount;
					for (int i = 0; i < tempCnt; i++) {
						if (number.equals(usermanager.user[identifier].acc[i].number)) {
							check = i;
						}
					}

					if (check==-1) {
						System.out.println("계좌번호를 확인하세요");
						return;
					}else {
						Account[] temp = usermanager.user[identifier].acc;
						usermanager.user[identifier].acc = new Account[tempCnt - 1];
						for (int i = 0; i < check; i++) {
							usermanager.user[identifier].acc[i] = temp[i];
						}
						for (int i = check; i < tempCnt-1; i++) {
							usermanager.user[identifier].acc[i] = temp[i+1];
						}
					}
				}
				usermanager.user[identifier].accCount--;
			}
			else if(sel==3) {
				if (usermanager.user[identifier].accCount == 0) {
					System.out.println("생성된 계좌가 없습니다");
				}else {
					usermanager.user[identifier].printAccount();
				}
			}
			else if(sel==0) {
				logout();
				break;
			}
		}
	}
}
