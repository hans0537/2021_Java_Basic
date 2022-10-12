package step9_01.OOP_Theory;

/*
 * # this: 자신의 객체
 * # super: 부모클래스의 객체
 * 
 * # this(): 자신의 생성자
 * # super(): 부모클래스의 생성자
 * 
 * # this.testMethod() : 자신의 메소드 호출
 * # testMethod()      : 자신의 메소드 호출
 * 
 * # super.testMethod() : 부모의 메소드 호출
 * 
 */

class Parent {
	
	String name;
	int age;
	
	Parent(){
		this("무명",0); // 현재 클래스의 다른 생성자 Parent(String name, int age) 호출 예시
		System.out.println("부모 클래스의 기본 생성자 실행");
	}
	
	Parent(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("부모클래스의 추가된 생성자 실행");
	}
	
}

class Child extends Parent{
	
	Child(){
		super("제임스 고슬링",70); //super() 부모클래스의 기본 생성자 실행 (생략되어있음)
							   //부모클래스의 Parent(String name, int age) 생성자 실행
		System.out.println("자녀 클래스의 기본 생성자 실행");
	}
	
	Child(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("자녀 클래스의 추가된 생성자 실행");
	}
}
public class OOPEx04 {

	public static void main(String[] args) {
		
		new Parent(); 
		new Parent("제임스 고슬링", 70);
		System.out.println("==========================");
		
		//자식 클래스의 생성자가 실행되기 전에 부모클래스의 생성자가 먼저 실행된다.
		new Child();
		new Child("제임스 고슬링 주니어", 7);
		
	}

}
