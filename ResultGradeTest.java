package studentGrade.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import studentGrade.java.Grade;
import studentGrade.java.ResultGrade;
import studentGrade.java.Student;

public class ResultGradeTest {

	@Test
	public void ResultGradeTest() {
		ResultGrade resultgrade = new ResultGrade();
		Grade intialgrade = new Grade();
		List<Student>  studentList= new ArrayList<Student>();
		List<Student>  gradeList= new ArrayList<Student>();
		intialgrade.setMina(90);
		intialgrade.setMinb(60);
		intialgrade.setMinc(40);
		intialgrade.setMind(30);
		Student student = new Student();
		student.setStudentId("001");
		student.setScore(40);
		studentList.add(student);
		student.setStudentId("002");
		student.setScore(60);
		studentList.add(student);
		
		gradeList=resultgrade.graded(studentList,intialgrade);
		
	}

}
