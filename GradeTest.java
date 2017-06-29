package studentGrade.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import studentGrade.java.Grade;

public class GradeTest {

	@Test
	public void input_grade_math_subject() {
		Grade math = new Grade();
		
		math.setMina(80);
		math.setMinb(70);
		math.setMinc(60);
		math.setMind(50);
		int mathmina = math.getMina();
		int mathminb = math.getMinb();
		int mathminc = math.getMinc();
		int mathmind = math.getMind();
		assertEquals(80, mathmina);
		assertEquals(70, mathminb);
		assertEquals(60, mathminc);
		assertEquals(50, mathmind);
	}

}
