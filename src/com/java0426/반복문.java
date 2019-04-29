package com.java0426;

import java.util.Scanner;

public class 반복문 {
	
	public void lv1() {
		/****************************
		 * 1난이도 (한행에 하나씩)
		 * 1단 > 2단 (순차적으로 출력)
		 ****************************/
		for(int y = 1; y <= 9; y++) {
			System.out.println(y + "단");
			for(int x = 1; x <= 9; x++)
			{
				// 1 * 1 = 1
				System.out.println(y + "x" + x + "=" + (y * x));
			}
			System.out.println();
		}
	}
	
	public void lv2() {
		/****************************
		 * 2난이도 (한행에 3단씩)
		 * 1단 2단 3단 > 4단 5단 6단 > 7단 8단 9단
		 ****************************/
		for(int y = 1; y <= 9; y = y + 3) {
			System.out.print(y + "단" + "\t");
			System.out.print((y+1) + "단" + "\t");
			System.out.print((y+2) + "단" + "\t");
			System.out.println();
			for(int x = 1; x <= 9; x++)
			{
				// 1 * 1 = 1
				System.out.print(y + "x" + x + "=" + (y * x) + "\t");
				System.out.print((y + 1) + "x" + x + "=" + ((y + 1) * x) + "\t");
				System.out.print((y + 2) + "x" + x + "=" + ((y + 2) * x) + "\t");
				System.out.println();
			}
			System.out.println();
		}
	}
		
	public void lv3() {
		/****************************
		 * 3난이도 (한행에 1,4,7 > 2,5,8 > 3,6,9)
		 * 1단 4단 7단 > 2단 5단 8단 > 3단 6단 9단
		 ****************************/	
		for(int y = 1; y <= 3; y++) {
			System.out.print(y + "단" + "\t");
			System.out.print((y + 3)  + "단" + "\t");				
			System.out.print((y + 6) + "단" + "\t");
			System.out.println();
			for(int x = 1; x <= 9; x++)
			{
				// 1 * 1 = 1
				System.out.print(y + "x" + x + "=" + (y * x) + "\t");
				System.out.print((y + 3) + "x" + x + "=" + ((y + 3)  * x) + "\t");
				System.out.print((y + 6) + "x" + x + "=" + ((y + 6) * x) + "\t");
				System.out.println();
			}
			System.out.println();
		}	
	}
	
	public void lv4() {
		Scanner scan = new Scanner(System.in);
		// X축으로 출력 나올 갯수를 입력 받는다.
		System.out.println("X축으로 출력 나올 갯수를 입력 하세요");
		int x축  = scan.nextInt();
		for(int y = 1; y <= 9; y = y + x축) {
			for(int x = 1; x <= 9; x++) {
				for(int 계산 = 0; 계산 < x축; 계산++) {
					System.out.print((y + 계산)+ "x" + x + "=" + ((y + 계산) * x) + "\t");
				}
				System.out.println();
			}	
			System.out.println();
		}
		
		scan.close();
	}
	
	public void lv5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("X축으로 출력 나올 갯수를 입력 하세요");
		int x축  = scan.nextInt();
		System.out.println("Y축으로 출력 나올 갯수를 입력 하세요");
		int y축  = scan.nextInt();
		
		/*************************************************
		 * x축과 y축의 값을 입력 받아 출력하기 단, 출력은 9단까지 표현할것.
		 *************************************************/
		
		for(int y = 1; y <= (y축 * x축); y = y + x축) {
			for(int x = 1; x <= 9; x++ ) {				
				for(int 계산 = 0; 계산 < x축; 계산++) {
					if((y + 계산) > 9) {
						break;
					}
					System.out.print((y + 계산)+ "x" + x + "=" + ((y + 계산) * x) + "\t");
				}
				System.out.println();
			}	
			System.out.println();
		}	
		scan.close();
	}
	
	public void lv6() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i%5 == 0 || j%5 == 0 || i == j || i + j == 10) {
					System.out.print(" ● ");
				} else {
					System.out.print(" ○ ");
				}
			}
			System.out.println();
		}
	}
}
