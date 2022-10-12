package step6_01.classObject;

import java.util.Scanner;

class Ex05{

	String name = "";

	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class ClassEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "메가IT 고등학교";

		while (true) {

			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");

			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();

			if		(choice == 1) {
				int tot = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					tot+=mega.arScore[i];
				}
				double avg = tot / (double)mega.arScore.length;
				
				System.out.println("총점 : " + tot + "점");
				System.out.println("평균 : " + avg + "점");
			}
			else if (choice == 2) {
				int max = 0;
				int maxidx = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					if(max<mega.arScore[i]) {
						max = mega.arScore[i];
						maxidx = i;
					}
				}
				System.out.println("1등학생: " + mega.arHakbun[maxidx] + " : " + max + "점");
				
			}
			else if (choice == 3) {
				int min = mega.arScore[0];
				int minidx = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					if(min>mega.arScore[i]) {
						min = mega.arScore[i];
						minidx = i;
					}
				}
				System.out.println("꼴등학생: " + mega.arHakbun[minidx] + " : " + min + "점");
				
			}
			else if (choice == 4) {
				int check = -1;
				System.out.print("학번 입력: ");
				int data = scan.nextInt();
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if(mega.arHakbun[i]==data) check = i;
				}
				if (check==-1) {
					System.out.println("해당 학번은 존재하지 않습니다");
				}else {
					System.out.println(mega.arScore[check] + "점");
				}
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
