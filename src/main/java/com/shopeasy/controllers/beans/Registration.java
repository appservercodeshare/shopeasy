package com.shopeasy.controllers.beans;

public class Registration {

	private String mobileNumber;
	private String status;
	private Integer otp;
	private String statusDescription;
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	
	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	@Override
	public String toString() {
		return "Registration [mobileNumber=" + mobileNumber + ", status=" 
				+ status + ", otp=" + otp + ", statusDescription=" 
				+ statusDescription + "]";
	}

}
