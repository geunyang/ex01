package com.gmail.gaeballza.exec;

import java.util.ArrayList;
import java.util.List;
/*
 * 55이상인 리스트에서 마지막 숫자와 위치찾기
 */
public class Exec11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}

	}
}
