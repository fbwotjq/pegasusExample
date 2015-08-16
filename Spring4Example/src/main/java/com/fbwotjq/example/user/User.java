package com.fbwotjq.example.user;

/**
 * 페가수스 사용자 정보 VO
 * @author ryu
 */
public class User {

	/** 상용자 번호 */ private int userNumber;
	/** */ private String userId;
	/** */ private String userPassword;
	/** */ private String userName;
	/** */ private String userEmail;
	/** */ private String userPhone;
	/** */ private String userAlias;
	/** */ private String userGrant;
	
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAlias() {
		return userAlias;
	}
	public void setUserAlias(String userAlias) {
		this.userAlias = userAlias;
	}
	public String getUserGrant() {
		return userGrant;
	}
	public void setUserGrant(String userGrant) {
		this.userGrant = userGrant;
	}
	
}
