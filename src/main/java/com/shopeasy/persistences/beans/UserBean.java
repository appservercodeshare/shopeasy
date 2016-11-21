package com.shopeasy.persistences.beans;

public class UserBean {

	private String username;
	private String password;
	private String repassword;
	private String email;
	private String mobileNumber;
	private String locality;
	private Integer otp;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "UserBean [username=" + username + ", password=" + password 
				+ ", repassword=" + repassword + ", email=" + email + ", mobileNumber=" 
				+ mobileNumber + ", locality=" + locality + ", otp=" + otp + "]";
	}

}
