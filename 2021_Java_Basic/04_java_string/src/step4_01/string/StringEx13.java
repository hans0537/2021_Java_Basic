package step4_01.string;

public class StringEx13 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};

		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" ");
		}
	}

}
