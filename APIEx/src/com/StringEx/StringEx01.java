package com.StringEx;

public class StringEx01 {
	public static void main(String[] args) {
		// 7번째 인덱스의 문자를 체크해서 하나의 문자를 추출하는 방법!
		// 1,3이면 남자, 2, 4이면 여자
		String ssn = "123456-1234567";
		// charAt(7)
		// 해당 인덱스의 문자를 char타입으로 반환
		char c = ssn.charAt(7);
		if(c == '1' || c == '3') {
			System.out.println("남자");
		} else if(c == '2' || c == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println(ssn.charAt(7));
}
}