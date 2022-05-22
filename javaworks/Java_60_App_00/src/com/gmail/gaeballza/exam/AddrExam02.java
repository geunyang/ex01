package com.gmail.gaeballza.exam;

import com.gmail.gaeballza.exec.service.AddrServiceV1;
import com.gmail.gaeballza.model.AddressVO;

public class AddrExam02 {
	//빌더이용해데이터추가
	public static void main(String[] args) {
		AddressVO hong = AddressVO.builder()
							.name("홍길동")
							.tel("010-0000-0000")
							.addr("서울특별시")
							.build();
		AddrServiceV1 addrService = new AddrServiceV1();
		addrService.printAddr(hong);
	}

}
