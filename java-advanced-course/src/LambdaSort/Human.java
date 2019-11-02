package LambdaSort;

public class Human {
	private String name;
	
	private int age;
	
	private Gender gender;
	
	public enum Gender{
		MALE, FEMALE
	}
	
	public Human() {
		
	}
	
	public Human(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public static int compareToNameThenAge(Human h1, Human h2) {
		if(h1.getName().equals(h2.getName())) {
			return h1.getAge()-h2.getAge();
		}else {
			return h1.getName().compareTo(h2.getName());
		}
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	  
}
