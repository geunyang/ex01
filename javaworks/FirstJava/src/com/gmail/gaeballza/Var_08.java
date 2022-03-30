package com.gmail.gaeballza;

public class Var_08 {

	public static void main(String[] args) {
		
		// 1~1000까지 범위중 임의의 수 1개를 생성하여 intNum1에 저장
		int intNum1 = (int)(Math.random() * 1000) + 1;
		int intNum2 = (int)(Math.random() * 1000) + 1;
		
		System.out.printf("%d\n", intNum1);
		System.out.printf("%d\n", intNum2);
		
		System.out.println(" num1 > num2 " + (intNum1 > intNum2));
		System.out.println(" num1 < num2 " + (intNum1 < intNum2));
		System.out.println(" num1 == num2 " + (intNum1 == intNum2));
		
		System.out.println(" num1 <> num2 " + (intNum1 != intNum2));
		
		/*
		 * Literal 값을 명확히 확인할 수 있는값
		 * 일반적인 숫자값 "문자열"
		 * Java에서 리터럴과 리터럴을 비교연산 하는것은 거의 의미가 없다
		 * 때문에 eclipse에서 오류 또는 경고를 보여준다
		 */
		
		System.out.println(30 > 30);
		System.out.println(30 == 30);

	}

}
