package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int elementCnt = 0;
		
		while(true) {
			System.out.println(Arrays.toString(scores));
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if (elementCnt == 0) {
					scores = new int[elementCnt+1];
				}else if(elementCnt>0) {
					int[] temp = scores;
					scores = new int[elementCnt+1];
					
					for (int i = 0; i < elementCnt; i++) {
						scores[i]=temp[i];
					}
					temp = null;
				}
				System.out.print("추가할 값 입력: ");
				int data = scan.nextInt();
				
				scores[elementCnt] = data;
				elementCnt++;
				
			}
			else if (sel == 2) {
				System.out.print("삭제할 값(인덱스) 입력: ");
				int idx = scan.nextInt();
				
				if (idx<0 || idx>=elementCnt) {
					System.out.println("해당 위치는 삭제 불가능");
					continue;
				}
				
				if (elementCnt==1) {
					scores = null;
				}else if (elementCnt>1) {
					int[] temp = scores;
					scores = new int[elementCnt-1];
					
					for (int i = 0; i < idx; i++) {
						scores[i]=temp[i];
					}
					for (int i = idx; i < elementCnt-1; i++) {
						scores[i]=temp[i+1];
					}
					temp = null;
				}
				elementCnt--;
			}
			else if (sel == 3) {
				System.out.println("삭제할 값 입력: ");
				int data = scan.nextInt();
				int idx = -1;
				
				for (int i = 0; i < elementCnt; i++) {
					if (scores[i]==data) {
						idx = i;
					}
				}
				
				if (idx==-1) {
					System.out.println("해당 값 없음");
					continue;
				}
				
				if (elementCnt==1) {
					scores = null;
				}else if(elementCnt>1) {
					int[] temp = scores;
					scores = new int[elementCnt-1];
					
					for (int i = 0; i < idx; i++) {
						scores[i]=temp[i];
					}
					for (int i = idx; i < elementCnt-1; i++) {
						scores[i]=temp[i+1];
					}
					temp = null;
				}
				elementCnt--;
				}
			
			else if (sel == 4) {
				System.out.print("삽입할 인덱스 입력: ");
				int idx = scan.nextInt();
				
				if (idx<0 || idx>elementCnt) {
					System.out.println("해당위치 삽입 불가");
					continue;
				}
				
				System.out.print("삽입할 값 입력: ");
				int data = scan.nextInt();
				
				if (elementCnt==0) {
					scores = new int[elementCnt+1];
				}else if (elementCnt>0) {
					int[] temp = scores;
					scores = new int[elementCnt+1];
					
					int j = 0;
					for (int i = 0; i < elementCnt+1; i++) {
						if (i!=idx) {
							scores[i]=temp[j];
							j++;
						}
					}
					temp = null;
				}
				scores[idx]=data;
				elementCnt++;
			}
			else if (sel == 0) {
				break;
			}
		}


	}

}
