package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StudentVO {
	String id = "";
	String pw = "";

	void set_data(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	void print_data() {
		System.out.println(this.id + " : " + this.pw); 
	}
}

class StudentManager {
	ArrayList<StudentVO> list = new ArrayList<StudentVO>();

	void print_student() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).print_data();
		}
	}
	void add_student(StudentVO st) {
		list.add(st);
	}

	int check_id(StudentVO st) {
		int check = -1;
		for (int i = 0; i < list.size(); i++) {
			if (st.id.equals(list.get(i).id)) {
				check = i;
				break;
			}
		}
		return check;		
	}

//	void sortdata() {
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < list.size(); j++) {
//				if(list.get(i).id.compareTo(list.get(j)) > 0) {
//					
//				}
//			}
//		}
//	}
	void remove_index(int idx) {
		list.remove(idx);
	}

	String outdata() {
		String data = "";
		int cnt = list.size();
		if (cnt==0) {
			return data;
		}
		data += cnt + "\n";
		for (int i = 0; i < cnt; i++) {
			data += list.get(i).id+","+list.get(i).pw;
			if (i != cnt - 1) {
				data += "\n";
			}
		}
		return data;
	}
	void load_student(ArrayList<StudentVO> list) {
		this.list = list;
	}
}

public class ClassArrayEx23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentManager manager = new StudentManager();

		while (true) {


			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();

			if 		(sel == 1) {
				StudentVO temp = new StudentVO();
				System.out.print("가입 하실 id 입력하세요: ");
				temp.id = scan.next();
				int check = manager.check_id(temp);

				if (check==-1) {
					System.out.print("가입 하실 pw 입력하세요: ");
					temp.pw = scan.next();
					manager.add_student(temp);
					System.out.println(temp.id + "님 가입완료 ");
				}else {
					System.out.println("이미 가입된 정보입니다.");
				}
			} 
			else if (sel == 2) {
				manager.print_student();
				StudentVO temp = new StudentVO();
				System.out.println("탈퇴하실 id 입력하세요: ");
				temp.id = scan.next();

				int check = manager.check_id(temp);
				if (check==-1) {
					System.out.println("없는 아이디 입니다.");
				}
				else {
					manager.remove_index(check);
					System.out.println(temp.id + "님 탈퇴 완료");
				}
			}
			else if (sel == 3) {
//				manager.sortdata();
				manager.print_student();
			}
			else if (sel == 4) {
				manager.print_student();
			}
			else if (sel == 5) {

				if (manager.list.size() == 0) return;

				try {
					FileWriter fw = new FileWriter("student_manager_list.txt");
					String data = manager.outdata();

					if (!data.equals("")) {
						fw.write(data);
						System.out.println(data);
						System.out.println("저장이 완료 되었습니다.");
					}
					fw.close();
				} catch (Exception e) {e.printStackTrace();}
			}
			else if (sel == 6) {
				try {
					File file = new File("student_manager_list.txt");

					if (file.exists()) {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						ArrayList<StudentVO> list = new ArrayList<StudentVO>();

						String line = br.readLine();
						int count = Integer.parseInt(line);
						for (int i = 0; i < count; i++) {
							StudentVO temp = new StudentVO();
							line = br.readLine();
							temp.id = line.split(",")[0];
							temp.pw = line.split(",")[1];
							list.add(temp);
						}
						fr.close();
						br.close();
						manager.load_student(list);;
					}
				} catch (Exception e) {}
			}
			else if (sel == 7) {
				System.out.println("종료");
				break;

			}

		}

	}

}
