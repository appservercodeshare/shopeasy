package com.shopeasy.controllers.beans;

import java.util.Set;

public class SubCategory {

	private String subCategoryName;
	private Category category;
	private Set<Product> productSet;

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

	@Override
	public String toString() {
		return "SubCategory [subCategoryName=" + subCategoryName + ", category=" + category + ", productSet="
				+ productSet + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subCategoryName == null) ? 0 : subCategoryName.hashCode());
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
		SubCategory other = (SubCategory) obj;
		if (subCategoryName == null) {
			if (other.subCategoryName != null)
				return false;
		} else if (!subCategoryName.equals(other.subCategoryName))
			return false;
		return true;
	}

}
