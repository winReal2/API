package com.mathEx;

public class MathEx {

	public static void main(String[] args) {
		//Math클래스의 메소드들!
		
		//abs : 절대값
		int i = Math.abs(-5);
		double d = Math.abs(-5.123);
		System.out.println("절대값 : " + i);
		System.out.println("절대값 : " + d);
		
		// .floor : 소수점 내림
		// .ceil : 소수점 올림
		// .round : 반올림
		System.out.println("소수점 내림 : " + Math.floor(d));
		System.out.println("소수점 올림 : " + Math.ceil(d));
		System.out.println("반올림 : " + Math.round(d));

		// .max : 최대값
		// .min : 최소값
		System.out.println("최대값 : " + Math.max(5.3, 2.5));
		System.out.println("최소값 : " + Math.min(5, 9));
		
		
	}
}
