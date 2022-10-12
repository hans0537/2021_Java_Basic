package step8_01.atm_v1;

import java.util.Scanner;

public class UserManager {

	Scanner scan = new Scanner(System.in);
	User[] user = null;
	int userCnt = 0;
	
	void printUser() {
		System.out.println("[회원 현황]");
		for (int i = 0; i < userCnt; i++) {
			System.out.println(user[i].id);
		}
	}
	
	void addUser() {
		if (userCnt==0) {
			user = new User[userCnt+1];
		}
		else if(userCnt>0) {
			User[] temp = user;
			user = new User[userCnt+1];

			for (int i = 0; i < userCnt; i++) {
				user[i]=temp[i];
			}
			temp = null;
		}

		System.out.print("가입하실 아이디 입력하세요: ");
		String name = scan.next();
		boolean isDuple = false;

		for (int i = 0; i < userCnt; i++) {
			if (name.equals(user[i].id)) {
				isDuple = true;
			}
		}

		if (!isDuple) {
			user[userCnt] = new User();
			user[userCnt].id = name;
			System.out.println(name + "님 가입 완료되었습니다....");
			userCnt++;
		}
		else {
			System.out.println("이미 중복된 아이디 입니다.");
		}
	}

	int logUser() {
		int identifier = -1;
		System.out.println("아이디를 입력하세요: ");
		String id = scan.next();

		for (int i = 0; i < userCnt; i++) {
			if (id.equals(user[i].id)) {
				identifier = i;
			}
		}
		return identifier;	
	}
	
	void leave() {
		System.out.println("탈퇴할 아이디 입력하세요: ");
		String data = scan.next();
		int check  = -1;
		for (int i = 0; i < userCnt; i++) {
			if (data.equals(user[i].id)) {
				check = i;
			}
		}
		if (check==-1) {
			System.out.println("아이디를 다시 입력하세요");
			return;
		}
		System.out.println(user[check].id + "님 탈퇴 성공");
		User[] temp = user;
		user = new User[userCnt - 1];
		
		for (int i = 0; i < check; i++) {
			user[i] = temp[i];
		}
		for (int i = check; i <userCnt - 1; i++) {
			user[i] = temp[i+1];
		}
		
		userCnt--;
	}

}
