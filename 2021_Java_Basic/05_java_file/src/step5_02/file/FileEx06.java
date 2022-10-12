package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileEx06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vector = null;
		int elementCnt = 0;

		String fileName = "vector.txt";

		while (true) {

			for (int i = 0; i < elementCnt; i++) {
				System.out.print(vector[i]+ " ");
			}
			System.out.println();
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if		(sel == 1) {
				if (elementCnt==0) {
					vector = new int[elementCnt+1];
				}else if (elementCnt>0) {
					int[] temp = vector;
					vector = new int[elementCnt+1];
					for (int i = 0; i < elementCnt; i++) {
						vector[i]=temp[i];
					}
					temp = null;
				}
				System.out.println("추가할 데이터 입력: ");
				int data = scan.nextInt();
				vector[elementCnt] = data;
				elementCnt++;
			}
			else if (sel == 2) {
				System.out.print("삭제 인덱스 입력: ");
				int idx = scan.nextInt();

				if (idx<0 || idx>elementCnt-1) {
					System.out.println("해당 위치 삭제 불가");
					continue;
				}

				if (elementCnt==1) {
					vector = null;
				}else if (elementCnt>1) {
					int[] temp = vector;
					vector = new int[elementCnt-1];

					for (int i = 0; i < idx; i++) {
						vector[i]=temp[i];
					}

					for (int i = idx; i < elementCnt-1; i++) {
						vector[i]=temp[i+1];
					}
					temp = null;
				}
				elementCnt--;
			}
			else if (sel == 3) {
				String data = "";
				if (elementCnt>0) {
					for (int i = 0; i < elementCnt; i++) {
						data += vector[i];
						data += "\n";
					}
					data = data.substring(0, data.length()-1);
					FileWriter fw = null;

					try {
						fw = new FileWriter(fileName);

						fw.write(data);

						fw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else {
					System.out.println("저장할 데이터값 없음");
				}
			}
			else if (sel == 4) {
				String data = "";
				File file = new File(fileName);

				if (file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;

					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);

						while(true) {
							String line = br.readLine();
							if (line==null) {
								break;
							}
							data += line + " ";
						}
						data = data.substring(0, data.length()-1);
						
						String[] temp = data.split(" ");
						elementCnt = temp.length;
						
						vector = new int[elementCnt];
						
						for (int i = 0; i < elementCnt; i++) {
							vector[i] = Integer.parseInt(temp[i]);
						}
						fr.close();
						br.close();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}

}