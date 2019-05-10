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

	public boolean q1(int aX, int aY, int bX, int bY) {
		boolean result = false;
		
		for(int y = 0; y < 맵.length; y++) { 
			for(int x = 0; x < 맵[y].length; x++) {
	
				if(맵[aY][aX] == 0) {
				aY = bY; 
				aX = bX; 
				result = true;
				}
	
	
				if(aY == aX && aY != 8) {
				맵[aY][aX] = 1;
				}
	
				
				if(y == aY && x == aX) {
				System.out.print(" ㉿ ");
				}else if(맵[y][x] == 1) {
				System.out.print(" □ ");
				}else if(맵[y][x] == 2) {
				System.out.print(" ♥ ");
				}else {
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
		q1(aX,aY,bX,bY); 
		
		while(true) {	
			String input = scan.next();
			System.out.println(input.toUpperCase());
			int count = 0;
			
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
			
			if(q1(aX,aY,bX,bY)) { 
			aX = bX;	
			aY = bY;	
			}else {
			bX = aX;
			bY = aY;
			}


			for(int i = 0; i < 맵.length; i++) {
				for(int j = 0; j < 맵[i].length; j++) {
					if(맵[i][j] == 2) {
						count++;
					}
				}
			}

			if(aY == 8 && aX == 8 && count == 0) {
				break;
			}
		}
	}
}