package com.gmail.gaeballza.exec;

import java.util.ArrayList;
import java.util.List;

public class ExecApp11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}
		int lastIndex = 0;
		int lastResult = 0;
		int size = nums.size();
		for (int i = 0; i < size; i ++) {
			int num = nums.get(i);
			if (num >= 55) {
				lastIndex = i;
				lastResult = num;
			}
		}
		System.out.printf("%3d : %3d", lastIndex, lastResult);

	}
}
