package com.amar.learn.streamapi;

public class StudentBean implements Comparable{

	private String name;
	private int age;
	private int marks;

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public StudentBean(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public int compareTo(Object obj) {
		StudentBean student = (StudentBean) obj;
		
		if (age > student.age)
			return 1;
		if (age < student.age)
			return -1;
		else
		return 0;
		
	}

}
