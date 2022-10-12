package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileEx08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",   "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		
		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		String fileName = "jang.txt";
		
		int count = 0;
		int log = -1;
		
		while (true) {
			System.out.println("-----------");
			for (int i=0; i<3; i++) {
				System.out.print(ids[i] + " : " + pws[i] + "(");
				for (int j=0; j<count; j++) {
					if (jang[j][0] == i) {
						if 		(jang[j][1] == 1) System.out.print("사과");
						else if (jang[j][1] == 2) System.out.print("바나나");	
						else if(jang[j][1] == 3) System.out.print("딸기");
						System.out.print("/");
					}
				}
				System.out.println(")");
			}
			System.out.println("----------------------------");
			if (log!=-1) {
				System.out.println("[상태] : " + ids[log] + "님 로그인");
			}else {
				System.out.println("[상태] : 로그아웃");
			}
			System.out.println("----------------------------");
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				if (log!=-1) {
					System.out.println("이미" + ids[log] + "님 로그인중....");
				}else {
					System.out.print("ID입력: ");
					String id = scan.next();
					System.out.print("PW입력: ");
					String pw = scan.next();
					
					int check = -1;
					for (int i = 0; i < ids.length; i++) {
						if (id.equals(ids[i]) && pw.equals(pws[i])) {
							check = i;
						}
					}
					
					if (check==-1) {
						System.out.println("아이디와 비밀번호를 다시 입력하세요");
					}else {
						System.out.println("로그인 성공");
						log = check;
					}
				}
			}
			else if (sel == 2) {
				if (log==-1) {
					System.out.println("로그인후 사용가능");
				}else {
					log=-1;
					System.out.println("로그아웃 성공");
				}
			}
			else if (sel == 3) {
				if (log==-1) {
					System.out.println("로그인후 사용가능");
				}else {
						for (int i = 0; i < items.length; i++) {
							System.out.println("["+(i + 1)+"] " + items[i]);
						}
						System.out.println("상품선택 : ");
						int choice = scan.nextInt();
						jang[count][0] = log;
						jang[count][1] = choice;
						count++;
						System.out.println("장바구니에 담겼습니다.");		
				}
			}
			else if (sel == 4) {
				if (log==-1) {
					System.out.println("로그인후 사용가능");
				}else {
					System.out.println("[" + ids[log] + "님의 장바구니]");
					int j = 0;
					for (int i = 0; i < count; i++) {
						if (jang[i][0]==log) {
							System.out.print("[" + (j+1) + "] ");
							if (jang[i][1]==1) System.out.println("사과");
							else if (jang[i][1]==2) System.out.println("바나나");
							else if (jang[i][1]==3) System.out.println("딸기");
							j++;
						}
					}
				}
			}
			else if (sel == 5) {
				String data = "";
				for (int i = 0; i < count; i++) {
					data += jang[i][0] + "/" + jang[i][1] + "\n";
				}
				data = data.substring(0, data.length()-1);
				
				FileWriter fw = null;
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("저장 완료");
			}
			else if (sel == 6) {
				File file = new File(fileName);
				
				if (file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						count = 0;
						
						while(true) {
							String line = br.readLine();
							if (line==null) {
								break;
							}
							String[] temp = line.split("/");
							jang[count][0] = Integer.parseInt(temp[0]);
							jang[count][1] = Integer.parseInt(temp[1]);
							count++;	
						}
						fr.close();
						br.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}

	}

}
