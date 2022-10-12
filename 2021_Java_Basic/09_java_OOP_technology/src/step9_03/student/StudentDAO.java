package step9_03.student;

import java.util.Map;

public class StudentDAO {
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
	}
	
	public void change(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public void delete(String id) {
		StudentRepository.getStDB().remove(id);
	}
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}

}
