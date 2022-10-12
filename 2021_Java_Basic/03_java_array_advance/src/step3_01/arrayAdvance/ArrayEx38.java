package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		int[] money = new int[3];
		
		for (int i = 0; i < pay.length; i++) {
			int total = 0;
			for (int j = 0; j < pay[i].length; j++) {
				total += pay[i][j];
			}
			money[i] = total;
		}
		
		System.out.println(Arrays.toString(money));
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.print("호수 입력: ");
		int ho = scan.nextInt();
		int hi = 0;
		int hj = 0;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (apt[i][j]==ho) {
					hi = i;
					hj = j;
				}
			}
		}
		
		System.out.println("관리비: " + pay[hi][hj]);
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int max = 0;
		int maxi = 0;
		int maxj = 0;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (max<pay[i][j]) {
					max = pay[i][j];
					maxi = i;
					maxj = j;
				}
			}
		}
		
		int min = pay[0][0];
		int mini = 0;
		int minj = 0;
				
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (min>pay[i][j]) {
					min = pay[i][j];
					mini = i;
					minj = j;
				}
			}
		}
		
		System.out.println("관리비 적게 나온집("+ apt[mini][minj]+")");
		System.out.println("관리비 많이 나온집("+ apt[maxi][maxj]+")");
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		System.out.print("교체할 호1: ");
		int ho1 = scan.nextInt();
		System.out.print("교체할 호2: ");
		int ho2 = scan.nextInt();
		
		int ho1idx1 = 0;
		int ho1idx2 = 0;
		int ho2idx1 = 0;
		int ho2idx2 = 0;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (ho1==apt[i][j]) {
					ho1idx1 = i;
					ho1idx2 = j;
				}
			}
		}
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (ho2==apt[i][j]) {
					ho2idx1 = i;
					ho2idx2 = j;
				}
			}
		}
		
		int temp = pay[ho1idx1][ho1idx2];
		pay[ho1idx1][ho1idx2] = pay[ho2idx1][ho2idx2];
		pay[ho2idx1][ho2idx2] = temp;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j]+" ");
			}
			System.out.println();
		}
	}

}
