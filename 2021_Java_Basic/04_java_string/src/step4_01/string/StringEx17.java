package step4_01.string;

import java.util.Scanner;

public class StringEx17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		char[] arr = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		boolean check = false;
		int idx = 0;
		
		for (int i = 0; i < arr.length - word.length() + 1; i++) {
			int cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if (arr[i+j] == word.charAt(j)) {
					cnt++;
				}
			}
			if (cnt==word.length()) {
				idx = i;
				check = true;
			}
		}
		
		if(check==false) {
			System.out.println("해당 단어 없음");
		}else {
			System.out.print("바꿀 단어 입력: ");
			String chWord = scan.next();
			
			int fidx = idx;
			int lidx = idx + word.length();
			
			char[] temp = arr;
			String front = "";
			for (int i = 0; i < fidx; i++) {
				front += temp[i];
			}
			
			String back = "";
			for (int i = lidx; i < temp.length; i++) {
				back += temp[i];
			}
			
			String result = front + chWord + back;
			System.out.println(result);
		}
		
	}

}
