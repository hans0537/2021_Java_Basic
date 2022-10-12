package step6_02.method;
/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 입력값(파라메타,매개변수,인수,인자,아규먼트)과 
 * 결과값(return)의 유무에 따라 4가지 형태로 나뉜다.
 * 
 * 입력값이 있고 , 결과값이 있다. ( 11 )
 * 입력값이 있고 , 결과값이 없다. ( 10 )
 * 입력값이 없고 , 결과값이 있다. ( 01 )
 * 입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */
class MethodType{
	
	int type11(int arg1, int arg2) {
		return arg1 + arg2;
	}
	
	void type10(int arg1, int arg2) {
		System.out.println("두 파라메타값의 합 : " + (arg1+arg2));
	}
	
	double type01() {
		return 3.141592;
	}
	
	void type00() {
		System.out.println("type00 메서드 호출");
	}
}

public class MethodEx02 {

	public static void main(String[] args) {
		
		MethodType mt = new MethodType();
		
		// 입력값과 결과값이 모두 있는 경우
		int type11Result = mt.type11(100, 300); // return값을 변수에 저장
		//(참고) if(mt.type11(100,300)==400) {} true
		
		// 입력값은 있고 결과값이 없는 경우
		mt.type10(7, 12);
		//(참고) if(mt.type10(7,12)==19) {} false
		
		//입력값은 없고 결과값이 있는 경우
		double type01Res = mt.type01(); // return값을 변수에 저장
		
		//입력값과 결과값이 없는 경우
		mt.type00();
		
	}

}
