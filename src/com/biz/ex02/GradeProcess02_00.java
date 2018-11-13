package com.biz.ex02;

public class GradeProcess02_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 5명의 학생 성적을 처리하려고 한다. *for를 이용 5번 실행
		// 2. 각 학생의 국어, 영어, 수학 과학, 국사 과목의 성적을 임의로 설정
		// 3. 총점과 평균 계산
		// 4. 총점은 gradeSum() method를 선언하여 계산을 수행
		
		/* for 문이 시작되기 전에 선언되는 변수는 
		 * for 문이 끝난 다음에 그 값을 참조(읽기)위한 용도로 사용되나
		 * 여기 코드에서는 for문이 끝난 다음에 각 과목의 점수를 참조할 일이 없다.
		 * 그래서 굳이 for문이 시작되기전에 각 과목의 변수를 선언할 필요가 없다.
		int intKor ;
		int intEng ;
		int intMath;
		int intSci ;
		int intHis ;
		*/
		for(int i = 0; i < 5; i++) {
			// int intNum = (int)(Math.random()*(100-50+1))+50;
			int intKor = (int)(Math.random()*(100-50+1))+50;
			int intEng = (int)(Math.random()*(100-50+1))+50;
			int intMath = (int)(Math.random()*(100-50+1))+50;
			int intSci = (int)(Math.random()*(100-50+1))+50;
			int intHis = (int)(Math.random()*(100-50+1))+50;
			
			int intSum = intKor+intEng+intMath+intSci+intHis;
			float floatAvg = (float)intSum / 5.0f;
			
			System.out.println("총점: " +intSum);
			System.out.println("평균: "+floatAvg);
			
		}
	
	}

	
}
