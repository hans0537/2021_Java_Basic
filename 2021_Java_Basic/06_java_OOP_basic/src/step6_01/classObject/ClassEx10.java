package step6_01.classObject;

import java.util.Arrays;
import java.util.Scanner;

class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}

public class ClassEx10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex10 e = new Ex10();
		
		e.name = "맘스터치";
		
		while(true) {
			System.out.println("\t"+e.name);
			System.out.println("------------------------");
			for (int i = 0; i < e.arPrice.length; i++) {
				System.out.println((i+1) + ". " + e.arMenu[i] + " : " + e.arPrice[i] + "원");
			}
			System.out.println("0. 계산하기");
			System.out.print("메뉴 선택: ");
			int sel = scan.nextInt();
			
			if(sel>=1 && sel<=4) 	e.arCount[sel-1]++;
			else if (sel==0) {
				for (int i = 0; i < e.arMenu.length; i++) {
					e.total += e.arCount[i]*e.arPrice[i];
				}
				System.out.println("합계금액: " + e.total);
				System.out.print("지불하실 금액 입력: ");
				int money = scan.nextInt();
				
				if (money>=e.total) {
					System.out.println("\t"+e.name);
					System.out.println("------------------------");
					System.out.println("ITEM\tQTY\tAMT");
					for (int i = 0; i < e.arMenu.length; i++) {
						System.out.println(e.arMenu[i]+"\t"+e.arCount[i]+"\t"+(e.arCount[i]*e.arPrice[i]));
					}
					System.out.println("------------------------");
					
					System.out.println("합계금액: " + e.total);
					System.out.println("받은금액: " + money);
					System.out.println("------------------------");
					System.out.println("잔     돈: " + (money - e.total));
				}else {
					System.out.println("지불하신 돈이 모자릅니다");
				}
				break;
			}
			
			
			
		}
	}

}
