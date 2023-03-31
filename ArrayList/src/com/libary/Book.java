package com.libary;

public class Book {
	private String title;      //책제목
	private String author;     //작가
	private boolean isRent = false;    //대여여부  / 어차피 false라 생성자 안만들어도 되지만 해주고 싶다면
	
	@Override
	public String toString() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}
		return getTitle() + "/" + getAuthor() + "/" + str;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
}
