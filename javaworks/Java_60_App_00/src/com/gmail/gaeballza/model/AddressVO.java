package com.gmail.gaeballza.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressVO {
	
	private String name;
	private String addr;
	private String tel;
	private int age;
	private String hobby;

}
