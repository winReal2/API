package com.wrapperEx;

public class WrapperEx {
	public static void main(String[] args) {
		// 박싱 : 기본타입이 => 참조타입으로
		// 자동형변환
		Integer obj1 = new Integer(100);  //줄 가있는거는 "되도록 쓰지마~"
		Integer obj3 = new Integer("300");
		Integer obj2 = 100;
		Integer obj4 = Integer.valueOf("300");
		
		System.out.println("Integer : 박싱");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		// 언박싱 : 참조타입이 => 기본타입으로
		// 강제형변환
		int int1 = obj1.intValue();
		int int2 = (int)obj1;
		
		// 연산시에는 자동형변환!
		int int3 = obj4 + 100;  // 자동 언박싱
		System.out.println("int : 언박싱");
		System.out.println(int1);
		System.out.println(int2);
		
		// 포장값의 비교
		// -128 ~ 127 범위 초과시
		Integer obj_integer1 =300;
		Integer obj_integer2 =300;
		System.out.println("비교 결과 : " + (obj_integer1 == obj_integer2));
		System.out.println("비교 결과 : " + obj_integer1.equals(obj_integer2));
		System.out.println("비교 결과 : " + (obj_integer1.intValue() == obj_integer2.intValue()));
		
		// -128 ~ 127 (1바이트) 내의 범위라면 (==) 이용시에도 같음!
		obj_integer1 =100;
		obj_integer2 =100;
		System.out.println("비교 결과 : " + (obj_integer1 == obj_integer2));
		System.out.println("비교 결과 : " + obj_integer1.equals(obj_integer2));
		System.out.println("비교 결과 : " + (obj_integer1.intValue() == obj_integer2.intValue()));
	}
}
