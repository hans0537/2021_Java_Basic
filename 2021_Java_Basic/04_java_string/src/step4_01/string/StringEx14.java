package step4_01.string;

import java.util.Scanner;

public class StringEx14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();
		
		boolean result = false;
		
		if (name.length()==myName.length()) {
			result = true;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i)==myName.charAt(i)) {
					result = true;
				}else {
					result = false;
				}
			}
		}
		System.out.println(result);
		
		

	}

}
