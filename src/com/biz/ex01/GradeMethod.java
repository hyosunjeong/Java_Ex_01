package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor; // 변수이름 첫글자 소문자
		int intEng; // 변수이름은 의미있는 단어조합
		int intMath;
		
		intKor = 80;
		intEng = 70;
		intMath = 65;
		
		/*int intSum = gradeSum(intKor, intEng, intMath);
		System.out.println(intSum);*/
		
		System.out.println(gradeSum(intKor,intEng,intMath));
		

	} 
	public static int gradeSum(int intKor, int intEng, int intMath){
		
		int intSum = (intKor + intEng + intMath);
		
		return intSum;
		
	}

}


