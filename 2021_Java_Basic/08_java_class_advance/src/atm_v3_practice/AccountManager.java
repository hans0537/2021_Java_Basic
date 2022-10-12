package atm_v3_practice;

import java.util.Random;
import java.util.Scanner;

public class AccountManager {

	private AccountManager() {}
	private static AccountManager instance = new AccountManager();
	public static AccountManager getInstance() {
		return instance;
	}
	
	UserManager userManager = UserManager.getInstance();
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	void createAccount() {
		User loginUser = userManager.userList[userManager.identifier];
		
		if(loginUser.accCnt == 3) {
			System.out.println("더이상 계좌를 생성할수 없습니다");
			return;
		}
		
		if(loginUser.accCnt == 0) {
			loginUser.accList = new Account[loginUser.accCnt + 1];
		}
		else if(loginUser.accCnt > 0) {
			Account[] temp = loginUser.accList;
			
			loginUser.accList = new Account[loginUser.accCnt + 1];
			for (int i = 0; i < loginUser.accCnt; i++) {
				loginUser.accList[i] = temp[i];
			}
			temp = null;
		}
		loginUser.accList[loginUser.accCnt] = new Account();
		
		String makeAccount = ran.nextInt(90000000)+10000001+"";
		loginUser.accList[loginUser.accCnt].number = makeAccount;
		loginUser.accList[loginUser.accCnt].money = 0;
		
		loginUser.accCnt++;
		System.out.println("계좌가 생성 되었습니다.");
		FileManager.getInstance().saveData();
	}
	
	int showAccList(String msg) {
		int loginAccIndex = -1;
		User loginUser = userManager.userList[userManager.identifier];
		
		if (loginUser.accCnt > 0) {
			for (int i = 0; i < loginUser.accCnt; i++) {
				System.out.println("[" + (i+1) + "] " + loginUser.accList[i].number);
			}
		System.out.print("[" + msg + "] 내 계좌를 메뉴에서 선택 하시오: " );
		loginAccIndex = scan.nextInt();
		loginAccIndex--;
		}
		return loginAccIndex;
	}
	
	void income() {
		int loginAccIndex = showAccList("입금");
		if (loginAccIndex==-1) {
			System.out.println("계좌를 먼저 생성하여 주십시오");
			return;
		}
		System.out.print("입금 하실 금액 입력: ");
		int money = scan.nextInt();
		
		userManager.userList[userManager.identifier].accList[loginAccIndex].money += money;
		System.out.println("입금이 완료 되었습니다.");
		
		FileManager.getInstance().saveData();
	}
	
	void outcome() {
		int loginAccIndex = showAccList("출금");
		if(loginAccIndex==-1) {
			System.out.println("계좌를 먼저 생성해 주세요");
			return;
		}
		System.out.print("출금 하실 금액 입력: ");
		int money = scan.nextInt();
		
		if (money>userManager.userList[userManager.identifier].accList[loginAccIndex].money) {
			System.out.println("잔액 부족");
			return;
		}
		userManager.userList[userManager.identifier].accList[loginAccIndex].money -= money;
		System.out.println("출금이 완료 되었습니다. ");
		FileManager.getInstance().saveData();
	}
	
	void transfer() {
		int loginAccIndex = showAccList("이체");
		if(loginAccIndex==-1) {
			System.out.println("계좌를 먼저 생성해 주세요");
			return;
		}
		
		System.out.print("이체할 계좌번호를 입력해주세요: ");
		String transAccount = scan.next();
		
		int transUserIdx = checkAcc(transAccount);
		if (transUserIdx==-1) {
			System.out.println("계좌번호를 확인 해주세요");
			return;
		}
		
		
		
	}
	
	int checkAcc(String transAccount) {
		int check = -1;
		for (int i = 0; i < userManager.userList.length; i++) {
			if (userManager.userList[i].accList!=null) {
				for (int j = 0; j < userManager.userList[i].accCnt; j++) {
					if (transAccount.equals(userManager.userList[i].accList[j].number)) {
						check = i;
					}
				}
			}
		}
		return check;
	}
}
