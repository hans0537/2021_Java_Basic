package step9_03.student;

import java.util.HashMap;
import java.util.Map;

public class StudentSelectAll {
	
	private StudentDAO studentDAO;
	
	public StudentSelectAll(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	
	public Map<String , StudentVO> allSelect(){
		return studentDAO.getStudentDB();
	}
	
	
	public void printAll() {
		
//		Map<String ,String> b = new HashMap<String, String>();
//		HashMap<String ,String> c = new HashMap<String, String>();
		
		Map<String , StudentVO> map = studentDAO.getStudentDB();
		
		for (String key : map.keySet()) {
			map.get(key).printOneInfo();
		}
		
	}
	
}
