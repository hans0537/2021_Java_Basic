package step4_01.string;

import java.util.Scanner;
/*
 * 
 * 문자열 입력
 * 
 * 1) next() : 공백을 기준으로 한단어만 입력받는다.
 * 2) nextLine() : enter입력전까지 전체를 입력 받는다.
 * 
 *  nextLine()은 버퍼관련 이슈가 생길 수 있으니 버퍼를 정리해 주어야 한다.
 * 
 * */
public class StringEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		//String name = scan.next(); //띄어쓰기를 제외한 문자열 입력
		String name = scan.nextLine(); //띄어쓰기포함 문자열 입력
		System.out.println("name: "+ name);
		
		/////////////////////////////////
		
		//버퍼관련 이슈
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		System.out.println("age: " + age);
		
		scan.nextLine(); // 엔터까지 인식하므로 이놈이 엔터 먹고 사라지므로 해결
		
		
		
		System.out.print("특이사항 입력: ");
		String comment = scan.nextLine();
		System.out.println("comment: " + comment);
	}

}
