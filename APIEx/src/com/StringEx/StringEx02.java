package com.StringEx;

public class StringEx02 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		// .indexOf : 매개값의 문자열을 포함여부를 확인
		// 포함 : 시작인덱스값을 반환
		// 미포함 : -1 반환
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("C"));
		
		//메소드를 여러개 쓰는 경우가 더 많음
		// substring과 함께 사용될 수 있다
		System.out.println(str.substring(str.indexOf("프로")));
		
		if(str.indexOf("자바") > 0) {
			System.out.println("자바 관련 책!");
		} else {
			System.out.println("자바와 관련 없음");
		}
		// .length() : 문자의 길이를 반환
		//뭘 할 수 있을까? => id의 길이는 5자 이상이어여 합니다.
		String id = "id";
		if(id.length()<5) {
			System.out.println("아이디는 5자 이상 14자 이하로 작성가능합니다.");
		}
		String ssn = "1234561234567";
		if(ssn.length() !=14) {
			System.out.println("주민등록번호를 정확히 입력해주세요.");
		}
		// .substring : 원하는 문자열을 추출
		// 시작인덱스 포함, 끝인덱스 미포함
		System.out.println("주민등록번호 앞자리 : " + ssn.substring(0,6));
		System.out.println("주민등록번호 뒷자리 : " + ssn.substring(6));
		
		//.replace : 문자교체
		str = "자바는 객체지향 언어 입니다. 자바를 자바봅시다";
		String newStr = (str.replace("자바", "java"));
		System.out.println(newStr);
		
		// 대소문자 교체
		// .toUpperCase() : 대문자로 변경
		// .toLowerCase() : 소문자로 변경
		str = "Java Programe Language";
		System.out.println("대문자로 변경 : " + str.toUpperCase());
		System.out.println("소문자로 변경 : " + str.toLowerCase());
		
		// .equalsIgnoreCase : 대소문자 구분하지 않고 비교
		str = "q";
		System.out.println(str.equalsIgnoreCase("Q"));
		System.out.println(str.equalsIgnoreCase("q"));
		
		// .trim() : 공백을 제거
		id = "     id     ";
		System.out.println(id);
		System.out.println(id.trim());
		
		// .valueOf() : 기본타입을 문자열로 변경
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.5));
		System.out.println(String.valueOf(true));
		
		
	}
}








