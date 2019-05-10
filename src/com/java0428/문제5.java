package com.java0428;

import java.util.Scanner;

public class 문제5 {
	
	int[][] 맵  = {
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 2, 1, 1, 1, 0, 0},
			{1, 1, 1, 1, 1, 1, 1, 0},
			{0, 1, 0, 3, 1, 0, 1, 1},
			{0, 0, 0, 0, 0, 0, 0, 0}
	};
	
	public boolean q1(int aX, int aY, int bX, int bY) {
		boolean result = false;
		for(int y = 0; y < 맵.length; y++) {
			for(int x = 0; x < 맵[y].length; x++) {
				if(aX < 0 || aX > 7 || 맵[aY][aX] == 0) {
					aX = bX;
					aY = bY;
					result = true;
				}
				if(y == aY && x == aX) {
					System.out.print(" ㉿ ");
				} else if(y == 1 && x == 2) {
					System.out.print(" ▼ ");
				} else if(y == 3 && x == 3) {
					System.out.print(" ＠ ");
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
	
	public void q2(){
		Scanner scan = new Scanner(System.in);		
		int aX = 0;
		int aY = 2;
		int bX = 0;
		int bY = 2;
		q1(aX, aY, bX, bY);
		
		while(true) {
			String input = scan.next();
			System.out.println(input.toUpperCase());
			
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
			if(q1(aX, aY, bX, bY)) {
				aX = bX;
				aY = bX;
			}else {
				bX = aX;
				bY = aY;
			}
		}
		
		
	}

}
