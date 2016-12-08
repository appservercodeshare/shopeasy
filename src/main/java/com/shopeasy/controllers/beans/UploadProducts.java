package com.shopeasy.controllers.beans;

import org.springframework.web.multipart.MultipartFile;

public class UploadProducts {

	private MultipartFile multipartFile;

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

	@Override
	public String toString() {
		return "UploadProducts [multipartFile=" + multipartFile + "]";
	}

}
