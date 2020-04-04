package com.hagd.vo;

public class ReviewVO {

	private int idx;
	private String content;
	private int buyer_idx;
	private int score;
	
	
	//»ý¼ºÀÚ
	public ReviewVO() {
		super();
	}

	
	//getter setter
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBuyer_idx() {
		return buyer_idx;
	}

	public void setBuyer_idx(int buyer_idx) {
		this.buyer_idx = buyer_idx;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
