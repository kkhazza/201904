package com.java0424;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		IfEx ifEx = new IfEx();
		
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); 
		// p 57 
		ifEx.ifEx1(score);
		
		// p 58
		ifEx.ifEx2(score);
		
	}
}