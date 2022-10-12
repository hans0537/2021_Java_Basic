package atm_v3_practice;

public class User {

	String id;
	String pw;
	Account[] accList;
	int accCnt;
	
	User(){}
	
	User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	
}
