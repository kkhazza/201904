package com.java0422;

import com.java0423.Var;

public class Main {

	public void main(String[] a) {
		// TODO Auto-generated method stub
		System.out.println("변수 시작!");
		
		String 문자열 = "Hello World"; // 변수 선언과 대입이 동시에 이루어진거.
	//	String 문자열선언; // 변수 만들기 
	//	문자열선언 = "";   // 변수에 값을 대입 한다.		
		System.out.println(문자열); // 변수 사용		
		문자열 = "문자열 변경"; //값 변경
		System.out.println(문자열); // 변수 사용		
		문자열 = "1234"; //연산		
		System.out.println(문자열); // 변수 사용
		
		int 정수 = 1;
		System.out.println(정수);
		
		String 결과값 = 문자열 + (정수 + 정수 + 정수) ;
		System.out.println(결과값);
		
		
		Var v = new Var();
		int s = v.state1;
				

	}

}
