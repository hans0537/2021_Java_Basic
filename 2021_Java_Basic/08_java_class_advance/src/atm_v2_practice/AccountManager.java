package atm_v2_practice;

import java.util.Random;
import java.util.Scanner;

public class AccountManager {

	private AccountManager() {}
	private static AccountManager instance = new AccountManager();
	public static AccountManager getInstace() {
		return instance;
	}

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	UserManager um = UserManager.getInstance();

	void createAcc(int identifier) {

		int cnt = um.userList[identifier].accCnt;

		if (cnt==3) {
			System.out.println("계좌개설은 3개 까지만 할수 있습니다");
			return;
		}
		um.userList[identifier].acc[cnt] = new Account();

		String acc = "";
		while(true) {

			acc = Integer.toString(ran.nextInt(9000000)+1000001);
			
			boolean isCheck = false;
			for (int i = 0; i < um.userCnt; i++) {
				for (int j = 0; j < um.userList[identifier].accCnt; j++) {
					if (acc.equals(um.userList[identifier].acc[j].accNumber)) {
						isCheck = true;
					}
				}
			}
			if (!isCheck) {
				break;
			}
		}
		
		um.userList[identifier].acc[cnt].accNumber = acc;
		um.userList[identifier].accCnt++;
		System.out.println(acc + "계좌가 생성 되었습니다");
	}
	
	void deletAcc(int identifier) {
		int cnt = um.userList[identifier].accCnt;
		if (cnt == 0) {
			System.out.println("더이상 삭제할 계좌가 없습니다. ");
			return;
		}
		System.out.print("삭제할 계좌를 입력하세요: ");
		String acc = scan.next();
		
		int check = -1;
		for (int i = 0; i < um.userCnt; i++) {
			for (int j = 0; j < um.userList[identifier].accCnt; j++) {
				if (acc.equals(um.userList[identifier].acc[j].accNumber)) {
					check = j;
				}
			}
		}
		
		if (check==-1) {
			System.out.println("해당 계좌는 없는 계좌입니다.");
			return;
		}
		
		
		if (cnt==1) {
			um.userList[identifier].acc = null;
			um.userList[identifier].acc = new Account[UserManager.getInstance().ACC_MAX_CNT];
		}else {
			Account[] temp = um.userList[identifier].acc;
			um.userList[identifier].acc = new Account[cnt - 1];
			
			for (int i = 0; i < check; i++) {
				um.userList[identifier].acc[i] = temp[i];
			}
			for (int i = check; i < cnt-1; i++) {
				um.userList[identifier].acc[i] = temp[i+1]; 
			}
			temp = null;
		}
		
		um.userList[identifier].accCnt--;
		System.out.println(acc + "계좌가 삭제 되었습니다.");
	}
	
	void showAcc(int identifier) {
		System.out.println("현재 " + um.userList[identifier].id + "님의 계좌는 ");
		System.out.println("====================================");
		for (int i = 0; i < um.userList[identifier].accCnt; i++) {
			System.out.println(um.userList[identifier].acc[i].accNumber + " : " + um.userList[identifier].acc[i].money + "원");
		}
		System.out.println("====================================");
	}
}
