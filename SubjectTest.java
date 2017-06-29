package studentGrade.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import studentGrade.java.Subject;


public class SubjectTest {

	@Test
	public void test() {
		Subject math = new Subject();
		math.setNameSubject("MATH");
		math.setTotalStudent(10);
		
		math.setMean(70.0);
		math.setMax(90);
		math.setMin(40);
		String setNameSubjectmath = math.getNameSubject();
		int setTotalStudentmath = math.getTotalStudent();
		double setMeanmath = math.getMean();
		int setMaxmath = math.getMax();
		int setMinmath = math.getMin();
		assertEquals("MATH", setNameSubjectmath);
		assertEquals(10, setTotalStudentmath);
//		assertEquals(70.0, setMeanmath);
		assertEquals(90, setMaxmath);
		assertEquals(40, setMinmath);
	}

	

}
