package com.java0428;

import java.util.Scanner;

public class 문제1 {

	int[][] 맵 = {
	{0,0,0,0,0,0,0,0,0,0},
	{0,1,1,1,1,1,1,1,1,0},
	{0,1,2,0,0,1,1,0,1,0},
	{0,1,1,2,0,1,0,1,1,0},
	{0,1,1,0,2,1,1,0,1,0},
	{0,1,1,0,1,2,0,1,1,0},
	{0,1,0,1,1,0,2,1,1,0},
	{0,1,0,1,0,0,1,2,1,0},
	{0,1,1,1,1,1,1,0,1,0},
	{0,0,0,0,0,0,0,0,0,0},
	};
	
	public boolean q1 (int aX, int aY, int bX, int bY) {
		boolean result = false;
		
		for(int y = 0; y < 맵.length; y++) {
			for(int x = 0; x <맵[y].length; x++) {
				
				if(맵[aY][aX] == 0) {
					aX = bX;
					aY = bY;
					result = true;
				}
				
				if(aY == aX && aY != 8) {
					맵[aY][aX] = 1;
				}
				
				if(y == aY && x == aX) {
					System.out.print(" ㉿ ");
				}else if(맵[y][x] == 2) {
					System.out.print(" ♥ ");					
				}else if(맵[y][x] == 1) {
					System.out.print(" □ ");
				}else {
					System.out.print(" ■ ");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void q2() {
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		
		q1(aX, aY, bX, bY);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String input = scan.next();
			System.out.print(input.toUpperCase());
			int heart = 0;
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
			
			for(int y = 0; y < 맵.length; y++) {
				for(int x = 0; x < 맵[y].length; x++) {
					if(맵[y][x] == 2) {
						heart++;
					}					
				}
			}
			
			if(aY == 8 && aX == 8 && heart == 0) {
				break;
			}
			
			if(q1(aX, aY, bX, bY)) {
				aX = bX;
				aY = bY;
			} else {
				bX = aX;
				bY = aY;
			}
		}
	}
}