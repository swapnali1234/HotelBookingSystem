package com.fujitsu.project.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fujitsu.project.registration.Registration;

@Entity
@Table(name="USERS")
 public class User
 {
	 @Id
	 @GeneratedValue
	 @Column(name="USER_ID",length=10)
	  private int userId;
	 
	 @Column(length=20,nullable=false,unique=true)
	 private String userName;
	 
	 @Column(length=10,nullable=false)
	 private String passsword;
	 
	 @Column(length=10,nullable=false)
	 private String role;
	 
	 private Registration registration;
	 
	 public User() {
		// TODO Auto-generated constructor stub
		 registration = new Registration();
	}

	 	
	 
	public User(int userId, String userName, String passsword, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passsword = passsword;
		this.role = role;
		this.registration=registration;
		}
	


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPasssword() {
		return passsword;
	}


	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	

	public Registration getRegistration() {
		return registration;
	}



	public void setRegistration(Registration registration) {
		this.registration = registration;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", passsword=" + passsword + ", role=" + role
				+ ", registration=" + registration + "]";
	}



	
	 
	 
	 
	 
 }

	


