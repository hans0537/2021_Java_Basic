package step3_01.arrayAdvance;

import java.util.Arrays;

public class ArrayEx31 {

	public static void main(String[] args) {
		
		int[] scores = {10, 50, 30, 40, 80, 7};
		
		int max = 0;
		int maxidx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores));
			max = scores[i];
			maxidx = i;
			
			for (int j = i; j < scores.length; j++) {
				if (max < scores[j]) {
					max = scores[j];
					maxidx = j;
				}
			}
			int temp = scores[i];
			scores[i] = max;
			scores[maxidx] = temp;
			
		
		}
		
		System.out.println(Arrays.toString(scores));
	}

}
