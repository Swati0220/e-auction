package com.org.wf.auction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class SellerRequest {
	
	private long id;
	private String productName;
	private String shortDescription;
	private String detailedDescription;
	private String category;
	private String startingPrice;
	private String bidEndDate;
	
	private PersonalInformation personalInformation;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the detailedDescription
	 */
	public String getDetailedDescription() {
		return detailedDescription;
	}

	/**
	 * @param detailedDescription the detailedDescription to set
	 */
	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the startingPrice
	 */
	public String getStartingPrice() {
		return startingPrice;
	}

	/**
	 * @param startingPrice the startingPrice to set
	 */
	public void setStartingPrice(String startingPrice) {
		this.startingPrice = startingPrice;
	}

	/**
	 * @return the bidEndDate
	 */
	public String getBidEndDate() {
		return bidEndDate;
	}

	/**
	 * @param bidEndDate the bidEndDate to set
	 */
	public void setBidEndDate(String bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	/**
	 * @return the personalInformation
	 */
	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	/**
	 * @param personalInformation the personalInformation to set
	 */
	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}
	
	
	
	
}
