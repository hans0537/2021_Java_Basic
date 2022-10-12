package student_practice;

import java.util.Map;

public class StudentDAO {

	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
	}
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}

	public void change(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public Map<String, StudentVO> getStudentDB() {
		return StudentRepository.getStDB();
	}
	
	public void delete(String id) {
		StudentRepository.getStDB().remove(id);
	}
}
