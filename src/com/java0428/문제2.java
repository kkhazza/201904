package com.java0428;

import java.util.Scanner;

public class 문제2 {
	
	int[][] 맵 = {
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,1,0,0},
			{0,1,1,1,0},
			{0,0,1,0,0},
			{0,0,0,0,0}			
	};
	
	public boolean q1(int aX, int aY, int bX, int bY) {
		boolean result = false;
		
		for(int y = 0; y < 맵.length; y++) {
			for(int x = 0; x < 맵[y].length; x++) {
				if (y == aY && x == aX) {
					System.out.print(" ＠ ");
				} else if (맵[y][x] == 1) {
					System.out.print(" ■ ");
				} else {
					System.out.print(" □ ");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void q2() {
		Scanner scan = new Scanner(System.in);
		int aX = 4;
		int aY = 0;
		int bX = 4;
		int bY = 0;
		
		q1(aX, aY, bX, bY);
		while(true) {
			String input = scan.next();
			String ans = scan.next();
			System.out.println(input.toUpperCase());
			
			if(aX == 2 && aY == 3) {
				System.out.print("정답을 입력하시오 > ");
				if(ans.equals("정답")) {
					System.out.println("명중");
					break;
				} else {
					System.out.print("틀렸습니다");
				}
				
			}
			
			switch(input.toUpperCase()) {
			case "W": // 위쪽
				aY--;
				break;
			case "S": // 아래쪽
				aY++;	
				break;
			case "A": // 왼쪽
				aX--;
				break;
			case "D": // 오른쪽
				aX++;
				break;
			default:
				break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);			
			if(q1(aX, aY, bX, bY)) { // 이동을 위하여 호출 부분
				aX = bX;
				aY = bY;
			} else {
				bX = aX;
				bY = aY;
			}			
		}
	}

}