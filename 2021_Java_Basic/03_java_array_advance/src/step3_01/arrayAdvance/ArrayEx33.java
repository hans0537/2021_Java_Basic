package step3_01.arrayAdvance;

import java.util.Arrays;

public class ArrayEx33 {
	public static void main(String[] args) {
		int[] arr = {87, 100, 24, 11, 79};
		
		int[] temp = arr;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		System.out.println();
		
		arr[0] = 1;
		temp[1] = 2;
		arr[2] = 3;
		temp[3] = 4;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		System.out.println();
	}
}
