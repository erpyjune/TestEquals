package com.erpy.test.equal;

class Student {
	String name;
	Student(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	/*
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		System.out.println(obj.hashCode());
		return this.name == s.name;
	}
	*/
}

public class EqualsDemo {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
