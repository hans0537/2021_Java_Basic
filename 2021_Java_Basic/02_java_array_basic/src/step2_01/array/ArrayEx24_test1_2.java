package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_test1_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		System.out.println(Arrays.toString(d));
		System.out.print("값 입력: ");
		int data = scan.nextInt();
		int idx = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i]==data) {
				idx = i;
			}
		}
		for (int i = 0; i < idx; i++) {
			e[i]=d[i];
		}
		for (int i = idx; i < e.length - 1; i++) {
			e[i]=d[i+1];
		}
		System.out.println(Arrays.toString(e));

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		System.out.println(Arrays.toString(f));
		System.out.print("번호 입력: ");
		data = scan.nextInt();
		int idx1 = 0;
		int idx2 = 0;
		
		for (int i = 0; i < f.length; i++) {
			if (f[i]==data) {
				idx1 = i;
				idx2 = i+1;
			}
		}
		int p = 0;
		for (int i = 0; i < f.length-2; i++) {
			if (i!=idx1 || i!=idx2) {
				g[p]=f[i+2];
				p++;
			}
		}
		
		System.out.println(Arrays.toString(g));
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		System.out.println(Arrays.toString(h));
		System.out.print("값 입력: ");
		data = scan.nextInt();
		int[] temp = new int[5];
		for (int i = 0; i < h.length - 1; i++) {
			temp[i] = h[i+1];
		}
		temp[4] = data;

		System.out.println(Arrays.toString(temp));

		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		System.out.println(Arrays.toString(i));
		System.out.print("값 입력: ");
		data = scan.nextInt();
		int[] temp1 = new int[5];
		for (int j = 0; j < h.length - 1; j++) {
			temp1[j+1] = h[j];
		}
		temp1[0] = data;

		System.out.println(Arrays.toString(temp1));

		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		int x = 0;
		for (int k2 = k.length-1 ; k2 >= 0 ; k2--) {
			k[x] = j[k2];
			x++;
		}
		System.out.println(Arrays.toString(k));
	}

}
