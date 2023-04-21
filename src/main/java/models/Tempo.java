package main.java.models;

public class Tempo {
	private String name;
	private int age; 
	private String sample;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Tempo [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
	}

}
