package com.gmail.gaeballza.exec;

import java.util.ArrayList;
import java.util.List;

public class ExecApp10 {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			int num = (int) (Math.random() * 100) +1;
			nums.add(num);
		}
		int size = nums.size();
		for(int i = 0; i < size; i ++) {
			if(nums.get(i) >= 55) {
				System.out.printf("%3d : %3d", i, nums.get(i));
				break;
			}
		}
	}

}
