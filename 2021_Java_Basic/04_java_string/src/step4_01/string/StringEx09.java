package step4_01.string;

import java.util.Random;
import java.util.Scanner;

public class StringEx09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		String[] words = {"java", "mysql", "jsp", "spring"};

		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(4);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;

		}
		int i = 0;
		while(i<4) {
			System.out.println("문제 : " + words[i]);
			System.out.print("입력 : ");
			String answer = scan.next();
			
			if (words[i].equals(answer)) {
				i++;
			}
		}
	}

}
