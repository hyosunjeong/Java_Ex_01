package com.biz.ex01;

public class GradeMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intKor;
		int intEng;
		int intMath;
		int intSci;
		
		intKor = 80;
		intEng = 90;
		intMath = 75;
		intSci = 85;
	
		float floatAvg = gradeSum(intKor, intEng, intMath, intSci);
		System.out.println(floatAvg);
		
	}
	public static float gradeSum(int intKor, int intEng, int intMath, int intSci) {
		
		float floatAvg = (intKor + intEng + intMath + intSci)/4;
		
		return floatAvg;
		
	}

}

/* 국어, 영어, 수학, 과학 성적을 저장할 int형 변수 선언
 * 각 과목의 점수를 0~100까지 범위의 임의의 점수를 변수에 저장
 * gradeSum() Method 생성하여, 매개변수 4개를 전달받아 성적평균을 소수점까지 계산
 * main으로 결과를 return 하여 콘솔에 표시 
 * (문제에서는 int형 변수를 사용하라고 나왔지만 실제 평균을 구할때는 int형이 아닌 float형으로 사용하기)
 */
