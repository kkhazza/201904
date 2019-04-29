package com.java0424;

import java.util.Scanner;

public class Main2 {

	public void main(String[] args) {
		조건문 t = new 조건문();
		t.t1(11);
		
		boolean r = t.t2(10);
		System.out.println(r);
		
		int i = t.t3(1, 5);
		System.out.println(i);
		
		int ii = t.t4(1, 5);
		System.out.println(ii);
		
		String msg = t.t5(1, 5);
		System.out.println(msg);
		
		String msg2 = t.t6(1, 5);
		System.out.println(msg2);
		
		String msg3 = t.t7(1, 5);
		System.out.println(msg3);
		
		String msg4 = t.t8(1);
		System.out.println(msg4);
		
		String msg5 = t.t9(2);
		System.out.println(msg5);
		
		
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in); // Console 창에서 입력값 받는 객체 생성
		String msg6 = t.t10(scan.nextInt());   // Console 창에서 입력 받은 정수를 인자값으로 사용
		scan.close();                          // Scanner 객체 종료(삭제)
		System.out.println(msg6);
	}

}
