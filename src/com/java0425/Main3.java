package com.java0425;

public class Main3 {

	public void main(String[] args) {
		/* 문제) 중첩 for문을 이용하여 구구단을 만들자
		 * 결과) 1난이도 (한행에 하나씩) 2난이도 (한행에 3단씩) 3난이도 (한행에 1, 4, 7 > 2, 5, 8 > 3, 6, 9)
		 * 		1단				 1단     2단    3단	 1단    4단    7단
		 * 		1 * 1 = 1
		 * 		||
		 * 		1 * 9 = 9
		 *		2단
		 * 		||
		 */
		구구단 Mul = new 구구단();
		Mul.m1();
		Mul.m2();
		Mul.m3();

	}

}
