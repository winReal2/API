package com.arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// List 인터페이스 , ArrayList 구현체
		// <타입>
		List<String> list = new ArrayList<>();
		
		//.add : 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("myBATIS");
		list.add(2, "Database");    //방번호 자연스럽게 생성
		
		//.remove : 삭제
		list.remove(1);    // 1번방에 있는 JDBC 삭제됨 (자동으로 뒷번호들이 떙겨옴)
		
		//.set : 변경
		list.set(2, "oracle");

		//리스트에 저장된 총 개수
		int size = list.size();
		System.out.println("총 개수 : " + size);
		
		//.get으로 리스트에 저장된 객체 얻기
		// 인덱스는 0부터 시작한다
		String str = list.get(2);
		System.out.println("2번 인덱스 : " + str);
		
		for(int i=0; i < list.size();i++) {
			str = list.get(i);
			System.out.println(i + " : " + str);
		}
		int i = 0;
		for(String s : list) {
			System.out.println(i + " : " + s);
			i++;
		}
	}
}



