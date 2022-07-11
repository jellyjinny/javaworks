package chap11;

public class Student {
	private String studentNum;  //학번
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();  
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(student.studentNum.equals(studentNum)) {
				return true;
			}
		}
		return false;
	}
}