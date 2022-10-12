package step2_01.array;

import java.util.Scanner;

public class ArrayEx20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;

		while(true) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.print("[2]삭제");
			int sel = scan.nextInt();
			
			if (sel==2) {
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				int idx = -1;
				
				for (int i = 0; i < cnt; i++) {
					if (arr[i]==data) {
						idx = i;
					}
				}
				if (idx==-1) {
					System.out.println("입력하신 값은 존재하지 않습니다.");
				}
				else {
					for (int i = idx; i < cnt - 1; i++) {
						arr[i]=arr[i+1];
					}
					cnt--;
				}
				
				
			}
		}
	}

}
