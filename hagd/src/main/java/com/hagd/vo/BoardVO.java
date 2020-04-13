package com.hagd.vo;

public class BoardVO {

	private int idx;
	private int user_idx;
	private String title;
	private String content;
	private String img;
	private String date;
	private String intro;
	private int min_quantity;
	private int min_price;
	private int user_status;
	private int hit;
	
	





	//������
	public BoardVO() {
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public int getMin_quantity() {
		return min_quantity;
	}
	public void setMin_quantity(int min_quantity) {
		this.min_quantity = min_quantity;
	}
	public int getMin_price() {
		return min_price;
	}
	public void setMin_price(int min_price) {
		this.min_price = min_price;
	}
	public int getUser_status() {
		return user_status;
	}

	public void setUser_status(int user_status) {
		this.user_status = user_status;
	}

	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
