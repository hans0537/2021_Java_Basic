package step3_01.arrayAdvance;

public class ArrayEx32 {

	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};

		int max = 0;
		int maxidx = 0;

		for (int i = 0; i < scores.length; i++) {
			max = scores[i];
			maxidx = i;

			for (int j = i; j < scores.length; j++) {
				if (max < scores[j]) {
					max = scores[j];
					maxidx = j;
				}
			}
			String temp = names[i];
			names[i] = names[maxidx];
			names[maxidx] = temp;

			int tmp = scores[i];
			scores[i] = max;
			scores[maxidx] = tmp;

		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(names[i]+" : "+scores[i]);
		}
	}

}
