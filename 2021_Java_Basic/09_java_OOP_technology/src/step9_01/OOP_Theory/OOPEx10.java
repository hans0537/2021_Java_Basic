package step9_01.OOP_Theory;

import java.util.Scanner;

/*

# 다형성

- 다형성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 말한다.
- 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 가져야 한다.
- 부모 클래스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 반드시 override 시켜서 사용해야 한다.
- 부모 클래스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.

*/

class PolyShape{
	
	void draw() {} //자녀들의 상속받아서 사용할 메소드를 정의
}

class PolyLine extends PolyShape{
	void draw() { //부모 클래스를 자신에 맞게 재정의
		System.out.println("선을 그린다.");
	}
}

class PolyCircle extends PolyShape{
	void draw() { //부모 클래스를 자신에 맞게 재정의
		System.out.println("원을 그린다.");
	}
}

class PolyRect extends PolyShape{
	void draw() { //부모 클래스를 자신에 맞게 재정의
		System.out.println("사각형을 그린다.");
	}
}

public class OOPEx10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//부모클래스의 타입으로 배열을 생성하고 자식클래스로 배열의 요소를 추가
		PolyShape[] shapes = {
								new PolyLine(),
								new PolyRect(),
								new PolyCircle()
							  };
		
		System.out.println("1)선, 2)사각형, 3)원");
		System.out.print(">");
		int choiceMenu = scan.nextInt();
		
		shapes[--choiceMenu].draw(); //자식클래스의 재정의된 메소드 구현
		
		scan.close();
	}

}
