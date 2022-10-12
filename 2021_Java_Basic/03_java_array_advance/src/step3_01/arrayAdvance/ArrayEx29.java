package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] com = {1,7,3};
		int[] me  = new int[3];

		int check = 0;

		System.out.println("정답: " + Arrays.toString(com));
		while(true) {
			int strike = 0;
			int ball = 0;

			for (int i=0; i<3; i++) {

				System.out.print("[" + (i+1)+"] 1~9 입력 : ");
				int num = scan.nextInt();

				check = 1;
				for (int j=0; j<i; j++) {
					if (num == me[j]) 
						check = -1;
				}

				if (check == -1) 	i--;
				else me[i] = num;
			}
			
			System.out.print(Arrays.toString(me)+"\t");
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i]==me[j]) {
						if (i==j) strike++;
						else if (i!=j) ball++;
					}
				}
			}
			
			System.out.println(strike + "S, " + ball + "B" );
			if (strike==3) {
				System.out.println("3strike 정답!");
				break;
			}

		}
	}

}
