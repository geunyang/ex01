package com.gmail.gaeballza.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {
	
	// id
	private String tKey;
	// TODO
	private String tContent;
	// 등록일
	private String cDate;
	// 등록시간
	private String cTime;
	//완료일
	private String eDate;
	// 완료시간
	private String eTime;
	// 완료여부(true,false)
	private String bComp;
	
	@Override
	public String toString() {
		
	}

}
