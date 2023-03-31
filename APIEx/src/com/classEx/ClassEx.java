package com.classEx;

public class ClassEx {
	public static void main(String[] args) {
		// Class clazz = Car.class;  //class의 정보를 가져온다
		
//		System.out.println(clazz.getName());
//		System.out.println(clazz.getSimpleName());
//		System.out.println(clazz.getPackageName());
		
		Class clazz;
		try {
			// 해당 경로(패키지를 포함한 클래스이름)에 클래스가 존재할 경우 
			// 클래스를 반환, 없는 경우에는 오류발생
			//clazz = Class.forName("com.classEx.Car2"); <= 오류발생
			
			// 라이브러리가 잘 로드되었는지 확인할때 사용
			clazz = Class.forName("com.classEx.Car");
			
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			
			// 클래스 경로를 활용하여 리소스 절대경로(최상위 디렉토리(C:)까지 가는것)를 얻어오기
			String path = clazz.getResource("photo1.jpg").getPath();
			System.out.println(path);
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 정보를 얻기 실패");
		}
		
	}
}
