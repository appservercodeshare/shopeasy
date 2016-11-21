package com.shopeasy.persistences.beans;

public class RegistrationBean {

	private String mobileNumber;
	private Integer otp;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "RegistrationBean [mobileNumber=" + mobileNumber + ", otp=" + otp + "]";
	}

}
