package person;

public abstract class Person {
	private String pName;
	private int pAge;
	private String pGender;
	private String pId;
	
	public Person(String name,int age, String gender,String id){
		pName = name;
		pAge = age;
		pGender = gender;
		pId = id;
		
	}
	
	@Override
	public String toString(){
		String str;
		str = "Name: "+pName+"\nAge: "+pAge+"\nGender: "+pGender+"\nID: "+pId;
		return str;
	}
	
	public abstract boolean isTeacher();
	public abstract boolean isStudent();
}
