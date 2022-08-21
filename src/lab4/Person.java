package lab4;

public class Person {
	String name;
	float age;
	
	//constructors
	public Person(String name, float age) {
		this.name = name;
		this.age = age;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}
