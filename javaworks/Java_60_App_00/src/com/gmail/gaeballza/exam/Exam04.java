package com.gmail.gaeballza.exam;

import java.util.ArrayList;
import java.util.List;

import com.gmail.gaeballza.model.BookVO;

public class Exam04 {
	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();
		BookVO bookVO = new BookVO();

		for (int i = 0; i < 10; i++) {
			String title = ((int) (Math.random() * 1000) + 100) + "";
			bookVO.setTitle(title);
			bookList.add(bookVO);
		}
		for (BookVO vo : bookList) {
			System.out.println(vo.toString());
		}

	}

}