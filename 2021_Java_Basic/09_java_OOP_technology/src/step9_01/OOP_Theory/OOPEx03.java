package step9_01.OOP_Theory;

/*

# 메서드 오버라이딩 ( Method Overriding )

- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
- 메서드 오버로딩과 혼용되기 쉽다.

*/

class Warrior2 extends Character{
	
	void levelup() { // 메서드 오버라이딩 (메서드 재정의)
		this.level++;
		this.power+=100;
		this.life+=100;
		this.dex+=50;
		this.mana+=5;
	}
	
	void dash() { // Warrior2 클래스 만의 메소드 추가
		System.out.println("# dash!");
	}
}

class Wizard2 extends Character{
	void levelup() { // 메서드 오버라이딩 (메서드 재정의)
		this.level++;
		this.power+=10;
		this.life+=100;
		this.dex+=100;
		this.mana+=100;
	}
	
	void fireball() { //Wizard2 클래스마의 메소드 추가
		System.out.println("# fireBall!");
	}
}
public class OOPEx03 {

	public static void main(String[] args) {

		Warrior2 war1 = new Warrior2();
		war1.showStatus();
		war1.levelup();
		war1.showStatus();
		war1.dash();
		System.out.println("===========================");
		
		Wizard2 wiz1 = new Wizard2();
		wiz1.showStatus();
		wiz1.levelup();
		wiz1.showStatus();
		wiz1.fireball();
	}

}
