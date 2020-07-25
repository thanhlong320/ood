package Classes.Customer;

import java.util.Date;

public class ForeignCustomer extends Customer{
	String passpord;
	public ForeignCustomer(String name, int age, String address, Date birth, String passpord) {
		super(name, age, address, birth);
		this.passpord = passpord;
	}
}
