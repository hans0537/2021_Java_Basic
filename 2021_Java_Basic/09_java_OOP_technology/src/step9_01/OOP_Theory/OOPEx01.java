package step9_01.OOP_Theory;

/*
 * # toString
 * 
 * - 객체의 주소를 문자열 형태로 변환한다.
 * 
 */

class Test1{
	
}

class Test2{

	@Override
	public String toString() {
		return "객체에 대한 설명";
	}
	
}

class Test3{
	
	String name;
	int age;

	//자동완성 기능: 이클립스 촤측 상단 source -> generate construct using fields
	public Test3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//자동완성 기능: 이클립스 촤측 상단 source -> generate toString
	@Override
	public String toString() {
		return "Test3 [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
public class OOPEx01 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		System.out.println(t1); //객체의 주소가 콘솔에 출력된다.
		
		Test1 t2 = new Test1();
		System.out.println(t2); //객체의 주소가 콘솔에 출력된다.
		System.out.println("=====================");
		
		Test2 t3 = new Test2();
		System.out.println(t3); //toString() 메서드의 return값이 콘솔에 출력된다.
		
		Test2 t4 = new Test2();
		System.out.println(t4); //toString() 메서드의 return값이 콘솔에 출력된다.
		System.out.println("=====================");
		
		Test3 t5 = new Test3("James gosling", 50);
		System.out.println(t5); //toString() 메서드의 return값이 콘솔에 출려된다.
		
		Test3 t6 = new Test3("team bernuslee", 55);
		System.out.println(t6); //toString() 메서드의 return값이 콘솔에 출려된다.
	}

}
