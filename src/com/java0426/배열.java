package com.java0426;

public class 배열 {
	
	public void t1() {
		int a;    // 변수 선언
		int[] aa; // 배열 선언
		
		a = 1;
		
		aa = new int[5]; // 배열 생성 및 크기 설정
		aa[0] = 1 ;      // 배열 특정 위치에 값 담기
		
		int[] bb = new int[2];
		bb[0] = 0;
		bb[1] = 1;
		
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println(bb);
		
		System.out.println(aa[0]); // 배열 특정 위치 값 사용
		System.out.println(bb[0]);
		System.out.println(bb[1]);
	}
	
	public void t2() {
		int[] one단 = new int[9];
		one단[0] = (1 * 1);
		one단[1] = (1 * 2);
		one단[2] = (1 * 3);
		one단[3] = (1 * 4);
		one단[4] = (1 * 5);
		one단[5] = (1 * 6);
		one단[6] = (1 * 7);
		one단[7] = (1 * 8);
		one단[8] = (1 * 9);
		// [1, 2, 3, 4, 5, 6, 7, 8, 9]
		//  0  1  2  3  4  5  6  7  8   << 위치값(인덱스)
		
		System.out.println("1 x 5 = " + one단[4]);
	}
	
	public void t3() {
		int[] 단 = new int[9];
		for(int i = 1; i <= 9; i++) { // 정수 배열에 값 담기 반복문 실행
			int 값 = (1 * i);
			int index = (i - 1); // 0, 1, 2, 3, 4, 5, 6, 7, 8
			단[index] = 값;		
		}
		
		for(int i = 0; i < 단.length; i++) {
			int 수 = (i + 1);
			System.out.println("1 * " + 수 + " = " + 단[i]);
		}
	}
	
	public void t4() {
		String[] 요일 = new String[7];
		요일[0] = "일";
		요일[1] = "월";
		요일[2] = "화";
		요일[3] = "수";
		요일[4] = "목";
		요일[5] = "금";
		요일[6] = "토";
		
		// 일 > 화 > 목 > 토
		
		for(int i = 0; i < 요일.length; i = i + 2) { // 4
			System.out.println(요일[i]);
		}
		
		for(int i = 0; i < 요일.length; i++) { // 7
			if(i % 2 ==0) {
				System.out.println(요일[i]);
			}			
		}
	}
	
	public void t5() {
		int[][] 빙고 = new int[5][5];
		빙고[0][0] = 5;
		빙고[0][1] = 3;
		빙고[1][2] = 1;
		
		for(int i = 0; i < 빙고.length; i++) {
			for(int j = 0; j < 빙고[i].length; j++) {
				System.out.print(빙고[i][j]);
			}
			System.out.println();
		}
	}
	public void t6() {
		String [][] 요일 = new String[7][5];
		int i = 0;
		int j = 0;
		// 1. 현재 달의 달력 데이터를 요일 배열에 데이터를 담아보세요.
		// 2. 출력 오늘 요일을 표현 할것.				
	
		for(; i < 요일.length; i++) {			
			for(; j <요일[i].length; j++) {	
				요일[0][j] = "월";
				요일[1][j] = "화";
				요일[2][j] = "수";
				요일[3][j] = "목";
				요일[4][j] = "금";
				요일[5][j] = "토";				
				요일[6][j] = "일";				
			}					
		} 
		
		for(int d = 1; d < 31; d++) {
			System.out.print(d);
		}
		
	}
}
