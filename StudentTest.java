package studentGrade.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import studentGrade.java.Student;

public class StudentTest {
//	@InjectMocks
//		Student student = new Student();
	
	@Test
	public void given_id_001_when_get_score_should_be_return_50() {
		Student student = new Student();
		student.setStusentId("001");
		student.setScore(50);
		
		assertEquals(50, student.getScore());
	}
	
	@Test
	public void given_id_002_when_get_score_should_be_return_30() {
		Student studentA = new Student();
		studentA.setStusentId("001");
		studentA.setScore(50);
		
		Student studentB = new Student();
		studentB.setStusentId("002");
		studentB.setScore(30);
		
		assertEquals(30, studentB.getScore());
	}
}
