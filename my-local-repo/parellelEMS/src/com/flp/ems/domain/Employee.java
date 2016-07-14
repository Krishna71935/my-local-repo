package com.flp.ems.domain;

public class Employee {

	private String name, adr, email, ph, dob, doj;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", adr=" + adr + ", email=" + email + ", ph=" + ph + ", dob=" + dob + ", doj="
				+ doj + "]";
	}
}

