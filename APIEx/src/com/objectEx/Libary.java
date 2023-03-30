package com.objectEx;

public class Libary {
	// 책 리스트 배열
	private Book[] bookArry = new Book[5];

	// 책 리스트를 추가하는 메소드
	public void addBook() {
		bookArry[0] = new Book("혼공자", "신용권");
		bookArry[1] = new Book("자바정석", "유재석");
		bookArry[2] = new Book("이것이자바", "안유진");
		bookArry[3] = new Book("할수있다", "메뚜기");
		bookArry[4] = new Book("도전", "덕구");
	}
	
	@Override
	public String toString() {	  // Object가 가지고 있는 toString 메소드를 재정의해서 씀
		String str = "";
		for(Book b : bookArry) {
			//str += b.getTitle() + " " + b.getAuthor() + "\n";
			str += b.toString()+ "\n";
		}
		return str;
	}
}


		
	

