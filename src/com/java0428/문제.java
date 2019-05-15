package com.java0428;

import java.util.Scanner;

public class 문제 {
	
	int[][] 맵 = {
			{0,0,0,0,0,0,0},
			{1,1,1,1,1,1,0},
			{0,1,0,0,0,2,0},
			{0,1,0,1,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,3,1,1,1,1},
			{0,0,0,0,0,0,0}				
	};

	public boolean q1(int aX, int aY, int bX, int bY) {
		boolean result = false; 

		for(int y = 0; y < 맵.length; y++) {		
			for(int x = 0; x < 맵[y].length; x++) { 				
				if(aX < 0 || aX > 6 || 맵[aY][aX] == 0 || 맵[aY][aX] == 3) {
					aY = bY;
					aX = bX;
					result = true;
				}

				if(y == aY && x == aX) {
					System.out.print("→ ");
				} else if(맵[y][x] == 2) {
					System.out.print("＠ ");
				} else if(맵[y][x] == 3) {
					System.out.print("▒ ");
				} else if(맵[y][x] == 1){
					System.out.print("□ ");
				} else {
					System.out.print("■ ");
				}
			}

			System.out.println();
		}
			return result;	
	}

	public void q2() {
		Scanner scan = new Scanner(System.in);
		int aX = 0;
		int aY = 1;
		int bX = 0;
		int bY = 1;
		
		q1(aX, aY, bX, bY); // 시작을 위하여 필요한 호출 부분
		while(true) {
			String input = scan.next();
			System.out.println(input.toUpperCase());
						
			if(aX == 5 && aY == 2) {
				맵[2][5] = 1;
				맵[5][2] = 1;
			}
			if(aX == 3 && aY == 3) {
				aX = 0; aY = 1;
				bX = 0; bY = 1;
			}
			if(aX == 6 && aY == 5) {
				break;
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