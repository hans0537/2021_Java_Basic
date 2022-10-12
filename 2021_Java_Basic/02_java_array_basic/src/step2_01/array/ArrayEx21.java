package step2_01.array;

import java.util.Scanner;

public class ArrayEx21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("[3]삽입");
			
			System.out.print("메뉴 선택 :");
			int sel = scan.nextInt();
			
			if(sel == 3) {
				
				if (cnt==5) {
					System.out.println("더이상 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("삽입할 위치 입력 :");
				int idx = scan.nextInt();
				
				if (idx<0 || idx>cnt) {
					System.out.println("해당 위치 삽입 불가");
					continue;
				}
				
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				
				for (int i = cnt; i > idx; i--) {
					arr[i] = arr[i-1];
				}
				arr[idx]=data;
				cnt++;
					
				
				
				
			}
			
		}

	}

}
