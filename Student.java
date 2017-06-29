package studentGrade.java;

public class Student {
	
	private String studentId;
	private int score;
	private String grade;
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getStudentId() {
		return studentId;
	}

	public int getScore() {
		return score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
