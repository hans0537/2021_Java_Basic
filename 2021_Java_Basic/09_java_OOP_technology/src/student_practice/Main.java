package student_practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();
		
		while(true) {
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int sel = scan.nextInt();
			
			if (sel==1) {
				System.out.print("추가 하실 아이디 입력: ");
				String id = scan.next();
				
				System.out.print("추가 하실 이름 입력: ");
				String name = scan.next();
				
				System.out.print("추가 하실 번호 입력: ");
				int num = scan.nextInt();
								
				StudentInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentVO(id, name, num));
			}
			else if(sel==2) {
				System.out.print("수정 하실 아이디 입력: ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st!=null) {
					System.out.print("변경 하실 이름 입력: ");
					String name = scan.next();
					
					System.out.print("변경 하실 번호 입력: ");
					int num = scan.nextInt();
					
					StudentUpdate stchange = controller.getUpdate();
					stchange.change(new StudentVO(id, name, num));
				}
			}
			else if(sel==3) {
				System.out.print("삭제 하실 아이디 입력: ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st!=null) {
					StudentUpdate stdelete = controller.getUpdate();
					stdelete.delete(id);
					System.out.println(id + "님 삭제되었습니다.");
				}
			}
			else if(sel==4) {
				System.out.print("아이디를 입력하세요: ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if(st!=null) st.print();
			}
			else if(sel==5) {
				StudentSelectAll stall = controller.getStall();
				stall.printAll();
			}
			else if(sel==6) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}

}
