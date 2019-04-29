package com.java0423;

public class Calculator {
	

	public void main(String[] args) {
		/********************************************** 
		 * 문제) 변수와 메소드를 이용하여 계산기를 만든다.
		 * -계산기 : 두개의 숫자를 이용하여 연산
		 * 덧셈 : int a, int b > a + b; > 결과 리턴 
		 **********************************************/
		
		Calculator c = new Calculator();
		System.out.println(c.sum(5, 3)); //8
		System.out.println(c.sub(5, 3));
		System.out.println(c.div(5, 3));
		System.out.println(c.mul(5, 3));
	}
	    int sum(int a, int b) {
		return a + b;
	}
	    int sub(int a, int b) {
			return a - b;
		}
	    float div(int a, int b) {
			return a / b;
		}
	    float mul(int a, int b) {
			return a * b;
		}
}