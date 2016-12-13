package com.shopeasy.controllers.beans;

import java.util.Arrays;

public class Product {

	private String productBrand;
	private String productName;
	private Double price;
	private Double mrp;
	private String measureMentUnit;
	private Integer quantity;
	private Boolean hasType;
	private String images;
	private SubCategory subCategory;

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

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

	public String getMeasureMentUnit() {
		return measureMentUnit;
	}

	public void setMeasureMentUnit(String measureMentUnit) {
		this.measureMentUnit = measureMentUnit;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getHasType() {
		return hasType;
	}

	public void setHasType(Boolean hasType) {
		this.hasType = hasType;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	@Override
	public String toString() {
		return "Product [productBrand=" + productBrand + ", productName=" + productName + ", price=" + price + ", mrp="
				+ mrp + ", measureMentUnit=" + measureMentUnit + ", quantity=" + quantity + ", hasType=" + hasType
				+ ", images=" + images + ", subCategory=" + subCategory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productBrand == null) ? 0 : productBrand.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productBrand == null) {
			if (other.productBrand != null)
				return false;
		} else if (!productBrand.equals(other.productBrand))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}

}
