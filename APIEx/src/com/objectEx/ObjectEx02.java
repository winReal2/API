package com.objectEx;

import java.util.HashMap;

public class ObjectEx02 {
	public static void main(String[] args) {
		/**
		 *         타입     타입
		 * HashMap(key값, Value값 저장) hashMap = new HashMap<>();
		 * HashMap<String, String> hashMap = new HashMap<>(); => HashMap 선언부
		 * hashMap.put("키", "value") => .put을 적고 값을 적어줌, 키값은 동일할 수 없고 동일하면 덮어쓰기함
		 * 다시말해, 동일한 키가 저장될 수 없고,
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 * 1   홍길동
		 * 2   유재석
		 * 3   이수지
		 * 
		 */
		//<  >로 타입지정하는것을 제네릭이라고 함
		HashMap<String, String> hashMap = new HashMap<>();
		// 데이터를 담는 방법
		hashMap.put("양념", "간장");
		hashMap.put("양념1", "소금");
		hashMap.put(new String ("양념2"), "참기름");
		
		// 데이터를 꺼내는 방법 (꺼낼때는 키값만 주면됨)
		String str = hashMap.get("양념");
		System.out.println("key : " + str);
		System.out.println("key1 : " + hashMap.get("양념1"));
		System.out.println("key2 : " + hashMap.get("양념2"));
		
		HashMap<Integer , String> hashMap1 = new HashMap<>();
		hashMap1.put(1, "홍길동");
		hashMap1.put(2, "나잘난");
		hashMap1.put(3, "너잘난");
		
		System.out.println("=====================");
		System.out.println(hashMap1.get(1));
		System.out.println(hashMap1.get(2));
		System.out.println(hashMap1.get(3));
		System.out.println("=====================");
	}
}










