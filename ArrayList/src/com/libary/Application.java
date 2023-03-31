package com.libary;

public class Application {
	public static void main(String[] args) {
		Libary lib = new Libary();
		
		//책 추가
		lib.addBook("책1", "지은이1");
		lib.addBook("책2", "지은이2");
		lib.addBook("책3", "지은이3");
		
		//책 정보 출력
		lib.toString();
		
		System.out.println("삭제할 책 번호를 선택해주세요.");
		int i = 0;
		
		//책 삭제
		lib.removeBook(i);
		
		//책 정보 출력
		lib.toString();
		
		// 책이 대여된다는 것은 book.isRent값이 true로 변한다는 뜻
		// = 책대여 : book.isRent = true
		System.out.println("대여할 책 번호를 선택해주세요.");
		i=0;
		lib.updateBook(i);
		
		//책 정보 출력
		lib.toString();
		
		// 검증 : 책 목록의 사이즈보다 큰 값이 입력되었을 때 다시 입력받을 수 있도록
		
	} 
	
}
