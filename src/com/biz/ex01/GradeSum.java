package com.biz.ex01;

public class GradeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int형 변수 intNum1과 intNum2 선언
		 * 숫자 60과 80을 각 변수에 저장(할당)
		 * 두 변수에 저장된 값을 덧셈하여 intSum 변수를 만들고 저장
		 * intSum의 값을 콘솔에 표시 
		 */
		int intNum1 = 0; // 숫자형 변수를 만들때는 값을 0으로 clear하라
		int intNum2 = 0;
		
		intNum1 = 60;
		intNum2 = 80;
		
		int intSum = (intNum1+intNum2);
		System.out.println(intSum);

	}

}
