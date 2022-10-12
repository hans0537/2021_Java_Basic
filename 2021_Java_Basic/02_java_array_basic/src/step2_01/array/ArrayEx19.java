package step2_01.array;

import java.util.Scanner;

public class ArrayEx19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int cnt = 2;
		
		while(true) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.print("[1]추가");
			int sel = scan.nextInt();
			if (sel==1) {
				System.out.print("추가 할 값 입력 : ");
				int data = scan.nextInt();
				
				if (cnt==5) {
					System.out.println("더이상 추가 할 수 없습니다.");
					continue;
				}
				
				arr[cnt] = data;
				cnt++;
				
			}
		}
	}

}
