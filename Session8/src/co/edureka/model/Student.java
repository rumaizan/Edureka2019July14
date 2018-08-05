package co.edureka.model;

public class Student{ //extends Object{ (by default)  | Object class in Java is the root class i.e. parent for all

	public int id;
	public String name;
	public int age;
	
	public Student(){
		
	}
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
