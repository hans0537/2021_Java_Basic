package step3_01.arrayAdvance;

import java.util.Arrays;

public class ArrayEx39 {

	public static void main(String[] args) {
		int[] test1  = {1,2,3,2,1};
		int[] test2  = {1,3,4,4,2};
		int[] test3  = {1,1,1,2,1};
		int[] result = new int[5];
		int cnt = 0;

		for (int i = 0; i < test1.length; i++) {
			int check = -1;
			
			for (int j = 0; j < test1.length; j++) {
				if (i!=j && test1[i] == test1[j]) {
					result[cnt] = test1[i];
					check = 1;
				}
			}
			if(check==1) cnt++;
		}
		System.out.println(Arrays.toString(result));
		
		int cnt1 = 0;
		int[] result1 = new int[5];
		for (int i = 0; i < test2.length; i++) {
			int check = -1;
			for (int j = 0; j < test2.length; j++) {
				if (i!=j && test2[i] == test2[j]) {
					result1[cnt1] = test2[i];
					check = 1;
				}
			}
			if(check==1) cnt1++;
		}
		System.out.println(Arrays.toString(result1));
		
		int cnt2 = 0;
		int[] result2 = new int[5];
		for (int i = 0; i < test3.length; i++) {
			int check = -1;
			for (int j = 0; j < test3.length; j++) {
				if (i!=j && test3[i] == test3[j]) {
					result2[cnt2] = test3[i];
					check = 1;
				}
			}
			if(check==1) cnt2++;
		}
		System.out.println(Arrays.toString(result2));
	}
}
