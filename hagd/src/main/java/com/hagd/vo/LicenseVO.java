package com.hagd.vo;

public class LicenseVO {

	private int idx;
	private int user_idx;
	private String company_name;
	private String rep;
	private String address;
	private String l_num;
	private String category;
	private int status;
	
	
	//»ı¼ºÀÚ
	public LicenseVO() {
		super();
	}
	
	
	//getter setter
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getRep() {
		return rep;
	}
	public void setRep(String rep) {
		this.rep = rep;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getL_num() {
		return l_num;
	}
	public void setL_num(String l_num) {
		this.l_num = l_num;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
