package step4_01.string;
// 문자열 관련 형변환

public class StringEx04 {

	public static void main(String[] args) {
	
		//문자 -> 숫자
		char ch = 'a';
		System.out.println((int)ch);
		ch = 'A';
		System.out.println((int)ch);
		System.out.println();
		
		//숫자 -> 문자
		int n = 100;
		System.out.println((char)n);
		n = 77;
		System.out.println((char)n);
		
		//1. 문자열 -> 숫자 형 변환
		int num = Integer.parseInt("10");
		
		//2. 숫자 -> 문자열 형 변환
		num = 777;
		
		//방법1
		String strNum = num + "";
		//방법2
		strNum = Integer.toString(num);
		//방법3
		strNum = String.valueOf(num);
	}

}
