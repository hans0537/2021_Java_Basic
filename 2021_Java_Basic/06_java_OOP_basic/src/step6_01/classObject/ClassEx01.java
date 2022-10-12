package step6_01.classObject;
/*
 * 
 * # 클래스 
 * 
 * 1. 정의 ( 설계도 )
 * 
 * 		1-1) class : 키워드
 * 		1-2) Ex01  : 클래스명 ( 첫글자를 대문자로 작성한다. ) 
 * 		1-3) {}    : 클래스의 영역 
 * 
 * 2. 선언 ( 실 체 )
 * 	
 * 		클래스명 변수명 = new 클래스명();
 *    	ex)  Ex01   e     =  new Ex01();
 *    	  Random ran    =  new Random();
 * 
 * */

class Ex01{
	int x;
	int y;
}

class Character{
	
	int level = 1;
	int power = 10;
	int dex   = 10;
	int life  = 10;
	int mana  = 10;
	
}
public class ClassEx01 {

	public static void main(String[] args) {

		Ex01 e1 = new Ex01();
		e1.x = 10;
		e1.y = 20;
		
		System.out.println(e1);
		System.out.println(e1.x);
		System.out.println(e1.y);
		
		Ex01 e2 = new Ex01();
		e2.x = 100;
		e2.y = 200;
		
		System.out.println(e2);
		System.out.println(e2.x);
		System.out.println(e2.y);
		
		Character c1 = new Character();
		System.out.println(c1);
		System.out.println(c1.level);
		System.out.println(c1.power);
		System.out.println(c1.dex);
		System.out.println(c1.life);
		System.out.println(c1.mana);
	}

}
