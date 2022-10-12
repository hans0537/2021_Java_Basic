package step4_01.string;

public class StringEx03 {
	public static void main(String[] args) {

		String str = "megait";
		System.out.println(str);

		//1. 문자열 길이: length() [배열과 차이 있음 배열은 arr.length 소괄호 없음]
		int size = str.length();
		System.out.println(size);

		//2. 문자 한개 추출(인덱싱) : charAt(index)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));


		//3. 문자열 추출 (슬라이싱) : substring()
		// substring(index1, index2) : index1부터 index2 미만까지 (마지막은 포함x)
		String rs = str.substring(4, 6);
		System.out.println(rs);

		// substring(index) : index부터 끝까지
		rs = str.substring(4);
		System.out.println(rs);

		//4. 구분자로 잘라내기 : split("구분자")
		str = "java,jsp,spring";
		String[] rsArr = str.split(",");
		System.out.println(rsArr.length);
		System.out.println(rsArr[0]);
		System.out.println(rsArr[1]);
		System.out.println(rsArr[2]);

		str = "java,jsp,spring,html,css,js,jquery,mysql";
		rsArr = str.split(",");
		System.out.println(rsArr.length);
		for (int i = 0; i < rsArr.length; i++) {
			System.out.println(rsArr[i]);
		}
		
		// [5] 문자열 비교 : compareTo()
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
				
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수 ( 왼쪽값이 작을경우 )
				
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// 양수 ( 왼쪽값이 클경우 )
				
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0    ( 같을 경우 )

	}
}
