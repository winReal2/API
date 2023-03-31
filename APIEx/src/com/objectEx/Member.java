package com.objectEx;

public class Member {
	public static void main(String[] args) {
		//멤버가 가지고 있는 해시코드
		Member mem1 = new Member("id");
		
		System.out.println("========================");
		/**
		 * hashCode()
		 *  : 객체를 식별하는 하나의 정수값
		 *  Object클래스의 객체 해시코드 메소드는 객체메모리 번지를 이용하여
		 *  해시코드를 만들어 리턴합니다
		 *  ==> 객체마다 다른 값을 가집니다.
		 *  
		 *  두 객제가 동등한지 비교하는데 사용됨. 
		 */
		
		Object obj = new Object();
		
		System.out.println(mem1.hashCode());
		//숫자를 16진수로 변환  (인티저의 메소드) / toHexString(정적멤버임)
		//16진수는 10을 넘어가는 수는 문자로 표현
		String str = Integer.toHexString(mem1.hashCode());
		
		System.out.println("hashCode() 16진수로 변환" + str);
		System.out.println(mem1.toString());
		System.out.println("========================");
		
		
		
		
		
	//	Member mem1 = new Member("id");
		Member mem2 = new Member("id");
		// .equals : 두 객체를 비교합니다.
		System.out.println("mem1.equals(mem2) : ");
		System.out.println(mem1.equals(mem2));
	}
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	/**
	 * this(Member 객체)가 가지고 있는 id값과
	 * 매개변수로 받은 Object의 id값이 일치하는지 비교
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
				System.out.println("object.equals() 결과 : "+super.equals(obj));
				System.out.println("Member.equals() 결과 : "+getId().equals(member.id));

				// 객체가 가지고 있는 id 값이 같다면 true라고 리턴하고 싶음
				if(getId().equals(member.id)) {
				return true;
			} else {
				return false;
			}
			}
		return false;
		}
	
//if(this.id == ((Member)obj). getId()) {
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
