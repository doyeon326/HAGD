package com.hagd.vo;

public class UsersVO {

	private int idx;
	private String id;
	private String pw;
	private String email;
	private String phone;
	private int user_status;

	
	// ������
	public UsersVO() {
		super();
	}

	
	// getter setter
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getUser_status() {
		return user_status;
	}


	public void setUser_status(int user_status) {
		this.user_status = user_status;
	}


}
