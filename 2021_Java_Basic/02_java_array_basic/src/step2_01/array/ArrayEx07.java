package step2_01.array;

public class ArrayEx07 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		int idx = 0;
		int max = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				idx = i;
			}
		}
		System.out.println(hakbuns[idx]+"("+max+")");

		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
	}

}
