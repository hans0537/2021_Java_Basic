package step4_01.string;

import java.util.Scanner;

public class StringEx10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		
		while(true) {
			
			System.out.println("제시어 : " + start);
			System.out.print("입력 : ");
			String me = scan.next();
			
			if (me.equals("quit")) {
				System.out.println("-종료-");
				break;
			}
			
			if (start.charAt(start.length()-1)!=me.charAt(0)) {
				System.out.println("다시 입력하세요");
				continue;
			}else {
				start = me;
			}
		}
	}
}
