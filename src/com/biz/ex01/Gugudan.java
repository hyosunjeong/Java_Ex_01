package com.biz.ex01;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i<=9; i++) {
			guguDan(i);
		}

	}
	public static void guguDan(int intDan) {
		
			System.out.println(intDan + "단");
			for(int i = 1; i <=9; i++){
				// System.out.println(intDan);
				System.out.printf("%d * %d = %d\n", intDan, i, intDan *i);
		}	
		System.out.println("==============");
		
			
	}
	
}
