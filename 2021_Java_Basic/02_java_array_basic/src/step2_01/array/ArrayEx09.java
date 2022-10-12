package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X','X','X','X','X','X','X'};
		int money = 0;
		
		while(true) {
			System.out.println(Arrays.toString(seat));
			System.out.println("\n");
			System.out.println("1.좌석 예매");
			System.out.println("2.종료");
			System.out.print("메뉴 선택: ");
			int sel = scan.nextInt();
			
			if (sel==1) {
				
				System.out.print("좌석 선택(1~7): ");
				int idx = scan.nextInt()-1;
								
				if (seat[idx]=='X') {
					seat[idx]='O';
					money += 12000;
				}else {
					System.out.println("해당 자석은 이미 예매가 완료되었슴");
				}
					
				}
			else if(sel==2) {
				System.out.println("금액: " + money);
				break;
			}
			else {
				System.out.println("1~2중에 선택하세요");
			}
				
			}
			
		}
		
	}


