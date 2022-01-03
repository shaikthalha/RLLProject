package com.java.cms;

public class Restaurent {

	private int restaurentId  ;
	private String restaurentName;
	private String restaurentCity;
	private String restaurentBranch;
	private String restaurentEmailId;
	private String restaurentContact;

	
	
	public int getrestaurentId () {
		return restaurentId ;
	}
	public void setrestaurentId (int restaurentId ) {
		this.restaurentId  =restaurentId ;
	}
	public String getrestaurentName() {
		return restaurentName;
	}
	public void setrestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}
	public String getrestaurentCity() {
		return restaurentCity;
	}
	public void setrestaurentCity(String restaurentCity) {
		this.restaurentCity = restaurentCity;
	}
	public String getrestaurentBranch() {
		return restaurentBranch;
	}
	public void setrestaurentBranch(String restaurentBranch) {
		this.restaurentBranch = restaurentBranch;
	}
	public String getrestaurentEmailId() {
		return restaurentEmailId;
	}
	public void setrestaurentEmailId(String restaurentEmailId) {
		this.restaurentEmailId =restaurentEmailId;
	}
	
	public String getrestaurentContact() {
		return restaurentContact;
	}
	public void setrestaurentContact(String restaurentContact) {
		this.restaurentContact=restaurentContact;
	}
	
	@Override
	public String toString() {
		return "Restaurent [restaurentId =" + restaurentId  + ",restaurentName="+restaurentName+", restaurentCity=" + restaurentCity+ ", restaurentBranch="
				+ restaurentBranch + ", restaurentEmailId=" + restaurentEmailId +", restaurentContact=" + restaurentContact
				+ "]";
	}
	
	
}
