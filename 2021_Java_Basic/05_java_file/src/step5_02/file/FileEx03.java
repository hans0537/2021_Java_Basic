package step5_02.file;

import java.io.FileWriter;

public class FileEx03 {

	public static void main(String[] args) {
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages = {	   20,     30,     40};
				
		String fileName = "fileTest01.txt";
				
		String data = "";
		
		for (int i = 0; i < names.length; i++) {
			if (i!=2) {
				data += names[i] + "/" + ages[i] + ",";
			}else {
				data += names[i] + "/" + ages[i];
			}
		}
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
