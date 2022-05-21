package com.gmail.gaeballza.exec;

import java.util.ArrayList;
import java.util.List;

/*
 * 55이상인 리스트에서 마지막 숫자와 위치찾기
 * 가장 마지막 값이 변수에 담기는 속성을 이용해 찾는다
 */
public class Exec11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}
		int lastIndex = 0;
		int lastValue = 0;
		int size = nums.size() - 1;
		for (int i = 0; i < nums.size(); i++) {
			int num = nums.get(i);
			if (num >= 55) {
				lastIndex = i;
				lastValue = num;
			}
		}
		System.out.printf("%d 번째 %d 값", lastIndex, lastValue);

	}

}
