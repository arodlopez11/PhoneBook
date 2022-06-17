package phonebook;

import java.util.Arrays;

class Person extends PersonsList {
	String fname;
	String lname;
	String phone;
	String address;
	

	public Person(String fname, String lname, String phone,String address) {
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.address = address;
		
	}
	

	String getfname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "\n" + fname + "\n" + lname + "\n" + phone + "\n" + address + "\n";
	}
	
}