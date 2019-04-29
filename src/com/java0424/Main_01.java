package com.java0424;

import java.util.Scanner;

public class Main_01 {
	
	public void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int a = scan.nextInt();
		
		정수 MP = new 정수();
		
		String msg = MP.i1(a);
		System.out.println("결과는 : " + msg);

		scan.close();
	}

}
