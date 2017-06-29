package studentGrade.java;

import java.util.List;

public class ResultGrade {

	public List<Student> graded(List<Student> studentList, Grade intialgrade) {
		Student std= null;
		for(int i=0;i<=studentList.size();i++){
			std = studentList.get(i);
			if(std.getScore()>=intialgrade.getMina())
				std.setGrade("A");
			
			else if (std.getScore()>=intialgrade.getMinb())
				std.setGrade("B");		
				
			else if (std.getScore()>=intialgrade.getMinc())
				std.setGrade("c");	
			
			else if (std.getScore()>=intialgrade.getMind())
				std.setGrade("D");	
			
			else std.setGrade("F");	
		
		}
		
		return null;
		
	}

}
