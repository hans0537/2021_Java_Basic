package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileEx07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = 5;
		int accsCnt = 0;
		int identifier = -1;

		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];

		String fileName = "atm.txt";

		while(true) {
			System.out.println("[회원수]: " + accsCnt + "명");
			System.out.println("--------------------------");
			for (int i = 0; i < accsCnt; i++) {
				System.out.println(accs[i]+" : "+pws[i]+" : "+moneys[i]+"원");
			}
			System.out.println("--------------------------");
			if (identifier==-1) {
				System.out.println("[상태] : 로그아웃");
			}else {
				System.out.println("[상태] : " + accs[identifier] + "님 로그인중....");
			}
			System.out.println("---------------------------");

			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if		(sel == 1) {
				if (identifier==-1) {
					System.out.print("ID입력: ");
					String myAcc = scan.next();

					int check = 1;
					for (int i = 0; i < accsCnt; i++) {
						if (accs[i].equals(myAcc)) {
							check = -1;
						}
					}
					if (check == 1) {
						if (accsCnt==5) {
							System.out.println("[더이상 가입 불가]");
							continue;
						}
						System.out.print("PW입력: ");
						String myPw = scan.next();

						accs[accsCnt] = myAcc;
						pws[accsCnt] = myPw;
						moneys[accsCnt] = 1000;
						accsCnt++;
						System.out.println("[회원가입 성공]");
					}
					else {
						System.out.println("[계좌가 중복 됩니다]");
					}

				}else {
					System.out.println("로그아웃후 사용가능");
				}
			}
			else if (sel == 2) {
				if (identifier!=-1) {
					for (int i = identifier; i < accsCnt-1; i++) {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
						moneys[i] = moneys[i+1];
					}
					identifier = -1;
					accsCnt--;
					System.out.println("[탈퇴가 성공적으로 되었습니다]");
				}else {
					System.out.println("[로그인후 사용가능]");
				}
			}
			else if (sel == 3) {
				if (identifier==-1) {
					System.out.print("ID입력: ");
					String id = scan.next();

					System.out.print("PW입력: ");
					String pw = scan.next();

					int check = -1;
					for (int i = 0; i < accsCnt; i++) {
						if (id.equals(accs[i]) && pw.equals(pws[i])) {
							check = i;
						}
					}

					if (check==-1) {
						System.out.println("[계좌번호와 비밀번호를 다시 입력해주세요.]");
					}

					identifier = check;
				}else {
					System.out.println("이미" + accs[identifier] + "님 로그인중.....");
				}
			}
			else if (sel == 4) {
				if (identifier==-1) {
					System.out.println("[로그인후 사용가능]");
				}else {
					identifier = -1;
					System.out.println("[로그아웃 되었습니다.]");
				}
			}
			else if (sel == 5) {
				if (identifier==-1) {
					System.out.println("[로그인후 사용가능]");
				}else {
					System.out.print("입금하실 금액 입력: ");
					int money  = scan.nextInt();

					moneys[identifier] += money;
					System.out.println("[입금이 완료 되었습니다]");
				}
			}
			else if (sel == 6) {
				if (identifier==-1) {
					System.out.println("[로그인후 사용가능]");
				}else {
					System.out.print("출금하실 금액 입력: ");
					int money  = scan.nextInt();

					if (money>moneys[identifier]) {
						System.out.println("[잔액 부족]");
					}else {
						moneys[identifier] -= money;
						System.out.println("[출금이 완료 되었습니다]");
					}
				}
			}
			else if (sel == 7) {
				if (identifier==-1) {
					System.out.println("[로그인후 사용가능]");
				}else {
					System.out.println("이체할 계좌번호 입력: ");
					String acc = scan.next();
					
					int check = -1;
					for (int i = 0; i < accsCnt; i++) {
						if (acc.equals(accs[i])) {
							check = i;
						}
					}
					if (check==-1) {
						System.out.println("[계좌번호 다시 입력하세요]");
					}else {
					
					System.out.println("이체할 금액 입력: ");
					int money = scan.nextInt();
					
					if (money>moneys[identifier]) {
						System.out.println("[잔액 부족]");
					}else {
						moneys[identifier] -= money;
						moneys[check] += money;
						System.out.println("[이체가 완료 되었습니다]");
					}
					
				}
				}
			}
			else if (sel == 8) {
				if (identifier==-1) {
					System.out.println("로그인후 사용가능");
				}else {
					System.out.println(accs[identifier] + "님 잔액은: " + moneys[identifier] + "원입니다");
				}
			}
			else if (sel == 9) {
				if (accsCnt==0) {
					System.out.println("저장할 데이터 없음");
					continue;
				}
				
				String data = "";
				for (int i = 0; i < accsCnt; i++) {
					data += accs[i] + "/" + pws[i] + "/" + moneys[i] + "\n";
				}
				data = data.substring(0,data.length()-1);
				
				FileWriter fw = null;
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
					
				} catch (Exception e) {
					
				}
			}
			else if (sel == 10) {
				
				File file = new File(fileName);
				
				if (file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						String data = "";
						while(true) {
							String line = br.readLine();
							if (line==null) {
								break;
							}
							data += line;
							data += "\n";
						}
						data = data.substring(0 , data.length()-1);
						String[] temp = data.split("\n");
						accsCnt = temp.length;
						
						for (int i = 0; i < accsCnt; i++) {
							String[] info = temp[i].split("/");
							accs[i] = info[0];
							pws[i] = info[1];
							moneys[i] = Integer.parseInt(info[2]);
						}
					
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				
			}
			else if (sel == 0) {
				break;
			}

		}

	}

}
