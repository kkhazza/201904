package com.javatest;

import java.util.Scanner;

public class 엘레베이터 {
	int[] elv = {0, 0, 0, 0};
	int 층 = 1;
	
	public void View() {
	
		System.out.println("엘레베이터 상태 [현재층 : " + 층 + "]");
		for(int i = 0; i < elv.length; i++) {
			if(elv[i] == 0) {
				System.out.print("[]");
			}else {
				System.out.println("[★]");
			}
		}		
		System.out.println();
		System.out.println("행동을 입력하세요");
		System.out.println("1.이동 2.탑승 9.종료");
		
	}
	
	public void Push() {	
		Scanner scan = new Scanner(System.in);	
		View();
		String input = scan.next();
		String input2 = scan.next();
		while(true) {
			switch(input) {
			case "1":
				System.out.println("몇층으로 가시겠습니까? [현재층 :" + 층 + "]");
				break;
			case "2":
				System.out.println("어디에 탑승하시겠습니까?[취소 : 9]");
				System.out.println("[0][1][2][3]");
				switch(input2) {
				case "1":
					elv[1] = 1;
					break;
				case "2":
					elv[2] = 1;
					break;
				case "3":
					elv[3] = 1;	
					break;
				case "4":
					elv[4] = 1;
					break;
				case "9":
					break;
				default:
					break;
				}
				break;
			case "3":			
				System.out.println("엘레베이터 운행을 종료합니다.");
				break;
			default:
				break;
			}
		}
	}
	
	public void Move() {
		
	}

}