package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double FinalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if (FinalGrade() < 60) {
			return 60 - FinalGrade();
		} else {
			return 0.0;
		}
		
	}
}

