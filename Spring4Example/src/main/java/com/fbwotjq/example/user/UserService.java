package com.fbwotjq.example.user;

public interface UserService {
	
	/**
	 * 사용자 가입시에 사용자 정보를 넣는다.
	 * @param user
	 */
	public void inserUser(User user);
	
	/**
	 * 개인정보 변경 및 어드민에서 사용자 정보 변경시 사용하는 메소드 
	 * @param user
	 * @return
	 */
	public int updateUser(User user);

}
