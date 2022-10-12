package atm_v2_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	private FileManager() {}
	private static FileManager instance = new FileManager();
	public static FileManager getinstance() {
		return instance;
	}
	
	String fileName = "ATM_practice.txt";
	String data = "";
	UserManager um = UserManager.getInstance();
	
	void setData() {
		
		data = "";
		int userCnt = um.userCnt;
		data += userCnt + "\n";
		
		for (int i = 0; i < userCnt; i++) {
			data += um.userList[i].id + "\n";
			data += um.userList[i].pw + "\n";
			data += um.userList[i].accCnt + "\n";
			
			if (um.userList[i].accCnt == 0) {
				data += "0\n";
			}
			else {
				for (int j = 0; j < um.userList[i].accCnt; j++) {
					data += um.userList[i].acc[j].accNumber + "/";
					data += um.userList[i].acc[j].money;
					if (j!=um.userList[i].accCnt-1) {
						data += ",";
					}
				}
			}
			data += "\n";
		}
	}
	void save() {
		setData();
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fw!=null) {try {fw.close();} catch (IOException e) {e.printStackTrace();}}
		}
	}
	
	void load() {
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			if (file.exists()) {
				
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				while(true) {
					String line = br.readLine();
					if (line == null) {
						break;
					}
					data += line;
					data += "\n";
				}
				String[] temp = data.split("\n");
				um.userCnt = Integer.parseInt(temp[0]);
				um.userList = new User[um.userCnt];
				for (int i = 0; i < um.userCnt; i++) {
					um.userList[i] = new User();
				}
				int j = 0;
				for (int i = 1; i < temp.length; i+=4) {
					um.userList[j].id = temp[i];
					um.userList[j].pw = temp[i+1];
					um.userList[j].accCnt = Integer.parseInt(temp[i+2]);
					String accInfo = temp[i+3];
					
					if (um.userList[j].accCnt==1) {
						String[] tmp = accInfo.split("/");
						um.userList[j].acc[0] = new Account();
						um.userList[j].acc[0].accNumber = tmp[0];
						um.userList[j].acc[0].money = Integer.parseInt(tmp[1]);
					}
					
					if (um.userList[j].accCnt>1) {
						String[] tmp = accInfo.split(",");
						for (int k = 0; k < tmp.length; k++) {
							String[] tmp1 = tmp[k].split("/");
							um.userList[j].acc[k] = new Account();
							um.userList[j].acc[k].accNumber = tmp1[0];
							um.userList[j].acc[k].money = Integer.parseInt(tmp1[1]);	
						}
					}
					j++;
				}
			}
			else {
				setData();
				save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) try {br.close();} catch (IOException e) {}
			if(fr!=null) try {fr.close();} catch (IOException e) {}
		}
	}
}
