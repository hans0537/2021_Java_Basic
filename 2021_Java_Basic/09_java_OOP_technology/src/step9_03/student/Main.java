package step9_03.student;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	

		while (true) {

			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();

			if (selectMenu == 1) {

				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();

				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();

				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();

				StudentInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentVO(id , num , name));

			}
			else if (selectMenu == 2) {
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면
				 *    이름과 번호를 변경할 수 있는 기능
				 * 
				 * */

				System.out.print("아이디를 입력하세요: ");
				String id = scan.next();

				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);

				if (st!=null) {
					System.out.print("변경 하실 이름 입력: ");
					String changeName = scan.next();
					System.out.print("변경 하실 번호 입력: ");
					int changeNum = scan.nextInt();

					StudentUpdate stChange = controller.getUpdate();
					stChange.change(new StudentVO(id , changeNum , changeName));
				}
			}
			else if (selectMenu == 3) {
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면 삭제
				 * 
				 * */
				
				System.out.print("삭제할 아이디를 입력하세요: ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st!=null) {
					StudentUpdate stDelete = controller.getUpdate();
					stDelete.delete(id);
					System.out.println(id + "님 삭제가 완료 되었습니다.");
				}
				
			}
			else if (selectMenu == 4) {

				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();

				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);

				if (st != null) st.printOneInfo();

			}
			else if (selectMenu == 5) {

				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();

			}
			else if (selectMenu == 6) {

				System.out.println("종료");
				scan.close();
				break;

			}

		}

	}

}
