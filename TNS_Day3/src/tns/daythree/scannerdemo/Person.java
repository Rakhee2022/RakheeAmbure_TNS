package tns.daythree.scanner;

import src.tns.daythree.scanner.Override;
import src.tns.daythree.scanner.String;

public class Person {
   //Data member
	 private String name;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	private int income;
	 private String gender;
	 private int age;
	 private int tax;
	 //object class method return string representation of person object
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
	 
	 
}
