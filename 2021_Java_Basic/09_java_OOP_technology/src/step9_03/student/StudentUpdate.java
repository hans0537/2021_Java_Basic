package step9_03.student;

public class StudentUpdate {
	
	private StudentDAO studentDAO;
	
	public StudentUpdate(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}

	public void change(StudentVO studentVO) {
		studentDAO.change(studentVO);
	}
	
	public void delete(String id) {
		studentDAO.delete(id);
	}
}
