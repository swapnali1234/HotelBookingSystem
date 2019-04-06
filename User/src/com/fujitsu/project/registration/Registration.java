package com.fujitsu.project.registration;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Registration {
	
	@Column(length=10,nullable=false)
	private String confirmPassword;
	
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	
	public Registration(String confirmPassword) {
		super();
		this.confirmPassword = confirmPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	

}
