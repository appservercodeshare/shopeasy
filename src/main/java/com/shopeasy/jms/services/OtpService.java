package com.shopeasy.jms.services;

public class OtpService {

	public static Integer getNewOTP(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
}
