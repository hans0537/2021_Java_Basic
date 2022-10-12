package step4_01.string;

import java.util.Random;
import java.util.Scanner;

public class StringEx18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
			
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size];  // 힌트 체크를 통해서 확인할수있다.

		while (true) {
			
			int cnt = 0;
			
			for (int i = 0; i < size; i++) {
				if (check[i]==0) {
					cnt++;
					break;
				}
			}
			
			if (cnt==0) {
				break;
			}
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i =0; i< size; i++) {
				if (check[i]==1) {
					System.out.print(word.charAt(i));
				}else {
					System.out.print("*");
				}

			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			if (score==0) {
				System.out.println("탈락! 정답은" + word);
				break;
			}
			
			if (me.equals(word)) {
				System.out.println("정답!  점수 : " + score);
				break;
			}else {
				System.out.println("오답! 힌트");
				score -= 5;
				while (true) {
					int r = ran.nextInt(size);
					if (check[r]==0) {
						check[r] = 1;
						for (int i = 0; i < size; i++) {
							if (word.charAt(i)==word.charAt(r)) {
								check[i] = 1;
							}
						}
						break;
					}
				}
				
			}
		}

	}
}
