package a_Zadania.c_Strumienie;

import java.util.Random;

public class Employee2 {

	private String name;
	private char sex;
	private int age;
	private double salary;
	private Random generator = new Random();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		generator = new Random();
		this.age = generator.nextInt(50) + 18;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		
		this.salary = generator.nextDouble()*4000 + 2100;
	}
	public void setSalary(double salary) {
		
		this.salary = salary;
	}
	public Employee2(String name, char sex) {
		this.name = name;
		this.sex = sex;
		setSalary();
		setAge();
	}
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", sex=" + sex + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
