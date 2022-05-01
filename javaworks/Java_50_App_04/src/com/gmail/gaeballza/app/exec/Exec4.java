package com.gmail.gaeballza.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) +1;
			nums.add(num);
		}
		int lastIndex = 0;
		int lastValue = 0;
		int size = nums.size();
		for (int i = 0; i < size; i++) {
			int num = nums.get(i);
			if (num > 54) {
				lastIndex = i;
				lastValue = num;
			}
		}
		System.out.printf("%3d 번째 %3d\n", lastIndex, lastValue);
		
		lastIndex = 0;
		for (int i = 0; i < size; i++) {
			int num = nums.get(i);
			if (num > 54) {
				lastIndex = i;
			}
		}
		System.out.printf("%3d 번째 %3d\n", lastIndex, nums.get(lastIndex));
		
		for (int i = size - 1; i > -1; i --) {
			if (nums.get(i) > 54) {
				System.out.printf("%3d 번째 %3d\n", i, nums.get(i));
				break;
			}
		}

	}

}
