package student_practice;

public class StudentUpdate {

	private StudentDAO studentDAO;

	public StudentUpdate(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void change(StudentVO studentVO) {
		studentDAO.change(studentVO);
	}
	
	public void delete(String id) {
		studentDAO.delete(id);
	}
}
