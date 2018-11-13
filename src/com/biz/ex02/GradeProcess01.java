package com.biz.ex02;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 국어, 영어, 수학, 과학, 국사 과목의 성적을 임의로 설정하고
		// 2. 총점과 평균을 계산하시오. 
		
		int intKor ;
		int intEng ;
		int intMath;
		int intSci ;
		int intHis ;
		
		intKor = scoreMake();
		intEng = scoreMake();
		intMath = scoreMake();
		intSci = scoreMake();
		intHis = scoreMake();
		
		int intSum = (intKor+intEng+intMath+intSci+intHis);
		float floatAvg = (float)intSum / 5;
		// float floatAvg = intSum / 5.0f;
		
		System.out.println("국어: " + intKor);
		System.out.println("영어: " + intEng);
		System.out.println("수학: " + intMath);
		System.out.println("과학: " + intSci);
		System.out.println("역사: " + intHis);
		
		System.out.println("총점: " + intSum);
		System.out.println("평균: " + floatAvg);
		
		System.out.printf("총점:%d, 평균: %f"  , intSum ,floatAvg);
				
	}
	
	public static int scoreMake() {
		return (int)(Math.random()*(100-50+1))+50;
	}
}

