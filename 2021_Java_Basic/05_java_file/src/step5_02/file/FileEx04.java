package step5_02.file;

import java.io.FileWriter;

public class FileEx04 {

	public static void main(String[] args) {
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "fileTest02.txt";
		
		String data = "";
		for (int i = 0; i < names.length; i++) {
			if (i!=2) {
				data += names[i] + "/" + pws[i] + "/" + moneys[i] + "\n";
			}else {
				data += names[i] + "/" + pws[i] + "/" + moneys[i];
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
