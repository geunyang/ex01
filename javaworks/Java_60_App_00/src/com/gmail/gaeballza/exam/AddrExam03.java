package com.gmail.gaeballza.exam;

import com.gmail.gaeballza.exec.service.AddrServiceV1;
import com.gmail.gaeballza.model.AddressVO;

public class AddrExam03 {
	// 배열에 데이터 추가하는 법
	public static void main(String[] args) {
		
		AddressVO[] addrs = new AddressVO[3];
		
		addrs[0] = AddressVO.builder().name("홍길동").tel("010-0000-0001").build();
		addrs[1] = new AddressVO();
		addrs[1].setName("이몽룡");
		addrs[1].setTel("010-0000-0002");
		addrs[2] = new AddressVO();
		addrs[2].setName("성춘향");
		addrs[2].setTel("010-0000-0003");
		
		AddrServiceV1 addrService = new AddrServiceV1();
		addrService.printAddrList(addrs);
		
		
	}

}
