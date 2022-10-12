package step1_05.controlStatement;

import java.util.Random;

/*
 * 
 * # 랜덤 라이브러리 (if와 관련)
 * 
 *  - 임의의 난수(랜덤숫자)를 생성할 수 있다.
 * 
 * */

public class IfEx13 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 0 ~ 9사이의 랜덤 값
		int rNum1 = ran.nextInt(10); 
		System.out.println(rNum1);
		
		// 100 ~ 200사이의 랜덤값
		int rNum2 = ran.nextInt(101) + 100; // [0~100] + 100
		System.out.println(rNum2);
		
		// -3 ~ 3 사이의 랜덤값
		int rNum3 = ran.nextInt(7) - 3;  // [0~6] - 3
		System.out.println(rNum3);
		
		
	}

}
