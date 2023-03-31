package com.objectEx;

public class Key {
	public int number;
	// public String str;
	
	public Key(int number) {
		this.number = number;	
	}
	//해시코드를 오버라이딩 왜 하는지 생각 : 동일한 숫자값을 반환할 수 있도록!
	@Override
	public int hashCode() {            //hashCode는 주소값을 가지고 있다 > equals는 그 주소값을 비교한다
		// 객체의 주소값을 숫자로 반환
		// 생성된 객체마다 다른 주소값을 가지고 있다.
		// super.hashCode();
		// str.hashCode();
		return number;
	}
	@Override
	public boolean equals(Object obj) {
		// 매개변수 obj가 key로 형변환 가능한지 확인
		if(obj instanceof Key) {
			Key key = (Key) obj;
			if(this.number == key.number);
			return true;
		}
		// 가능하면 형변환, number값 비교 
		//가능하지 않다면 false리턴
		return false;
//		return super.equals(obj);
	}
}
