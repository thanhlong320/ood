package Classes.Customer;

import java.util.Date;

public class DomesticCustomer extends Customer{
	String cmnd;
	public DomesticCustomer(String name, int age, String address, Date birth, String cmnd) {
		super(name, age, address, birth);
		this.cmnd = cmnd;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
}
