 class Main {
	
	public static int factorial (int num) {
		return num == 1 ? 1 : num * factorial(num-1);
		
	}

	public static void main(String[] args) {		
		Instructor Favorite = new Instructor("Louisa", "Harutyunyan");
		System.out.println(Favorite.get());
		
		Grade MyGrade = new Grade("Discrete Math", 98);
		System.out.println(MyGrade.all_grades());
		
		Student = new Student("Maro", 17);
		System.out.println(Student.commitment());
	
		System.out.println(factorial(5));
	}
	
}
