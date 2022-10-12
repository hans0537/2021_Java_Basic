package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex09{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}

public class ClassEx09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex09 e = new Ex09();
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(e.front.length);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		while (true) {
			System.out.println(Arrays.toString(e.front));
			System.out.println(Arrays.toString(e.back));
			if (e.answerCnt==5) break;
			System.out.print("위치 선택");
			int idx1 = scan.nextInt();
			System.out.print("위치 선택");
			int idx2 = scan.nextInt();
			
			if (e.front[idx1]==e.front[idx2]) {
				e.back[idx1] = e.front[idx1];
				e.back[idx2] = e.front[idx2];
				e.answerCnt++;
			}
		}
	}

}
