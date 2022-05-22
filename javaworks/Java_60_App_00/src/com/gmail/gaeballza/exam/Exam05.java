package com.gmail.gaeballza.exam;

import com.gmail.gaeballza.model.BookVO;

public class Exam05 {
	public static void main(String[] args) {
		BookVO[] bookVO = new BookVO[10];
		for(int i = 0; i < bookVO.length; i++) {
			bookVO[i] = new BookVO();
		}
		int index = 2;
		bookVO[index] = new BookVO();//초기화잊지말것
		bookVO[index].setTitle("자바의정석");
		bookVO[index].setComp("도울출판사");
		System.out.println("도서명:"+bookVO[index].getTitle());
		System.out.println("출판사:"+bookVO[index].getComp());
	}
}
