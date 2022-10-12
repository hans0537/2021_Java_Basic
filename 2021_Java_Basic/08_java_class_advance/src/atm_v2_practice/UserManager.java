package atm_v2_practice;

import java.util.Scanner;

public class UserManager {
	
	private UserManager() {}
	static private UserManager instance = new UserManager();
	static public UserManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	
	final int ACC_MAX_CNT = 3;
	User[] userList = null;
	int userCnt = 0;
	
	void printAllUser() {
		for (int i=0; i<userCnt; i++) {
			System.out.print((i+1) + ".ID(" + userList[i].id + ")\tPW(" + userList[i].pw + ")\t");
			if (userList[i].accCnt != 0) {
				for (int j=0; j<userList[i].accCnt; j++) {
					System.out.print("(" + userList[i].acc[j].accNumber + ":" + userList[i].acc[j].money + ")");
				}
			}
			System.out.println();
		}
	}
	void joinUser() {
		System.out.print("가입 하실 ID 입력: ");
		String id = scan.next();

		boolean isResult = false;
		for (int i = 0; i < userCnt; i++) {
			if (id.equals(userList[i].id)) {
				isResult = true;
			}
		}
		
		if (isResult) {
			System.out.println("ID 가 중복 됩니다.");
			return;
		}
		
		System.out.print("가입 하실 PW 입력: ");
		String pw = scan.next();
		
		if (userCnt==0) {
			userList = new User[userCnt + 1];
			userList[userCnt] = new User();
		}
		else {
			User[] temp = userList;
			userList = new User[userCnt+1];
			userList[userCnt] = new User();
			
			for (int i = 0; i < userCnt; i++) {
				userList[i] = temp[i];
			}
			temp = null;
		}
		userList[userCnt].id = id;
		userList[userCnt].pw = pw;
		userCnt++;
		System.out.println(id + "님 회원가입을 축하합니다.");
		
		FileManager.getinstance().save();
	}
	
	int logUser() {
		int identifier = -1;
		System.out.print("로그인 할 ID 입력: ");
		String id = scan.next();
		System.out.print("로그인 할 PW 입력: ");
		String pw = scan.next();
		
		for (int i = 0; i < userCnt; i++) {
			if (userList[i].id.equals(id) && userList[i].pw.equals(pw)) {
				identifier = i;
			}
		}
		return identifier;
	}
	
	int deletMember(int identifier) {
		User[] temp = userList;
		userList = new User[userCnt - 1];
		
		for (int i = 0; i < identifier; i++) {
			userList[i] = temp[i];
		}
		for (int i = identifier; i < userCnt - 1; i++) {
			userList[i] = temp[i+1];
		}
		
		userCnt--;
		temp = null;
		identifier = -1;
		System.out.println("탈퇴가 되었습니다");
		FileManager.getinstance().save();
		return identifier;
	}
}
