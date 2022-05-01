package com.gmail.gaeballza.app.exec;

import java.util.List;

import com.gmail.gaeballza.app.GetValue;

public class Exec5 {

	public static void main(String[] args) {
		
		List<Integer> nums = GetValue.getList(100);
		int lastIndex = 0;
		int max = 0;
		for (int i = 0; i < nums.size(); i ++) {
			int num = nums.get(i);
			if (num > max) {
				max = num;
				lastIndex = i;
			}
		}
		System.out.printf("%3d : %3d\n", lastIndex, max);
		System.out.printf("%3d : %3d\n", lastIndex, nums.get(lastIndex));
		
		int index = nums.indexOf(max);
		System.out.println("가장 큰 수가 가장 처음 나타난 위치" + index);
		
		
		
	}

}
