package com.example.stockMarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="User")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
   @Column
   private String Username;
   
   @Column
   private String Password;
    @Column
    private String UserType;
    @Column
    private String Email;

    @Column
    private String MobileNumber;
    @Column
    private boolean Confirmed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public boolean isConfirmed() {
		return Confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		Confirmed = confirmed;
	}
    
      
}
