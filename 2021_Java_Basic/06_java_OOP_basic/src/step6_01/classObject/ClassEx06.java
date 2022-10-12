package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;

class Ex06{
	int[] answer = {1,3,4,2,5};
	int[] hgd = new int[5];
	String[] ans = new String[5];

	int cnt = 0;
	int score = 0;
	
}
public class ClassEx06 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		Ex06 e = new Ex06();
		
		for (int i = 0; i < e.hgd.length; i++) {
			int r = ran.nextInt(5)+1;
			e.hgd[i] = r;
		}
		
		for (int i = 0; i < e.answer.length; i++) {
			if (e.answer[i]==e.hgd[i]) {
				e.cnt++;
				e.ans[i] = "O";
			}else {
				e.ans[i] = "X";
			}
		}
		e.score = e.cnt * 20;
		System.out.println(Arrays.toString(e.answer));
		System.out.println(Arrays.toString(e.hgd));
		System.out.println(Arrays.toString(e.ans));
		System.out.println("성적: " + e.score);
	}

}
