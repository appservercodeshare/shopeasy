package com.shopeasy.controllers.beans;

public class Product {

	private String productName;
	private Double price;
	private Double mrp;
	private Integer maxUnit;
	private Integer minUnit;
	private String measurementInUnit;
	private Boolean hasType;
	private String image;
	private SubCategory subCategory;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public Integer getMaxUnit() {
		return maxUnit;
	}

	public void setMaxUnit(Integer maxUnit) {
		this.maxUnit = maxUnit;
	}

	public Integer getMinUnit() {
		return minUnit;
	}

	public void setMinUnit(Integer minUnit) {
		this.minUnit = minUnit;
	}

	public String getMeasurementInUnit() {
		return measurementInUnit;
	}

	public void setMeasurementInUnit(String measurementInUnit) {
		this.measurementInUnit = measurementInUnit;
	}

	public Boolean getHasType() {
		return hasType;
	}

	public void setHasType(Boolean hasType) {
		this.hasType = hasType;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price
				+ ", mrp=" + mrp + ", maxUnit=" + maxUnit + ", minUnit="
				+ minUnit + ", measurementInUnit=" + measurementInUnit
				+ ", hasType=" + hasType + ", image=" + image
				+ ", subCategory=" + subCategory + "]";
	}

}
