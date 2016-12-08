package com.shopeasy.persistences.beans;

import org.springframework.web.multipart.MultipartFile;

public class UploadProductsBean {

	private MultipartFile multipartFile;

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

	@Override
	public String toString() {
		return "UploadProductsBean [multipartFile=" + multipartFile + "]";
	}

}
