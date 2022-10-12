package step6_02.method;
/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */

class ReturnTest{
	void setScore1(int score1) {
		score1 = 100;
	}
	
	int setScore2(int score2) {
		score2 = 100;
		return score2;
	}
	
	int testReturn() {
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
		
		return 1;
		//return 1,2,3,4,5; // 복수의 리턴값이 불가능 하다.
		//첫번째 return시에 함수가 종료되기 때문에 이후 명령어가 실행불가.
		//System.out.println("리턴 후 명령어1");
	}
}
public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnTest obj = new ReturnTest();
		
		int score1 = 87;
		System.out.println("메서드 호출 전의 성적 = " + score1 );	// ?
		
		obj.setScore1(score1);
		System.out.println("메서드 호출 후의 성적 = " + score1 );	// ?
		
		System.out.println("=========================================");

		int score2 = 87;
		System.out.println("메서드 호출 전의 성적 = " + score2 );	// ?
		
		score2 = obj.setScore2(score2);
		
		System.out.println("메서드 호출 후의 성적 = " + score2 );	// ?

	}

}
