package com.java0425;

public class 구구단 {
	
	public void m1() {

		for(int a = 1; a < 10; a++) {
			System.out.println(a + "단");
			for(int b =1 ; b < 10; b++) {
				int result = a * b;
				System.out.println(a + "x" + b + "=" + result);
			}			
		}
	}
	
	public void m2() {
		
		for(int a = 1; a < 4; a++) 
		{
			System.out.print(a + "단" + "\t");		
		}
		System.out.println("");
		
		for (int b = 1; b < 10; b++) {
            for (int a = 1; a < 4; a++) {
            	int result = a * b;
                System.out.print(a + "x" + b + "=" + result);
                System.out.print("\t");
            }
            System.out.println();
        }	
		
		for(int a = 4; a < 7; a++) 
		{
			System.out.print(a + "단" + "\t");		
		}
		System.out.println("");
		
		for (int b = 1; b < 10; b++) {
            for (int a = 4; a < 7; a++) {
            	int result = a * b;
                System.out.print(a + "x" + b + "=" + result);
                System.out.print("\t");
            }
            System.out.println();
        }	
        
		for(int a = 7; a < 10; a++) 
		{
			System.out.print(a + "단" + "\t");		
		}
		System.out.println("");
		
		for (int b = 1; b < 10; b++) {
            for (int a = 7; a < 10; a++) {
            	int result = a * b;
                System.out.print(a + "x" + b + "=" + result);
                System.out.print("\t");
            }
            System.out.println();
		}	
	}
	
	public void m3() {
		
		for(int a = 1; a < 10; a = a + 3) 
		{
			System.out.print(a + "단" + "\t");		
		}
		System.out.println("");
		
		for (int b = 1; b < 10; b++) {
            for (int a = 1; a < 10; a = a + 3) {
            	int result = a * b;
                System.out.print(a + "x" + b + "=" + result);
                System.out.print("\t");
            }
            System.out.println();
        }	
		
		for(int a = 2; a < 10; a = a + 3) 
		{
			System.out.print(a + "단" + "\t");		
		}
		System.out.println("");
		
		for (int b = 1; b < 10; b++) {
            for (int a = 2; a < 10; a = a + 3) {
            	int result = a * b;
                System.out.print(a + "x" + b + "=" + result);
                System.out.print("\t");
            }
            System.out.println();
        }
		
		for(int a = 3; a < 10; a = a + 3) 
		{
			System.out.print(a + "단" + "\t");		
		}
		System.out.println("");
		
		for (int b = 1; b < 10; b++) {
            for (int a = 3; a < 10; a = a + 3) {
            	int result = a * b;
                System.out.print(a + "x" + b + "=" + result);
                System.out.print("\t");
            }
            System.out.println();
        }			
	}	
}
