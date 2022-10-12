package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class FileEx05 {

	public static void main(String[] args) {
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
		int size = 3;
		ids = new String[size];
		pws = new String[size];
		moneys = new int[size];
		String fileName = "fileTest02.txt";
		
		File file = new File(fileName);
		
		if(file.exists()) {
			FileReader fr = null;
			BufferedReader br = null;
				
		try {
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			int i = 0;
			
			while(true) {
				String line = br.readLine();
				
				if (line==null) {
					break;
				}
				
				String[] info = line.split("/");
				System.out.println(Arrays.toString(info));
				
				String[] temp = info;
								
				ids[i] = temp[0];
				pws[i] = temp[1];
				moneys[i] = Integer.parseInt(temp[2]);
			
				i++;
			}
			fr.close();
			br.close();
			
		} catch (Exception e) {
			
		}
	}	
		System.out.println(Arrays.toString(ids));
		System.out.println(Arrays.toString(pws));
		System.out.println(Arrays.toString(moneys));
	}

}
