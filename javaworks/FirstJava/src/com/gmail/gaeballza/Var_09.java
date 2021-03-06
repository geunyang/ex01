package com.gmail.gaeballza;

public class Var_09 {

	public static void main(String[] args) {
		
		// 1~10
		int intNum1 = (int)(Math.random() * 10) + 1;
		int intNum2 = (int)(Math.random() * 10) + 1;
		
		/*
		 * boolean type 변수 선언하고
		 * intNum1, intNum2의 값을 비교하여(>=)
		 * 나타나는 결과(true,false)를 변수에 저장
		 */
		boolean bYes = intNum1 >= intNum2;
		System.out.println(bYes);
		
		/*
		 * 산술연산과 비교연산을 함께 포함하는 연산식(expression)
		 * 1. intNum1 % 2가 연산되고
		 * 2. 그 결과가 0과 같은지 비교연산을 수행한다
		 * 3. 최종적으로 비교 연산 결과를 bEven 변수에 저장
		 * 이 연산산식의 최종결과가 담기는 bEven의 값은
		 * intNum1이 짝수면 true, 짝수가 아니면 false
		 */
		boolean bEven = (intNum1 % 2) == 0;
		System.out.println(bEven);
		
		/*
		 * intNum1에 저장된 값이 3의 배수인가?
		 * drainge3에 담긴 값이 true면 3의 배수이다
		 * 담긴 값이 false면 이 결과를 표현하는데 상당한 어려움이 있다
		 * 그래서 여기에서는 "3의 배수가 아니다"라고 표현한다
		 */
		boolean drainge3 = (intNum1 % 3) == 0;
		System.out.println(drainge3);
		
		
		
	}

}
