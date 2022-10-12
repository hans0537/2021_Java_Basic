package step3_01.arrayAdvance;

public class ArrayEx35 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		// 문제 1) 전체 합 출력
		// 정답 1) 450
		int total = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				total += arr[i][j];
			}
		}
		System.out.println(total);

		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		total = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j] % 4 == 0) {
					total+=arr[i][j];
				}
			}
		}
		System.out.println(total);
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		int cnt = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		


	}

}