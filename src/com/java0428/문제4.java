package com.java0428;

import java.util.Scanner;

public class 문제4 {
	int[][] 맵 = {
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 2, 1, 1, 1, 4, 4, 4, 0},
			{0, 1, 2, 1, 3, 1, 1, 1, 4, 0},
			{0, 1, 2, 1, 3, 1, 5, 1, 1, 0},
			{0, 1, 2, 1, 3, 1, 5, 1, 1, 0},
			{0, 1, 2, 1, 3, 1, 5, 1, 1, 0},
			{0, 1, 2, 1, 3, 1, 5, 1, 1, 0},
			{0, 1, 2, 1, 3, 1, 5, 5, 1, 0},
			{0, 1, 1, 1, 3, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 1, 0}
	};

	public boolean q1(int aX, int aY, int bX, int bY) {
		boolean result = false;
		for(int y = 0; y < 맵.length; y++) {
			for(int x = 0; x < 맵[y].length; x++) {
				if(맵[aY][aX] ==  0 || 맵[aY][aX] ==  2 || 맵[aY][aX] ==  3 || 맵[aY][aX] ==  4 || 맵[aY][aX] ==  5) {
					aX = bX;
					aY = bY;
					result = true;
				}
				
				if(y == aY && x == aX) {
					System.out.print(" ㉿ ");
				} else if(맵[y][x] == 2) {
					System.out.print("＠");
				} else if(맵[y][x] == 3) {
					System.out.print(" ♥ ");
				} else if(맵[y][x] == 4) {
					System.out.print(" ▒ ");
				} else if(맵[y][x] == 5) {
					System.out.print(" ▼ ");
				} else if(맵[y][x] == 1) {
					System.out.print(" □ ");
				} else {
					System.out.print(" ■ ");
				} 
			}
			System.out.println();
		}
		return result;
	}
	
	public void q2() {
		Scanner scan = new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		q1(aX, aY, bX, bY);
		
		while(true) {
			String input = scan.next();
			System.out.print(input.toUpperCase());
			
			switch(input.toUpperCase()) {
			case "W":
				aY--;
				break;
			case "S":
				aY++;
				break;
			case "A":
				aX--;
				break;
			case "D":
				aX++;
				break;
			default:
				break;
			}
			
			if(q1(aX, aY, bX, bY)) {
				aX = bX;
				aY = bY;
			}else {
				bX = aX;
				bY = aY;
			}
			
			if(aY == 9 && aX == 8) {
				break;
			}
		}
	}
}