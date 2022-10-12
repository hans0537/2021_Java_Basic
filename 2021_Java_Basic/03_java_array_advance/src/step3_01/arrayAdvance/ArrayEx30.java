package step3_01.arrayAdvance;

import java.util.Scanner;

public class ArrayEx30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arAcc = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int usrCnt = 0;
		int identifier = -1;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			System.out.println("[회원 수 : " + usrCnt + "명]");
			for (int i=0; i<usrCnt; i++) {
				System.out.println(arAcc[i] + ":" + arPw[i] + "(" + arMoney[i] + "원)");
			}
			System.out.println("-----------------");
			System.out.print("[접속자] : ");
			if (identifier == -1) {
				System.out.println("없음");
			}
			else {
				System.out.println(arAcc[identifier]);
			}
			System.out.println("-----------------");
			System.out.println(menu);
			
			System.out.print("메뉴 선택: ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (identifier!=-1) {
					System.out.println("이미 " + arAcc[identifier] + "님 로그인중....");
				}else {
					System.out.print("ID입력: ");
					int myId = scan.nextInt();
					int check = -1;
					for (int i = 0; i < arAcc.length; i++) {
						if (myId==arAcc[i]) {
							check = 1;
						}
					}
					if (check==1) {
						System.out.println("아이디가 중복");
					}else {
						System.out.print("비밀번호 입력: ");
						int myPw = scan.nextInt();
						arAcc[usrCnt] = myId;
						arPw[usrCnt] = myPw;
						arMoney[usrCnt] = 1000;
						usrCnt++;
					}
					
				}
			}
			else if(sel == 2) {
				if (identifier==-1) {
					System.out.println("로그인후 이용가능");
				}else {
					for (int i = identifier; i < usrCnt-1; i++) {
						arAcc[i] = arAcc[i+1];
						arPw[i] = arPw[i+1];
						arMoney[i] = arMoney[i+1];
					}
					usrCnt--;
					System.out.println("회원탈퇴 완료");
					identifier = -1;
				}
			}
			else if(sel == 3) {
				if (identifier==-1) {
					System.out.print("ID 입력: ");
					int myId = scan.nextInt();
					System.out.print("PW 입력: ");
					int myPw = scan.nextInt();
					
					int check = -1;
					for (int i = 0; i < usrCnt; i++) {
						if (arAcc[i]==myId && arPw[i]==myPw) {
							check = i;
						}
					}
					
					if (check == -1) {
						System.out.println("아이디와 비밀번호를 다시 입력해주세요");
					}else {
						identifier = check;
						System.out.println("[메세지]" + arAcc[identifier] + "님, 환영합니다.");
					}
				}else {
					System.out.println("이미 " + arAcc[identifier] + "님 로그인중....");
				}
			}
			else if(sel == 4) {
				if (identifier==-1) {
					System.out.println("이미 로그아웃 상태입니다"); 
				}else {
					System.out.println(arAcc[identifier] + "님 로그아웃 완료");
					identifier = -1;
				}
			}
			else if(sel == 5) {
				if (identifier==-1) {
					System.out.println("로그인 후 사용가능");
				}else {
					System.out.print("입금할 금액 입력: ");
					int money = scan.nextInt();
					
					arMoney[identifier]+=money;
					System.out.println("입금 완료");
				}
				
			}
			else if(sel == 6) {
				if (identifier==-1) {
					System.out.println("로그인 후 사용가능");
				}else {
					System.out.print("이체 할 계좌 입력: ");
					int acc = scan.nextInt();
					
					int check = -1;
					for (int i = 0; i < usrCnt; i++) {
						if (acc==arAcc[i]) {
							check = i;
						}
					}
					
					if (check==-1) {
						System.out.println("해당 계좌는 없음");
						continue;
					}
					
					System.out.print("이체할 금액 입력: ");
					int money = scan.nextInt();
						
					if (money<=arMoney[identifier]) {
						arMoney[identifier] -= money;
						arMoney[check] += money;
					}else {
						System.out.println("잔액 부족");
					}
					
				}
			}
			else if(sel == 7) {
				if (identifier==-1) {
					System.out.println("로그인후 이용가능");
				}else {
					System.out.println(arAcc[identifier]+ "님 잔액은 : "+arMoney[identifier]);
				}
			}
			else if(sel == 0) {
				break;
			}
		}
		
	}

}
