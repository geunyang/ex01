package com.gmail.gaeballza.todo.service.impl;

import com.gmail.gaeballza.todo.util.Line;

public class InputServiceImplV2 extends InputServiceImplV1 {

	public InputServiceImplV2() {
		super();
	}

	@Override
	public String inputContent() {
		while (true) {
			System.out.println("할일(QUIT:종료) >> ");
			String content = scan.nextLine();

			return content;
		}
	}

	@Override
	public Integer selectTodo() {
		System.out.println(Line.dLine(50));
		System.out.println("할일(QUIT:종료) >> ");
		String selectNum = scan.nextLine();
		Integer intNum = 0;
		if (selectNum.equals("QUIT"))
			return -1;
		try {
			intNum = Integer.valueOf(selectNum);
		} catch (Exception e) {
			return null;
		}
		return intNum;
	}
}
