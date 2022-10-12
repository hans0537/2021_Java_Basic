package student_practice;

public class StudentInsert {

	private StudentDAO studentDAO;
	
	public StudentInsert(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public void insert(StudentVO studentVO) {
		String id = studentVO.getId();
		if (checkId(id)) {
			studentDAO.insert(studentVO);
		}
		else {
			System.out.println("중복되는 아이디 입니다.");
		}
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? true:false;
	}
}
