package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx16 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		char[] arr = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		boolean check = false;
		
		for (int i = 0; i < arr.length - word.length() + 1; i++) {
			int cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if (arr[i+j] == word.charAt(j)) {
					cnt++;
				}
			}
			if (cnt==word.length()) {
				check = true;
			}
		}
		
		if(check) System.out.println("일치");
		else System.out.println("불일치");
		
		
	}
}
