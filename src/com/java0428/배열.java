package com.java0428;

import java.util.Scanner;

public class 배열 {
	
	public void t1() {
		boolean[][] 표 = new boolean[5][5];
		표[0][0] = false;
		표[0][1] = false;
		표[0][2] = false;
		표[0][3] = false;
		표[0][4] = false;
		
		표[1][0] = true;
		표[1][1] = true;
		표[1][2] = true;
		표[1][3] = true;
		표[1][4] = true;
		
		표[2][0] = false;
		표[2][1] = false;
		표[2][2] = false;
		표[2][3] = false;
		표[2][4] = false;
		
		표[3][0] = true;
		표[3][1] = true;
		표[3][2] = true;
		표[3][3] = true;
		표[3][4] = true;
		
		표[4][0] = false;
		표[4][1] = false;
		표[4][2] = false;
		표[4][3] = false;
		표[4][4] = false;
		
		for(int y = 0; y < 표.length; y++) { // 행
			
			for(int x = 0; x < 표[y].length; x++) { // 열
				System.out.print(표[y][x] + "\t");
			}
			System.out.println();
		}
	}
	
	public void t2() {
		int [][] 표 = new int[5][5];
		
		for(int y = 0; y < 표.length; y++) {
			for(int x = 0; x < 표[y].length; x++) {
				if(y % 2 == 0) { // 짝수 (0, 2, 4)
					표[y][x] = 0;
				} else { // 홀수 (1,3)
					표[y][x] = 1;
				}
			}
		}
		
		for(int y = 0; y < 표.length; y++) { // 행		
			for(int x = 0; x < 표[y].length; x++) { // 열
				System.out.print(표[y][x] + "\t");
			}
			System.out.println();
		}
	}
	
	public void t3() {
		
		boolean [][] 표 = new boolean[5][5];
		
		for(int y = 0; y < 표.length; y++) {
			for(int x = 0; x < 표[y].length; x++) {
				if(y == x) { 
					표[y][x] = true;
				} else if(y + x == 4) {					
					표[y][x] = true;
				} else {
					표[y][x] = false; 
				}
				System.out.print(표[y][x] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public boolean t4(int aX, int aY, int bX, int bY) {
		boolean result = false; 
		int[][] 맵 = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,0,0,0,1,0,1,0},
				{0,1,1,0,0,0,1,1,1,0},
				{0,1,0,0,0,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,1,1,1,1,0,1,0},
				{0,0,0,0,0,0,0,0,0,0},
		};
		for(int y = 0; y < 맵.length; y++) { // 행		
			for(int x = 0; x < 맵[y].length; x++) { // 열
	//			if(y * x == 1)
				
				if(맵[aY][aX] == 0) {
					aY = bY;
					aX = bX;
					result = true;
				}			
				
				if(y == aY && x == aX) {
					System.out.print("㉿ ");
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
	
	public void t5() {
		Scanner scan = new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		t4(aX, aY, bX, bY); // 시작을 위하여 필요한 호출 부분
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
			if(t4(aX, aY, bX, bY)) { // 이동을 위하여 호출 부분
				aX = bX;
				aY = bY;
			} else {
				bX = aX;
				bY = aY;
			}
		}
	}

}
