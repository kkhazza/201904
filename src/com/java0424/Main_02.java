package com.java0424;

import java.util.Scanner;

public class Main_02 {

	public void main(String[] args) {
		
		점수 SC = new 점수();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시험 점수를 입력하세요 : ");
		
		String msg = SC.i2(scan.nextInt());
		System.out.println("결과는 : " + msg);
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(i + "번학생 시험 점수를 입력하세요 : ");
			String msg1 = SC.i2(scan.nextInt());
			System.out.println("결과는 : " + msg1);
			
		}							
		scan.close();
	}

}
