package step2_01.array;

import java.util.Scanner;

public class ArrayEx22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int cnt = 2;
		
		while (true) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("\n1추가");
			System.out.println("2삭제");
			System.out.println("3삽입");
			System.out.println("4종료\\n");
			System.out.print("입력 : ");
			int sel = scan.nextInt();
			
			if (sel==1) {
				if (cnt==5) {
					System.out.println("더이상 추가 불가");
					continue;
				}
				System.out.print("추가할 값 입력: ");
				int data = scan.nextInt();
				
				arr[cnt] = data;
				cnt++;
			}
			else if (sel==2) {
				if (cnt==0) {
					System.out.println("더이상 삭제 불가");
					continue;
				}
				
				System.out.print("삭제할 값 입력: ");
				int data = scan.nextInt();
				int idx = -1;
				
				for (int i = 0; i < cnt; i++) {
					if (arr[i]==data) {
						idx = i;
					}
				}
				
				if (idx==-1) {
					System.out.println("해당 값 없음");
					continue;
				}else {
					for (int i = idx; i < cnt-1; i++) {
						arr[i] = arr[i+1];
					}
				}
				cnt--;
			}
			else if (sel==3) {
				if (cnt==5) {
					System.out.println("더이상 삽입 불가");
					continue;
				}
				
				System.out.print("삽입 할 위치 입력: ");
				int idx = scan.nextInt();
				
				if (idx<0 || idx > cnt) {
					System.out.println("해당 위치 삽입 불가");
					continue;
				}
				
				System.out.print("삽입할 값 입력: ");
				int data = scan.nextInt();
				
				for (int i = cnt; i > idx; i--) {
					arr[i] = arr[i-1];
				}
				
				arr[idx]=data;
				cnt++;
			}
			else if (sel==4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
