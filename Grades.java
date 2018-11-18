 class Grades {

    String name;
	int grade;
	
	public Grades(String new_name, int new_grade) {
		this.name = new_name;
		this.grade = new_grade;
	}
	
	public int all_grades() {
		return name + "  " + grade;
	}
}