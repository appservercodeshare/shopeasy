package com.shopeasy.controllers.beans;

import java.util.LinkedHashSet;
import java.util.Set;

public class Category {

	private String CategoryName;
	private Set<SubCategory> subCategorySet;

	public Category() {
		subCategorySet = new LinkedHashSet<SubCategory>();
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public Set<SubCategory> getSubCategorySet() {
		return subCategorySet;
	}

	public void setSubCategorySet(Set<SubCategory> subCategorySet) {
		this.subCategorySet = subCategorySet;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	/*@Override
	public String toString() {
		return "Category [CategoryName=" + CategoryName + ", subCategorySet=" + subCategorySet + "]";
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CategoryName == null) ? 0 : CategoryName.hashCode());
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
		Category other = (Category) obj;
		if (CategoryName == null) {
			if (other.CategoryName != null)
				return false;
		} else if (!CategoryName.equals(other.CategoryName))
			return false;
		return true;
	}
}
