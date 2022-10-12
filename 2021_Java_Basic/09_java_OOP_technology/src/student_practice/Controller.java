package student_practice;

public class Controller {

	private StudentDAO stDAO;
	private StudentInsert insert;
	private StudentSelect select;
	private StudentUpdate update;
	private StudentSelectAll stall;
	
	public Controller() {
		stDAO = new StudentDAO();
		insert = new StudentInsert(stDAO);
		select = new StudentSelect(stDAO);
		update = new StudentUpdate(stDAO);
		stall = new StudentSelectAll(stDAO);
	}
	
	public StudentUpdate getUpdate() {
		return update;
	}

	public StudentSelectAll getStall() {
		return stall;
	}

	public void setStall(StudentSelectAll stall) {
		this.stall = stall;
	}

	public void setUpdate(StudentUpdate update) {
		this.update = update;
	}

	public StudentDAO getStDAO() {
		return stDAO;
	}

	public void setStDAO(StudentDAO stDAO) {
		this.stDAO = stDAO;
	}
	
	public StudentSelect getSelect() {
		return select;
	}

	public void setSelect(StudentSelect select) {
		this.select = select;
	}

	public StudentInsert getInsert() {
		return insert;
	}

	public void setInsert(StudentInsert insert) {
		this.insert = insert;
	}
	
}
