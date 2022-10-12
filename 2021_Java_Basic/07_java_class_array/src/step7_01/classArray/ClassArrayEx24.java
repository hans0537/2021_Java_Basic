package step7_01.classArray;

/*
 * # 싱글턴 패턴
 * 
 * - 객체를 딱 1번만 생성하고 싶을 때 사용하는 기법
 * 
 */

class MySingleTon{
	
	//1) private 기본 생성자를 만든다.
	private MySingleTon() {}
	
	//2) 내부에서 static으로 자기자신의 인스턴스를 생성한다.
	private static MySingleTon instance = new MySingleTon();
	
	//3) instance를 반환할 getter를 만들어 준다.
	public static MySingleTon getInstance() {
		return instance;
	}
	
	//테스트용 변수
	int nVar1;
	int nVar2;
	int nVar3;
	
	void method1() { System.out.println("#메서드 1"); }
	void method2() { System.out.println("#메서드 2"); }
	void method3() { System.out.println("#메서드 3"); }
	
}

//테스트용 클래스
class TestClass {}
public class ClassArrayEx24 {

	public static void main(String[] args) {

		//MySingleTon test = new MySingleTon(); //error 싱글톤 사용방식 X
		MySingleTon.getInstance(); // 싱글톤 사용법
	
		MySingleTon.getInstance().nVar1 = 10;
		MySingleTon.getInstance().nVar2 = 20;
		MySingleTon.getInstance().nVar3 = 30;
		
		System.out.println(MySingleTon.getInstance().nVar1);
		System.out.println(MySingleTon.getInstance().nVar2);
		System.out.println(MySingleTon.getInstance().nVar3);
		System.out.println();
		
		MySingleTon.getInstance().method1();
		MySingleTon.getInstance().method2();
		MySingleTon.getInstance().method3();
		System.out.println();
		
		System.out.println(MySingleTon.getInstance()); //같은객체
		System.out.println(MySingleTon.getInstance()); //같은객체
		System.out.println();
		
		System.out.println(new TestClass());
		System.out.println(new TestClass());
		System.out.println();
		
		///// 생각해볼 부분 /////
		MySingleTon temp = MySingleTon.getInstance();
		System.out.println(temp);
		System.out.println(MySingleTon.getInstance());
		
		System.out.println(temp.nVar1);
		System.out.println(temp.nVar2);
		System.out.println(temp.nVar3);
		
		temp.method1();
		temp.method2();
		temp.method3();
	}

}
