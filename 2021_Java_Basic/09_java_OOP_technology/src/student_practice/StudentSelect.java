package student_practice;

public class StudentSelect {

	private StudentDAO studentDAO;

	public StudentSelect(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public StudentVO select(String id) {
		if (checkId(id)) {
			return studentDAO.select(id);
		}
		else {
			System.out.println("해당 정보가 없습니다");
			return null;
		}
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? false:true;
	}
}
