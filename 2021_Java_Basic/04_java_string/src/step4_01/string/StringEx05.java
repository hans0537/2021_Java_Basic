package step4_01.string;

public class StringEx05 {
	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 32세
		String jage = jumin.substring(0, 2);
		int age = 2020 - (1900 + Integer.parseInt(jage)) + 1;
		System.out.println(age + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		jage = jumin.substring(7, 8);
		if (jage.equals("2")) {
			System.out.println("여성");
		}else if (jage.equals("1")) {
			System.out.println("남성");
		}
		
		char key = jumin.charAt(7);
		if (key=='1'||key=='3') {
			System.out.println("남성");
		}else if (key=='2'||key=='4') {
			System.out.println("여성");
		}
	}
}
