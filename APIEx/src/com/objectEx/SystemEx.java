package com.objectEx;

public class SystemEx {
	
	public static void main(String[] args) throws InterruptedException {
		// 수행시간 구하기  (1/1000초를 구합니다)
		// currentTimeMillis의 반환타입(long)을 앞에 적어주기
		Long startTime = System.currentTimeMillis();
		
		// System에 속해있는 여러 메소드
		// System.in;
		// System.out;
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum+=i;
			if(i==4) {
				System.exit(0);  // JVM 강제 종료
			}
			// 1초 대기
			Thread.sleep(1000); // 1초씩 기다려주는거에요
		}
		
		System.out.println("총 합계 : " + sum);
		
		Long endTime = System.currentTimeMillis();
		long res = (endTime - startTime)/1000;
		System.out.println(res + "초 소요되었습니다.");
	}
}
