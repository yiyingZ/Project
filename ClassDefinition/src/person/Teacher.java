package person;

public class Teacher extends Person {

	public Teacher(String name, int age, String gender, String id) {
		super(name, age, gender,id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isTeacher() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isStudent() {
		// TODO Auto-generated method stub
		return false;
	}

}
