package com.hagd.vo;

public class MessageVO {

	private int idx;
	private int seller_idx;
	private int buyer_idx;
	private int board_idx;
	private String date;
	private String content;
	private int status;
	
	
	//»ı¼ºÀÚ
	public MessageVO() {
		super();
	}
	
	
	//getter setter
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getSeller_idx() {
		return seller_idx;
	}
	public void setSeller_idx(int seller_idx) {
		this.seller_idx = seller_idx;
	}
	public int getBuyer_idx() {
		return buyer_idx;
	}
	public void setBuyer_idx(int buyer_idx) {
		this.buyer_idx = buyer_idx;
	}
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
