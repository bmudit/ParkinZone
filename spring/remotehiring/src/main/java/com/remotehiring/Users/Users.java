package com.remotehiring.Users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id private String email;
	private String fullname;
	private String mobno;
	private String password;
	private String address;

	public Users() {
	}



	public Users(String email, String fullname, String mobno, String address,String password) {
		super();
		this.email = email;
		this.fullname = fullname;
		this.mobno = mobno;
		this.password = password;
		this.address = address;
	}
	

	@Id
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public String getAddress() {
		return address;
	}
		public void setAddress(String address) {
		this.address = address;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
