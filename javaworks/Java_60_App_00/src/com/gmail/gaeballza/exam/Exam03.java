package com.gmail.gaeballza.exam;

import java.util.ArrayList;
import java.util.List;

import com.gmail.gaeballza.model.BookVO;

public class Exam03 {
	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();
		for (int i = 0; i < 10; i ++) {
			BookVO bookVO = new BookVO();
			bookVO .setTitle("Do it 자바");
			bookVO.setComp("이지즈퍼블리시");
			bookList.add(bookVO);
		}
	}
}
