package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx28 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];	
		int i = 0;
		while(i<5) {
			int num = ran.nextInt(10)+1;
			
			int check = 1;
			int j = 0;
			while(j<i) {
				if (num==arr[j]) {
					check = -1;
				}
				j++;
			}
			
			if (check==1) {
				arr[i]=num;
				i++;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));

	}
}
