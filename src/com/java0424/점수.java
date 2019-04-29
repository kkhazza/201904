package com.java0424;

public class 점수 {
	
	public String i2(int score) {
		String grade = "";
		
		if(score >= 90) {
			return "A 입니다.";
		} else if(score >= 80) {
			return "B 입니다.";
		} else if(score >= 70) {
			return "C 입니다.";
		} else if(score >= 60) {
			return "D 입니다.";
		} else {
			return "F 입니다.";
		} 
	}

}
