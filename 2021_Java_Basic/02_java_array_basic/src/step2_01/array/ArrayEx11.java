package step2_01.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx11 {

	public static void main(String[] args) {
		Random ran  = new Random(); 
		
		boolean[] check = new boolean[5];
		int[] arr   = new int[5];
		int i = 0;
		int random = 0;
		
		while(i<5) {
			random = ran.nextInt(5);
			
			if (check[random]==false) {
				arr[i]=random;
				check[random]=true;
				i++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
