package cateringservicesdemo;

public class User {
	private int userId;	
	private int loyaltyPoints;
	private String discount;
	
	public int getuserId() {
		return userId;
	}
	public void setuserId(int userId) {
		this.userId = userId;
	}
	
	public int getloyaltyPoints() {
		return loyaltyPoints;
	}
	public void setloyaltyPoints(int loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}
	public String getdiscount() {
		return discount;
	}
	public void setdiscount(String discount) {
		this.discount = discount;
	}
}
