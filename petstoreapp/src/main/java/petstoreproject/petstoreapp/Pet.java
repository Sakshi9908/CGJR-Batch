package petstoreproject.petstoreapp;

public class Pet {
	private String petName;
	private int age;
	private String gender;
	public Pet(String petName, int age, String gender) {
		super();
		this.petName = petName;
		this.age = age;
		this.gender = gender;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
