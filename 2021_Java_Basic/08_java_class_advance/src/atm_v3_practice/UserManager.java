package atm_v3_practice;

import java.util.Scanner;

public class UserManager {

	private UserManager() {}
	private static UserManager instance = new UserManager();
	public static UserManager getInstance() {
		return instance;
	}
	
	User[] userList;
	int userCnt;
	int identifier = -1;

	Scanner scan = new Scanner(System.in);
	
	void joinUser() {
		
		System.out.print("가입하실 아이디 입력: ");
		String id = scan.next();
		
		int checkId = checkId(id);
		
		if (checkId!=-1) {
			System.out.println("아이디가 중복 됩니다.");
			return;
		}
		
		System.out.print("비밀 번호를 입력하세요: ");
		String pw = scan.next();
		
		if (userCnt==0) {
			userList = new User[userCnt + 1];
			userList[userCnt] = new User(id,pw);
		}
		else if(userCnt>0) {
			User[] temp = userList;
			userList = new User[userCnt+1];
			for (int i = 0; i < userCnt; i++) {
				userList[i] = temp[i];
			}
			userList[userCnt] = new User(id,pw);
			temp = null;
		}
		userCnt++;		
		System.out.println("회원가입이 완료 되었습니다");
		
		FileManager.getInstance().saveData();
		
	}
	
	int checkId(String id) {
		
		int check = -1;
		for (int i = 0; i < userCnt; i++) {
			if (id.equals(userList[i].id)) {
				check = i;
			}
		}
		return check;
	}
	
	void loginUser() {
		
		System.out.print("아이디를 입력하세요: ");
		String id = scan.next();
		System.out.print("비밀번호를 입력하세요: ");
		String pw = scan.next();
		
		for (int i = 0; i < userCnt; i++) {
			if (id.equals(userList[i].id) && pw.equals(userList[i].pw)) {
				identifier = i;
			}
		}
		
		if (identifier==-1) {
			System.out.println("아이디와 비밀번호를 잘못 입력하였습니다.");
		}else {
			System.out.println(userList[identifier].id + "님 로그인 성공");
			afterloginMenu();
		}
	}
	
	void afterloginMenu() {
		
		while(true) {
			
			System.out.println(userList[identifier].id + "님 로그인중.....");
			System.out.println("[1]계좌생성 [2]입금하기 [3]출금하기 [4]이체하기 [5]계좌조회 "
					+ "[6]계좌삭제 [7]회원탈퇴 [0]뒤로가기");
			System.out.print("메뉴를 선택하세요 : ");
			int choice = scan.nextInt();
			
			if (choice == 1)  {
				AccountManager.getInstance().createAccount();
			}
			else if (choice == 2) {
				AccountManager.getInstance().income();
			}
			else if (choice == 3) {
				AccountManager.getInstance().outcome();
			}
			else if (choice == 4) {
				
			}
			else if (choice == 5) {
			}
			else if (choice == 6) {
			}
			else if (choice == 7) {
			}
			else if (choice == 0) {
			}
		}
	}
}
