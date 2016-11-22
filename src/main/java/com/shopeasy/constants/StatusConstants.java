package com.shopeasy.constants;

public enum StatusConstants {

	INVALID_LOGIN(601, "601", "Login Failed"), 
	SIGNUP_FAILED(602, "602", "Signup Failed"), 
	REGISTRATION_FAILED(603, "603", "Registration Failed"),
	INVALID_OTP(604, "604", "Invalid Otp"),
	DB_OPERATION_FAILED(605, "605", "DB Operation Failed"),
	DUPLICATE_SIGNUP(605, "605", "Duplicate Signup"), 
	VALID_LOGIN(701, "701", "Valid Login"), 
	SIGNUP_SUCCESS(702, "701", "Signup is Successful"), 
	REGISTRATION_SUCCESS(703, "703", "Registration is Successful"),
	DB_OPERATION_SUCCESS(704, "704", "DB Operation is Successful");

	private Integer status;
	private String statusCode;
	private String description;

	private StatusConstants(Integer status, String statusCode, String description) {
		this.status = status;
		this.statusCode = statusCode;
		this.description = description;
	}

	public Integer getStatus() {
		return status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getDescription() {
		return description;
	}

}
