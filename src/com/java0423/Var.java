package com.java0423;

public class Var {
	
	public Var() {
		var();
	} // 기본 생성자
	
//  리턴유형   함수명(매개변수) 	   로직 구현
//	void   var ()         {}
	public void var() {
		/***********************************************
		 * 변수 사용법 
		 * 1. 변수 선언
		 * 2. 변수에 데이터 대입 (값 담기)
		 * 3. 변수 사용
		 ***********************************************/
		int a; // 1
		a = 1; // 2
		System.out.println(a); // 3
		
		int b = 2; // 1, 2
		System.out.println(b); // 3
		
		int c, d, e; // 1
		c = a;       // 2    
		d = b;		 // 2
		e = c + d;	 // 2
		System.out.println(e); // 3
		
		int f;
		f = a;
		System.out.println(f);
		
		a = 10;
		System.out.println(a);
		System.out.println(f); 
		

	}

}
