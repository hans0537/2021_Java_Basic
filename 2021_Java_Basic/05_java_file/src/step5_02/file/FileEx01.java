package step5_02.file;

import java.io.FileWriter;

//파일에 입력하기(input) 

public class FileEx01 {

	public static void main(String[] args) {
		// 파일이 생성되는 기본적인 위치는 현재 자바파일과 같은 프로젝트 폴더이다.(위치변경가능)
		// 소스를 실행한 후 프로젝트를 선택 한 뒤 F5(Refresh)를 누르면 생성된 파일을 확인할 수 있다.

		FileWriter fw = null;
		
		try {//파일 입출력은 try, catch 구문 없이 사용하지 못하도록 강제성을 부여 
			fw = new FileWriter("ex01.hwp"); //파일 생성
			
			fw.write("파일 저장하기 연습문제1\n"); // write 메서드를 통해 파일에 데이터 입력
			fw.write("파일 저장하기 연습문제2\n"); // 1) 문자열 데이터 형식만 가능
											 // 2) 엔터 하려면 \n 
			
			fw.close();						 // 파일 객체 종료 (중요)
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
