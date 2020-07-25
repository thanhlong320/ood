package Classes.Customer;

import java.util.Date;

public abstract class Customer {
	String name;
	int age;
	String address;
	Date birth;
	public Customer(String name, int age, String address, Date birth) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public Date getBirth() {
		return birth;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
}
