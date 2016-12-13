package com.shopeasy.controllers.beans;

import java.util.LinkedHashSet;
import java.util.Set;

public class SubCategory {

	private String subCategoryName;
	private Category category;
	private Set<Product> productSet;

	
	
	public SubCategory() {
		productSet = new LinkedHashSet<Product>();
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Product> getProductSet() {
		return productSet;
	}

	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}

	/*@Override
	public String toString() {
		return "SubCategory [subCategoryName=" + subCategoryName
				+ ", category=" + category + ", productSet=" + productSet + "]";
	}*/

}
