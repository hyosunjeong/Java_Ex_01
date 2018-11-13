package com.biz.ex01;

public class GradeMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intKor;
		int intEng;
		int intMath;
		int intSci;
		
		intKor = 90;
		intEng = 88;
		intMath = 75;
		intSci = 66;
		
		//main에서 계산할 총점을 gradeSum()한테 대신 시키기
		int intSum = gradeSum(intKor, intEng, intMath, intSci);
		float floatAvg = intSum /4;
		
		
	}
	public static int gradeSum(int intKor, int intEng, int intMath, int intSci) {
		int intSum = intKor + intEng + intMath + intSci;
		
		return intSum;
	}

}
