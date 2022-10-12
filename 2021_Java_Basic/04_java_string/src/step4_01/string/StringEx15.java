package step4_01.string;

import java.util.Scanner;

public class StringEx15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		int cntNum = 0;
		
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < num.length; j++) {
				if (text.charAt(i)==num[j]) {
					cntNum+=1;
				}
			}
		}
		
		if (cntNum==text.length()) System.out.println("숫자만 있다");
		else if (cntNum == 0) System.out.println("문자만 있다");
		else System.out.println("문자와 숫자가 섞여 있다");

	}

}
