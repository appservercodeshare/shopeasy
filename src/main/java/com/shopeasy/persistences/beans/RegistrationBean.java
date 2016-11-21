package com.shopeasy.persistences.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGISTRATIONS")
public class RegistrationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9109976178408123719L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REGISTRATION_ID")
	private Long registrationId;
	
	@Column(name = "MOBIBLE_NUMBER")
	private String mobileNumber;
	
	@Column(name = "OTP")
	private Integer otp;

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

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
		return "RegistrationBean [registrationId=" + registrationId
				+ ", mobileNumber=" + mobileNumber + ", otp=" + otp + "]";
	}

}
