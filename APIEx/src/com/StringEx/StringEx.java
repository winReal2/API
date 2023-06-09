package com.StringEx;

import java.io.UnsupportedEncodingException;

public class StringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "hello";
		// str객체가 가지고 있는 값을 byte[]로 반환
		byte[] byteArry = str.getBytes();
		byte[] byteArry2 = {67, 68, 69};
		
		//byte배열을 String문자열로 변환
		// 시작인덱스, 갯수  (갯수 오버하면 StringIndexOutOfBoundsException 예외나옴)
		String str1 = new String(byteArry,2,3);
		String str2 = new String(byteArry2);
		
		System.out.println(str1);
		System.out.println(str2);

		// 실습파일 열었을때 문자가 깨졌던 현상 
		// 문자코드가 일치하지 않는 경우 꺠질 수 있습니다.
		// euc-kr, ms949 2바이트 사용 (한글표현시)
		// utf-8         3바이트 사용 (한글표현시)
		String str3 = "반갑습니다. 오늘도 힘내세요";
		byte[] b = str3.getBytes("euc-kr");
		String s_euckr = new String(b,"euc-kr"); 
		String s = new String(b); 
		
		System.out.println(s_euckr);
		System.out.println(s);
	}
}
